package recursion;
import java.util.ArrayList;

public class lecture30{

    public static void multiply(int n , int k ){

        if(k==0){
            return;
        }
        multiply(n,k-1);
        int ans = n*k;
        System.out.println(ans);

    }
    public static void main(String arg[]){
        int n = 12;
        int k = 5;
        multiply(n,k);
        // ArrayList<Integer> arr = new ArrayList<>();
        // // int i = 0;
        // while(k<5){
        //     int ans = nums*k;
        //     arr.add(ans);
        //     k--;

        // }
        // System.out.println(arr);
    }

}