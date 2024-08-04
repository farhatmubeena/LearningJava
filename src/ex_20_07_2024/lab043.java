package ex_20_07_2024;

import java.util.Scanner;

public class lab043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the code");
        int user_input = sc.nextInt();
        switch(user_input){
            case 001,002,003:
                System.out.println("its an electronic gaget");
                break;
            case 004,005,006:
                System.out.println("its an electronic gaget");
                break;
            default:
                System.out.println("it not related to electronics");
        }
    }
}
