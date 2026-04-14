package twoPointers;

public class sortBinaryNo {

    static void swap(int[] arr, int i , int j ){
        int n = arr.length ;
        int temp ; 
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] sortBinaryNo(int[] arr){
        int n = arr.length ; 
        int zeroes= 0 ;
        //count no. of zeroes in the array 
        for(int i=0 ; i<n ; i++){
            if(arr[i]==0){
                zeroes++;
            }

        }

        //push 0 in the starting after counting its numbers
        for(int i = 0; i<n ; i++){
            if(i<zeroes){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }



        return arr;
    }

    static void printArray(int arr[]){
        int n = arr.length;
        for(int i =0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        // int n = 5;
        int[] arr= {0,0,1,1,0,1,1,0,0,1,0,1};
        System.out.println("Before sorting:");

        printArray(arr);
        int[] sort= new int[arr.length];
        sort = sortBinaryNo(arr);
        System.out.println("sorted Binary Numbers:");
        printArray(sort);

    }
}
