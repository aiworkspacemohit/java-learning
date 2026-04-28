package MiscProblems;
import java.util.*;

public class spiralMatirxTraversal {



    static void printArray(int[][] arr){
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }



    static void spiralMatrix(int[][] arr,  int r, int c){
        int topRow = 0 , bottomRow = r-1 , leftCol = 0 , rightCol = c-1;
        int totalElements = 0 ; 

        while(totalElements< r * c){
            for(int i=leftCol ; i<= rightCol && totalElements < r*c; i++){
                System.out.print(arr[topRow][i] + " ");
                totalElements++;
            }
            topRow++;

            for(int i= topRow; i<= bottomRow && totalElements < r*c ; i++){
                System.out.print(arr[i][rightCol] + " ");
                totalElements++;

            }
            rightCol--;

            for(int i = rightCol; i>= leftCol && totalElements < r*c ; i--){
                System.out.print(arr[bottomRow][i] + " ");
                totalElements++;
            }
            bottomRow--;

            for(int i = bottomRow; i>=topRow && totalElements < r*c ; i--){
                System.out.print(arr[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;



        }





    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row , column;
        System.out.println("Enter row and columns:");
        row = sc.nextInt();
        column = sc.nextInt();
        int[][] matrix = new int[row][column];

        //Enter elements in the matrix
        System.out.print("Enter the elements in tha matrix : ");
        for(int i = 0 ; i< matrix.length; i++){
            for(int j=0 ; j< matrix[i].length ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //Input array 
        System.out.println("Input array : ");
        printArray(matrix);

        //Output traveral 
        System.out.println("traversal order: ");
        spiralMatrix(matrix, row, column);


    }
}
