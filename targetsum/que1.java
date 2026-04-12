package targetsum;
import java.util.*;
public class que1 {
    //find the total numbers of pairs in the array whose sum is equal to the given value x : __


    static int targetsum(int[] arr, int target){

        int n = arr.length;

        int count = 0;

        for(int i = 0 ; i< n ; i++ ){
            for(int j= i+1; j< n; j++){
                if(arr[i] + arr[j] == target){
                    count++ ;
                }

            }
        }

        return count;

    }
    

    public static void main(String[] args){
        int n ;
        System.out.println("Enter the length of the array : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements in the array: ");


        for(int i = 0 ; i<n ; i++ ){
            arr[i] = sc.nextInt();
        }

        int target ;
        System.out.println( " Enter the target value: ");
        target = sc.nextInt();


        System.out.println("Total number of pairs whose sum is equal to the target is : " + targetsum(arr, target));


        
    }
    
}
