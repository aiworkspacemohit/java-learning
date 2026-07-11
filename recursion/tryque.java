package recursion;

public class tryque {
    static void printNto1(int n ){
        if ( n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }
    public static void main(String[] args){
        int n = 5 ; 
        printNto1(n);

    }
}
