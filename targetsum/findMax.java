package targetsum;

import java.util.Scanner;

public class findMax {

    //find max value in the array
    static int findMaxValue(int[] arr){
        int n = arr.length;
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0 ; i< n ; i++ ){
            if(arr[i] > maxValue){
                maxValue = arr[i];
                
            }

        }
        return maxValue;
    }

    static int findSecondMax(int[] arr){
        int max = findMaxValue(arr);
        for(int i= 0 ; i< arr.length ; i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }

        }

        int secondMax = findMaxValue(arr);
        return secondMax;
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

        System.out.println("Max value: " + findMaxValue(arr));
        System.out.println("Second Max value: " + findSecondMax(arr));

    }
}