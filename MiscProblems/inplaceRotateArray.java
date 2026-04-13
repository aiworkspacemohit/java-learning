package MiscProblems;
import java.util.*;

public class inplaceRotateArray {

    static void swap(int[] arr, int i , int j){
        int temp ;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i , int j) {
    
        while (i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
        

    }

    static void inplaceRotateArray(int[] arr ,int k){
        int n = arr.length;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k , n-1);
        reverse(arr, 0 , n-1);


    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = arr.length;
        // int m = arr[0];

        k = k%7;
        inplaceRotateArray(arr, k);

            

        for( int i= 0 ; i< n ; i++){
            System.out.print(arr[i] + " ");
        }




    }
}
