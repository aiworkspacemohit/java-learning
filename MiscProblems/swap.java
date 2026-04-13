package MiscProblems;

public class swap {

    static void swapWithoutTemp(int a , int b){

        int x = a;
        int y = b;

        System.out.println("Values before swapping: a : " + a + " b : " + b );

        x = x + y; 
        y = x - y;
        x = x - y;

        System.out.println("Values after swapping: a : " + x + " b : " + y );




        return  ;

    }
    public static void main(String[] args){
        int a = 4;
        int b = 3;

        //swap with extra variable
        // int temp ; 
        // temp = a ;
        // a = b ; 
        // b = temp; 
        // System.out.println( " a = " + a + ": b = "+ b );

        swapWithoutTemp(a, b);
    }
    
}
