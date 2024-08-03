package ex_20_07_2024;

import java.util.Scanner;

public class lab034 {
    public static void main(String[] args) {
        //maximun number of two numbers
        Scanner max = new Scanner(System.in);//here class is created
        System.out.println("enter a number :");
        int num1 = max.nextInt();

        System.out.println("enter a number :");
        int num2 = max.nextInt();

        if (num1 > num2) {
            System.out.println("num1 is geater ");
        } else if(num1 < num2) {
            System.out.println("num2 is gearter");
        }else{
            System.out.println("equal");
        }
    }
}