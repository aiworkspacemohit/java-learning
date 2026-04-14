package twoPointers;
import java.util.*;
public class sortUsingTwoPointers {

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
    static void sortUsingTwoPointers(int[] arr){

        int n =arr.length;
        int i= 0;
        int j =n-1;
        
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                swap(arr, i,j);
                i++;
                j--;
            } 
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
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
        System.out.println("Enter the elements in the array in 1's or 0's format");
        for (int i =0 ; i< n ; i++){
            arr[i] = sc.nextInt();

        }

        System.out.println("Before sorting");
        printArray(arr);
        System.out.println("After Sorting");
        sortUsingTwoPointers(arr);
        printArray(arr);



    }
}
