package MiscProblems;
import java.util.*;
public class freqArray {


    static int[] inplaceReverseArray(int[] arr){
        int n = arr.length;
        int i = 0 ;
        int j = n-1;

        while(i<j){
            // arr[i] = arr[j];  swapping operation can be performed here

            swap(arr, i, j);
            i++;
            j--;
        }

        return arr;
    }

    static void swap(int[] arr, int i , int j){

        int temp;
        temp = arr[i];
        arr[i] = arr[j] ;
        arr[j] = temp;

    }
    

    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static int[] freqArray(int[] arr){
        int n = arr.length;
        int[] freq = new int[100005];

        for(int i=0; i<n ; i++) { 
            freq[arr[i]] += 1;
        }

        return freq;

    }

    public static void main(String[] args){
        int[] arr = {4, 5, 6, 2, 7, 8,1 };

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        int[] freq = freqArray(arr);

        while(q>0){

            System.out.println("Enter number to be searched:");
            int x = sc.nextInt();

            if(freq[x]>0){
                System.out.println("Yes the the query value is present in the array: ");
            } else {
                System.out.println("No. it is not present in the array:");
            }


            q--;
        }
    


        // int[] reverse = inplaceReverseArray(arr);

        // printArray(reverse);

    }
}

    







