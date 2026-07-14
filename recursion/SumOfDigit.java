package recursion;

public class SumOfDigit {
    static public int sumofdigit(int n){
        if(n>=0 && n<=9) return n;
        int reduceTheValueToSingleDigit = sumofdigit(n/10);
        int ans = reduceTheValueToSingleDigit + n%10;
        return ans ;
    }

    public static void main(String[] args){
        int n = 12345;
        int ans =sumofdigit(n);
        System.out.println(ans);
    }
}
