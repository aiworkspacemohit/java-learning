package function;
import java.util.*;
public class sum {
    public static int sumOfTwoNumbers(int a, int b){
        int sum = a + b;
        return sum;

    }

    public static void main(String[] args) {
        int a ; 
        int b ;
        System.out.println("Enter first number : ");
        Scanner sc1 = new Scanner(System.in);
        a = sc1.nextInt();

        System.out.println("Enter second number : ");
        // Scanner sc2 = new Scanner(System.in);
        b = sc1.nextInt();

        int result = sumOfTwoNumbers(a, b);
        System.out.println("The sum of two numbers is : " + result);


    }
}
