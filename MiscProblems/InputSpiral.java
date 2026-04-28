package MiscProblems;
import java.util.*;
//Given a positive integer n , generate an n x n matrix filled with elements from 1 to n^2 in spiral order . 
public class InputSpiral {


    static void printArray(int[][] arr){
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }



    static int[][] spiralMatrix(int n ){
        int[][] arr = new int[n][n];
        int topRow = 0 , bottomRow = n-1 , leftCol = 0 , rightCol = n-1;
        // int totalElements = 0 ; 
        int curr = 1; 

        while(curr <= n*n ){
            for(int i=leftCol ; i<= rightCol && curr <= n*n; i++){
                arr[topRow][i] = curr;
                curr++;
            }
            topRow++;

            for(int i= topRow; i<= bottomRow && curr <= n*n ; i++){
                arr[i][rightCol] = curr;
                curr++;

            }
            rightCol--;

            for(int i = rightCol; i>= leftCol && curr <= n*n ; i--){
                arr[bottomRow][i] = curr; 
                curr++;
            }
            bottomRow--;

            for(int i = bottomRow; i>=topRow && curr <= n*n ; i--){
                arr[i][leftCol] = curr;
                curr++;
            }
            leftCol++;



        }
        return arr; 





    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int row , column;
        // System.out.println("Enter row and columns:");
        // row = sc.nextInt();
        // column = sc.nextInt();
        // int[][] matrix = new int[row][column];

        // //Enter elements in the matrix
        // System.out.print("Enter the elements in tha matrix : ");
        // for(int i = 0 ; i< matrix.length; i++){
        //     for(int j=0 ; j< matrix[i].length ; j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        // //Input array 
        // System.out.println("Input array : ");
        // printArray(matrix);

        // //Output traveral 
        // System.out.println("traversal order: ");
        // spiralMatrix(matrix, row, column);


        int n ; 
        System.out.println("Enter the value of n : ");
        n = sc.nextInt();

        int[][] matrix = spiralMatrix( n );

        printArray(matrix);



    }


    
}
