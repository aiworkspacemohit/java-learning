package targetsum;

import java.util.Scanner;

public class findunique {
    //finding unique value in the array 
    static int findUnique(int[] arr){
        int n = arr.length;

        int unique = -1;
        for(int i = 0 ; i<n ; i++){
            for(int j=i+1; j<n ; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1 ;
                    arr[j] = -1 ; 

                }
            }
        }
        for(int i=0 ; i<n ; i++) {
            if (arr[i]>=0){
                unique = arr[i];
                System.out.println("Unique element in the array : " + unique + " having index " + i);
                // return unique;
            }
        }
        return unique;
    
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

        // int ans = findUnique(arr);
        // System.out.println("unique value is : " + ans);

        findUnique(arr);


    }
}
