package cd_practical;

/**
 * Implementation of Syntax Directed Translation (SDT)
 * This class uses semantic rules to evaluate expressions with digits, +, and *.
 */
public class SemanticRules { // Renamed to PascalCase

    private String input;
    private int pos = -1, ch;

    // Helper to move to the next character in the string
    private void nextChar() {
        ch = (++pos < input.length()) ? input.charAt(pos) : -1;
    }

    // Helper to skip whitespace and consume expected characters
    private boolean eat(int charToEat) {
        while (ch == ' ') nextChar();
        if (ch == charToEat) {
            nextChar();
            return true;
        }
        return false;
    }

    /**
     * Semantic Rule for Expression (E): Handles Addition
     * Grammar: E -> E + T | T
     */
    private double parseExpression() {
        double x = parseTerm(); 
        for (;;) {
            if (eat('+')) {
                x += parseTerm(); // Semantic Action: Addition
            } else {
                return x;
            }
        }
    }

    /**
     * Semantic Rule for Term (T): Handles Multiplication
     * Grammar: T -> T * F | F
     */
    private double parseTerm() {
        double x = parseFactor(); 
        for (;;) {
            if (eat('*')) {
                x *= parseFactor(); // Semantic Action: Multiplication
            } else {
                return x;
            }
        }
    }

    /**
     * Semantic Rule for Factor (F): Handles Numbers and Parentheses
     * Grammar: F -> (E) | digit
     */
    private double parseFactor() {
        if (eat('(')) { 
            double x = parseExpression();
            if (!eat(')')) throw new RuntimeException("Missing closing parenthesis");
            return x;
        }

        int startPos = this.pos;
        if ((ch >= '0' && ch <= '9') || ch == '.') { 
            while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
            return Double.parseDouble(input.substring(startPos, this.pos));
        }
        
        throw new RuntimeException("Unexpected character: " + (char)ch);
    }

    public double calculate(String str) {
        if (str == null || str.isEmpty()) return 0;
        this.input = str;
        this.pos = -1;
        nextChar();
        double result = parseExpression();
        
        if (pos < input.length()) {
            throw new RuntimeException("Unexpected trailing characters: " + input.substring(pos));
        }
        return result;
    }

    public static void main(String[] args) {
        // Constructor name now matches the Class name
        SemanticRules evaluator = new SemanticRules();
        
        String expr1 = "10 + 5 * 2"; 
        String expr2 = "(10 + 5) * 2"; 

        System.out.println("--- Semantic Evaluator Results ---");
        System.out.println("Input: " + expr1 + " | Result: " + evaluator.calculate(expr1));
        System.out.println("Input: " + expr2 + " | Result: " + evaluator.calculate(expr2));
    }
}