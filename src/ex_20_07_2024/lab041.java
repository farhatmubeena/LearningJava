package ex_20_07_2024;

import java.util.Scanner;

public class lab041 {
    public static void main(String[] args) {
        //web automation
        //i will ask which browser i want to run
        //chrome -> start chrome ->fire fox ->fire fox,edge  ->execution edge

        Scanner sc = new Scanner(System.in);
        System.out.println("enter browser name = ");
        String  browser_name = sc.next();
        browser_name = browser_name.toLowerCase();

        switch(browser_name){
            case "chrome":
                System.out.println("your are in chrome browser");
                break;
            case "firefox":
                System.out.println("your are in firefox browser");
                break;
            case "execution_edge":
                System.out.println("your are in execution_edge browser");
                break;
            case "google":
                System.out.println("your are in google browser");
                break;
            default:
                System.out.println("i dont konw which browser it is ");
                break;
        }

    }
}
