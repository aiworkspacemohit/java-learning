package logicalque;

public class logic1 {
    //count the number of digits for a given number n 
    public static void main(String args[]){
        int n = 2345678;
        int count = 0;
        while(n>0){
            n = n/10;
            count++;


        }

        System.out.println("The number of digits in the given number is " + count);

    }
}
