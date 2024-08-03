package ex_20_07_2024;

import java.util.Scanner;

public class lab35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number :");
        int num1 = sc.nextInt();
        System.out.println("enter second number :");
        int num2 = sc.nextInt();

        System.out.println(Math.max(num1,num2));
    }
}
