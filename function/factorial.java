package function;
import java.util.*;

public class factorial {
    public static void factorialOfNumber(int n){
        if(n<=0){
            System.out.println("Invalid input.");
            return;

        }
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial = factorial * i;
        }

        System.out.println("The factorial of " + n +" is :" + factorial);
        return;



    }

    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        factorialOfNumber(n);

    }
}
