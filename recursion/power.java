package recursion;

public class power {

    public static int powMultiple(int p , int pow){
        if(pow == 0){
            return 1;
        }
        int ans = powMultiple(p , pow -1) * p;
        return ans;
    }

    public static int lessComp(int p , int pow){
        if(pow ==0){
            return 1;
        }
        // int ans = 0 ;
        int halfPow = lessComp(p, pow/2);
        if(pow%2 == 0){
            return halfPow*halfPow;
        } else {
            return p*halfPow*halfPow;
        }
    }
    
    //count the digits in a number 
    public static int countDigits(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        int n = 5;
        int pow = 6;
        int ans = lessComp(n, pow);
        System.out.println(ans);

        int count = countDigits(12345);
        System.out.println(count);

    }

    

    
}
