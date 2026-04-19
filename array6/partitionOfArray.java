package array6;
import java.util.*;

public class partitionOfArray {
    //check if we can partition the array into two subarrays with equal sum. 
    // More fromally , check that the prefix sum of a part of the array is equal to the suffix sum of rest of the array.
    static int findArraySum(int[] arr){
        int n = arr.length;
        int totalSum = 0 ;
        for(int i=0; i<n ; i++){
            totalSum = totalSum + arr[i];

        }
        return totalSum;
    }

    static boolean equalSumArray(int[] arr){
        int n = arr.length;
        int totalSum = findArraySum(arr);
        int prefSum = 0;

        for(int i= 0; i<n ; i++){
            prefSum += arr[i];
            int SuffixSum = totalSum - prefSum;
            if(prefSum== SuffixSum){
                return true;
            }
        }

        return false;



    }




    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n ;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements in the array:");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Equal partition possible:" + equalSumArray(arr));

    }


}
