package logicalque;

public class findsum {
    //find sum of the following series
    // 1-2+3-4+5-6+7-8+9......n
    public static void main(String args[]){
        int total = 0;
        int n = 15;

        for(int i=0 ; i<=n ; i++){
            if(i%2==0){
                total-=i;
            } else {
                total += i;
            }
        }

        System.out.println("The sum of given series is " + total );
    }
}
