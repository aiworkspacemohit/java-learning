package twoPointers;
import java.util.*;

public class odd_even_sorting {

    //Method to print array
    static void printArray(int[] arr){
        int n = arr.length;
        for( int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int a , int b ){
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //sort using two pointers
    static void sort_odd_and_even(int[] arr){

        int n =arr.length;
        int i= 0;
        int j =n-1;
        
        while(i<j){
            if(arr[i]%2==1 && arr[j]%2==0){
                swap(arr, i,j);
                i++;
                j--;
            } 
            if(arr[i]%2==0){
                i++;
            }
            if(arr[j]%2==1){
                j--;
            }
            
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array ");
        for (int i =0 ; i< n ; i++){
            arr[i] = sc.nextInt();

        }

        System.out.println("Before sorting");
        printArray(arr);
        System.out.println("After Sorting");
        sort_odd_and_even(arr);
        printArray(arr);



    }
}

    

