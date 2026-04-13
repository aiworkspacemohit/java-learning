package MiscProblems;

public class inplaceReverseArray {

    static int[] inplaceReverseArray(int[] arr){
        int n = arr.length;
        int i = 0 ;
        int j = n-1;

        while(i<j){
            // arr[i] = arr[j];  swapping operation can be performed here

            swap(arr, i, j);
            i++;
            j--;
        }

        return arr;
    }

    static void swap(int[] arr, int i , int j){

        int temp;
        temp = arr[i];
        arr[i] = arr[j] ;
        arr[j] = temp;

    }
    

    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {4, 5, 6, 2, 7, 8,1 };

        int[] reverse = inplaceReverseArray(arr);

        printArray(reverse);

    }
}
