package practice_day_2;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("Enter first number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();

        int sum = a+b;
        System.out.println(sum);


    }
}
