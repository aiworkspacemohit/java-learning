package recursion;

public class fibonacci {
    static int fibo(int n ){
        if(n==0||n==1) return n;
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args){
        int n = 8;
        int ans = fibo(n);
        System.out.println(ans);

        System.out.println("First nth fibonacci series : ");
        for(int i = 0 ; i< n ; i++){
            System.out.println(fibo(i));
        }
    }
}