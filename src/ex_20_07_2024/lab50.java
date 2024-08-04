package ex_20_07_2024;

import java.util.Scanner;

public class lab50 {
    public static void main(String[] args) {
        //writting a program to find wheather the program is positive or negative or zero
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int user_input = sc.nextInt();
         if(user_input>0){
             System.out.println("positive");
         } else if (user_input<0) {
             System.out.println("negative");

         }else {
             System.out.println("zero");
         }
    }
}
