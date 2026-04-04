package number;

public class binarydigit {  
    //conversion of binary digits into decimal digits 
    public static void main(String args[]){
        
        int input = 1101;
        int ans = 0 ;
        int pw = 1;
        while(input>0){
            //input 1101 
            int lastdigit = input%10 ;
            ans = ans + (lastdigit * pw); //1
            
            input/=10;
            //input 110
            pw*=2;



        }

        System.out.println("conversion of binary input into decimal number is : " + ans);
    }
    
}
