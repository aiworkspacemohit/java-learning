package two_array;
import java.util.*;
public class multiply {


    //Enter 2d array elements
    static void inputElement(int[][] arr, int r, int c){
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i< r; i++){
            for(int j=0 ; j<c ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
    }


    //print array 
    static void printArray(int[][] arr, int r , int c){
        for(int i = 0 ; i< r; i++){
            for(int j=0 ; j<c ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //multiplication of both the array
    static void multiply(int[][] arr1, int[][] arr2, int r1 , int c1, int r2, int c2){

        int[][] arr3 = new int[r1][c2];
        if(c1 == r2){

            for(int i =0 ; i<r1; i++){
                for(int j=0 ; j<c2; j++){

                    for(int k =0 ; k< c1; k++){
                        arr3[i][j] += (arr1[i][k]*arr2[k][j]);  
                    }
                }
            }
        } else {
            System.out.print("dimensions are invalid");
        }

        System.out.println("Multiplication of the given two array will be : ");
        printArray(arr3, r1, c2);

    }

    public static void main(String[] args){

        
        int r1 = 3, c1 =3; 
        int r2 = 3, c2 = 3;
        int[][] arr1 = new int[r1][c1];
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter elements for the first array");
        inputElement(arr1, r1, c1);
        System.out.println("Enter the elements for the second array");
        inputElement(arr2, r2, c2);

        printArray(arr1, r1, c1);
        System.out.println();
        printArray(arr2, r2, c2);


        multiply(arr1,arr2, r1 , c1,  r2, c2);

        
    }
    
}
