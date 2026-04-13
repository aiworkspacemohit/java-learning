package MiscProblems;

import java.util.*;

public class reverseArray {

    //print array method 
    static void printArray(int[] arr){

        for(int i= 0 ; i < arr.length; i++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    //Reverse the given array 
    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n]; ; 
        int j = 0 ;
        for(int i= n-1 ; i >= 0 ; i--){
            ans[j++] = arr[i];
        }
        return ans;
    }
    


    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Give inputs to the array : ");

        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }

        printArray(arr);

        //Reverse array
        System.out.println("Reversed array will be : " );
        int[] newArray = reverseArray(arr);

        printArray(newArray);




        



    }
}
