package number;

public class decimalNo {
    //conversion of binary no. into decimal no. 
    public static void main(String args[]){
        int decimalNo = 13; 
        int ans = 0; 
        int pw = 1; 
        while(decimalNo > 0){

            //13
            int binarydigit = decimalNo%2;
            //1
            ans = ans + (binarydigit*pw);// 0+(1*1)
            decimalNo/=2;
            pw*=10;

        }
        System.out.print("Binary output of the given input is : " + ans);
    }
}
