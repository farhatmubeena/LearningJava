package ex_20_07_2024;

import java.util.Scanner;

public class lab053 {
    public static void main(String[] args) {
        //fizz and buzz program
        //write a program that prents upto 100 numbers and ites the multipule of 3 then fizz should b prented
        //and when its the multipule of 5 the it should nb prented buzz
        //and when it the multipule of both 3,5 it should prent fizz buzz

        //enter the number
        //logic num/3=0 then fizz
        //logic num/5=0 then buzz
        // //logic num/3=0 && num/5 then fizzbuzz

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
         if(num%3 == 0 ){
             System.out.println("fizz");
         }else if(num%5 == 0){
             System.out.println("buzz");
         } else if (num%3 == 0 && num%5 ==0 ) {
             System.out.println("fizzbuzz");
         }else{
             System.out.println("nothing");
         }


    }
}
