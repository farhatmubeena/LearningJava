package ex_27_07_2024;

import java.util.Scanner;

public class lab080 {
    public static void main(String[] args) {
        //factorial program
        //2!=2*1=2
        //8!=8*7*6*5*4*3*2*1=...this is called as factorial
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int fact = 1;   //
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println(fact);
        sc.close();
    }
}
