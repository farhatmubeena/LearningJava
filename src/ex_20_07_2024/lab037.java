package ex_20_07_2024;

import java.util.Scanner;

public class lab037 {
    public static void main(String[] args) {
        //import java.lang Math;--->by defolt in very progrAM THIS WILL B Present //import for intrtview
        // grade calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the percentage you have got");
        int score = sc.nextInt();
         char grade = 'f';

        if (score >= 90 && score <= 100){
            grade = 'a';
        }else if(score >= 80 && score <= 89){
            grade = 'b';
        }else if(score >= 70 && score <= 79){
            grade = 'c';
        } else if(score >= 60 && score <= 69) {
            grade = 'b';
        }else {
            grade = 'f';

        }
        System.out.println("your grate "+grade);
    }
}
