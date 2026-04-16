package array6;

public class prefixSum {

    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];

        for(int i =1; i<n ; i++){
            pref[i] = pref[i-1] + arr[i];
        }

        return pref;
    }

    static void printArray(int[] arr){
        int n = arr.length;
        for(int i =0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        // int n = 5;
        int[] arr= {1,2,3,4,5,6};
        int[] pref = makePrefixSumArray(arr);
        printArray(arr);
        printArray(pref);


    }
    
}
