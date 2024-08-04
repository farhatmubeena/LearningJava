package ex_20_07_2024;

import java.util.Scanner;

public class lab051 {
    public static void main(String[] args) {
        //program to find largest between three
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        System.out.println("enter second number");
        System.out.println("enter third number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + "num1 is greater");
        }else if(num2>=num1 && num2>=num3){
            System.out.println(num2 + "num2 is greater");
        }else {
            System.out.println("num3 is greater");
        }
    }
}
