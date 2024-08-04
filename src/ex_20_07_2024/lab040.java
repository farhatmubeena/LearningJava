package ex_20_07_2024;

import java.util.Scanner;

public class lab040 {
    public static void main(String[] args) {
        //if else condition we have learned for multipul condition
        //if u have more than two conditions use switch
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day number ,i will say the day name");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thuresday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("i dont know which day it is.");
        }
                System.out.println("this is out side the switch");

    }
}
