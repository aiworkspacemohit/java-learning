package cd_practical;
import java.util.*;

public class codeGenerator {
    
    // Parsing Table: State -> Map(Symbol, Action)
    private static final Map<Integer, Map<String, String>> actionTable = new HashMap<>();
    private static final Map<Integer, Map<String, Integer>> gotoTable = new HashMap<>();

    static {
        // Grammar: 0: E->E+T, 1: E->T, 2: T->id
        actionTable.put(0, Map.of("id", "S2"));
        actionTable.put(1, Map.of("+", "S3", "$", "Acc"));
        actionTable.put(2, Map.of("+", "R2", "$", "R2")); // T -> id
        actionTable.put(3, Map.of("id", "S2"));
        actionTable.put(4, Map.of("+", "R0", "$", "R0")); // E -> E+T
        
        // Goto logic based on state remaining after popping
        gotoTable.put(0, Map.of("E", 1, "T", 1)); // State 0 after T or E goes to 1
        gotoTable.put(3, Map.of("T", 4));          // State 3 after T goes to 4
    }

    public static void parse(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0); // Initial state
        int i = 0;

        System.out.println("Stack\t\tInput\t\t\tAction");
        System.out.println("------------------------------------------------------");

        while (i < tokens.length) {
            int state = stack.peek();
            String symbol = tokens[i];
            
            // Check if action exists for current state and symbol
            if (!actionTable.containsKey(state) || !actionTable.get(state).containsKey(symbol)) {
                System.out.println("\nError: Unexpected symbol '" + symbol + "' at state " + state);
                return;
            }

            String action = actionTable.get(state).get(symbol);
            System.out.print(String.format("%-15s %-20s ", stack, Arrays.toString(Arrays.copyOfRange(tokens, i, tokens.length))));

            if (action.startsWith("S")) {
                int nextState = Integer.parseInt(action.substring(1));
                stack.push(nextState);
                System.out.println("Shift to " + nextState);
                i++;
            } 
            else if (action.startsWith("R")) {
                int rule = Integer.parseInt(action.substring(1));
                
                // Determine LHS and how many states to pop
                String lhs;
                int popCount;
                
                if (rule == 0) { // E -> E + T
                    lhs = "E";
                    popCount = 3;
                } else if (rule == 2) { // T -> id
                    lhs = "T";
                    popCount = 1;
                } else { // Rule 1: E -> T
                    lhs = "E";
                    popCount = 1;
                }

                // Pop states
                for (int j = 0; j < popCount; j++) {
                    stack.pop();
                }
                
                // Use GOTO table with the state that is now at the top
                int stateAfterPop = stack.peek();
                stack.push(gotoTable.get(stateAfterPop).get(lhs));
                
                System.out.println("Reduce by Rule " + rule + " (GOTO " + stack.peek() + ")");
            } 
            else if (action.equals("Acc")) {
                System.out.println("Accept!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        // Sample input must end with $
        String[] input = {"id", "+", "id", "$"};
        parse(input);
    }
}