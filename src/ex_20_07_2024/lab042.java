package ex_20_07_2024;

import java.util.Scanner;

public class lab042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character : ");
        char user_input = sc.next().charAt(0);
        switch (user_input){
            case 'a':
                System.out.println("its an vowel");
                break;
            case 'e':
                System.out.println("its an vowel");
                break;
            case 'i':
                System.out.println("its an vowel");
                break;
            case 'o':
                System.out.println("its an vowel");
                break;
            case 'u':
                System.out.println("its an vowel");
                break;
            default:
                System.out.println("its an consonant");
        }
    }
}
