package multiArray;
import java.util.*;
public class multiply {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r1 = 2;
        int c1 = 3;

        int r2 = 3;
        int c2 = 2;

        int[][] arr1 = new int[r1][c1];
        int[][] arr2 = new int[r2][c2];

        System.out.println("Enter the element in 1st array:");
        //add element in 1st array
        for(int i=0; i<r1;i++){
            for(int j=0; j<c1; j++){
                arr1[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        
        System.out.println("Enter the element in 2nd array:");
        //add element in second array
        for(int i=0; i<r2; i++){
            for(int j= 0 ; j<c2; j++){
                arr2[i][j] = sc.nextInt();
            }
            System.out.println();
        }


        int[][] mul = new int[r1][c2];
        for(int i = 0 ; i<r1 ; i++){
            for(int j=0 ; j<c2 ; j++){
                //mul = ith row of a and jth col of b 
                for(int k=0; k<c1; k++){
                    mul[i][j] = (arr1[i][k]* arr2[k][j]);

                }
            }
        }

        for(int i=0; i<r2; i++){
            for(int j= 0 ; j<c2; j++){
                System.out.println(mul[i][j] );
            }
            System.out.println();
        }







        
    }
}
