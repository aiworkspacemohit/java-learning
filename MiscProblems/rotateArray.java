package MiscProblems;

public class rotateArray {

    static int[] rotateArray(int[] arr, int k ) {
        int n = arr.length;
        int[] ans = new int[n];
        k= k%n;
        int j = 0 ; 

        for(int i = n-k; i < n ; i++){
            ans[j++] = arr[i];

        }

        for(int i = 0 ; i < n-k ; i++) {
            ans[j++] = arr[i];
        }

        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 3 ; // rotating value 

        int[] rotate = rotateArray(arr, k);
        System.out.print("Rotated array : " );
        for(int i = 0 ; i< rotate.length; i++) {
            System.out.print(rotate[i] + " ");
        }


    }
}
