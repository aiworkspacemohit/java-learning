package recursion;

public class factorial {
    static int fact(int n){
        if (n == 0) {
            return 1;
        }
        int ans=fact(n-1) * n;
        return ans;

    }
    public static void main(String[] args){
        int n = 5;
        int ans = fact(n);
        System.out.println("Factorial of given number is : ");
        System.out.println(ans);

    }
}
