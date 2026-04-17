package array6;
import java.util.*;
public class queriesBasedSum {

    //question : Given an array of integer of size n . Answer q queries where you need to print the sum of values in a given range of indices from l to r (both included).
    //Note. the values of l and r in queries follow l based indexing.

    static int[] prefixSumArray(int[] arr){
        int n = arr.length;
        for (int i = 1 ; i< n ; i++){
            arr[i] = arr[i-1] + arr[i];
        }

        return arr;
    }

    static int[] queriesBasedSum(int[] arr, int l,int r){

        int n = arr.length;
        for(int i = l; i<=r; i++){
            arr[i] = arr[i] + arr[i-1];
        }

        // printArray(arr);

        return arr;
    }

    static void printArray(int[] arr){
        int n = arr.length;
        for (int i=0; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n ; 
        System.out.println("Enter the size of the array :");
        n = sc.nextInt();

        int[] arr = new int[n+1];

        System.out.println("Enter the values in the array");
        for(int i =1 ; i<= n ; i++){
            arr[i] = sc.nextInt();

        }

        

        System.out.println("Enter the number of queries:");
        int q; 
        q = sc.nextInt();
        int[] pref = prefixSumArray(arr);

        while(q>0){

            System.out.println("Enter the indices for the sum of particular portion of the array:");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum = pref[r] - pref[l-1];
            System.out.println("sum of l to r is : " + sum);
            q--;

        }


    }
}
