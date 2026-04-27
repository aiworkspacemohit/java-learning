package two_array;
import java.util.*;

public class transpose {    
    //print 2d array 
    public static void printArray(int[][] arr, int row, int col){
        for(int i=0 ; i< row; i++){
            for(int j=0 ; j< col; j++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }

    //swap two index of an array 
    public static void swap(int[][] arr, int i , int j){
        int temp;
        temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }


    //transpose of 2d array 
    public static void transpose(int[][] arr, int r , int c){

        for(int i =0 ; i< r; i++){
            for(int j=i ; j<c ; j++){
                swap(arr, i , j);
            }
        }
        printArray(arr , r, c);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = 3, c = 3;
        int[][] arr = new int[r][c];

        for(int i = 0 ; i< r ; i++){
            for(int j=0 ; j< c ; j++){
                arr[i][j] = sc.nextInt();
                 
            }
            
        }

        printArray(arr, r, c);
        transpose(arr, r , c);


    }
    
}
