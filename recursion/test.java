package recursion;
import java.util.*;
public class test {

    static void printIncreasing(int n ) {
        if (n ==1){
            System.out.println(n);
            return; 
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        printIncreasing(n);


    }
}
