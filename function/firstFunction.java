package function;
import java.util.*;
public class firstFunction {
    public static void printNameByFunction(String name){
        System.out.println("The name you Entered is : " + name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String name = sc.nextLine();
        printNameByFunction(name);
    }
}
