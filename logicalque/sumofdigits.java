package logicalque;

public class sumofdigits {
    //find the sum of digits in a given number n 
    public static void main(String args[]){
        int n = 84579302;
        int digits = n;
        int sum = 0;
        while(digits>0){
            sum = sum + digits%10;
            digits = digits/10;
        }
        System.out.println("Sum of digits of a given number is " + sum);
    }
}
