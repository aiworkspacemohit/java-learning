package logicalque;

public class reverseNo {
    //reverse the digits of a no.
    public static void main(String args[]){
        int n = 235367;
        int digits = n; 
        int reverse = 0;
        while(digits>0){
            reverse = reverse*10 + digits%10;
            digits/=10;


        }
        System.out.println("Reverse of a given number is : " + reverse);
    }
}
