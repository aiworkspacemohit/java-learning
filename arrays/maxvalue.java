package arrays;

public class maxvalue {
    public static void main(String args[]){
        int[] value = {3, 5 ,2 , 41, 56, 39, 33, 21, 57};
        int ans = 0 ; 

        for(int i = 0 ; i< value.length ;i++ ){

            if(value[i] > ans){
                ans = value[i];
            }

        }

        System.out.print("Largest value in the given array is : " + ans);
    }
}
