package lecture23;

public class prefixSum {

    static void printArray(int[][] matrix){

        for(int i =0 ; i < matrix.length; i++){
            for(int j =0 ; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }System.out.println();
        }
    }


    //row wise 
    static void prefixSum(int[][] matrix){

        for(int i=0; i < matrix.length ; i++){
            for(int j =1 ; j < matrix[i].length; j++){
                matrix[i][j] = matrix[i][j]+ matrix[i][j-1];
            }
        }
        printArray(matrix);
    }


    //columns wise 
    static void prefixSumCol(int[][] matrix){

        for(int i = 1 ; i < matrix.length; i++){
            for (int j=0 ; j<matrix[i].length; j++ ){
                matrix[i][j] = matrix[i][j] + matrix[i-1][j];
            }
        }

        printArray(matrix);
    }


    //sum of matrix for particular region 
    static int sumOfMatrix(int[][] matrix, int r1, int c1 , int r2 , int c2){

        prefixSum(matrix);
        prefixSumCol(matrix);


        int r = r2-r1;
        int c = c2-c1;
        int ans =0 ; 
        int sum =0 ;
        int left = 0 ; 
        int top = 0 ; 
        int common = 0;
        int total = matrix[r2][c2];
        if(c1>=1){
            left = matrix[r2][c1-1];
        }

        if(r1>=1){
            top = matrix[r1-1][c2];
        }

        if(r1>=1 && c1>=1){
            common = matrix[r1-1][c1-1];
        }

        ans = total - left - top + common;

        sum = ans ;

        return sum;
    }
    public static void main(String[] args){
        int row = 5, col = 5 ; 
        int[][] matrix = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};

        int r1 = 3, r2 = 4, c1 = 3, c2 = 4;



        prefixSum(matrix);

        prefixSumCol(matrix);

        int ans = sumOfMatrix(matrix, r1, c1, r2, c2);
        System.out.print("ans:" + ans );
    }
}
