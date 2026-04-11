package que;
import java.util.*;
public class first {
    public static void main(String[] args){
        //count the number of elements strictly greater than value x
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println( " Enter the elements in the array: ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            
        }

        System.out.println("Enter the value to compare: ");
        int x = sc.nextInt();

        int count = 0 ;

        for(int j=0 ; j< arr.length ; j++){
            if ( arr[j]>x){
                count++;


            }

        }

        System.out.print("Total values present in the array greater than the given value : " + count);



    }
    
}
