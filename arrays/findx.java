package arrays;
import java.util.*;
public class findx {
    public static void main(String args[]){
        int[] numbers = new int[10];

        Scanner sc = new Scanner(System.in);
        for(int i=0; i< numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to find in the array: ");

        int x = sc.nextInt();

        for(int i=0; i< numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("The number is present at index " + i);
            }
        }


    }
}
