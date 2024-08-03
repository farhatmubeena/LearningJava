package ex_20_07_2024;

import java.util.Scanner;

public class lab036 {
    public static void main(String[] args) {
        //import java.lang Math;--->by defolt in very progrAM THIS WILL B Present //import for intrtview
        // grade calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the percentage you have got");
        int score = sc.nextInt();
       // char grade = "f";

        if (score >= 90 && score <= 100){
            System.out.println("A grade");
            System.out.println("congragulations");
        }else if(score >= 80 && score >= 89){
            System.out.println("B grade");
        }else if(score >= 70 && score <= 79){
            System.out.println("C grate");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D grate");
        }else{
            System.out.println("Fail");
        }

    }
}
