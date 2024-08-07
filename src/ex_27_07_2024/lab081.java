package ex_27_07_2024;

import java.util.Scanner;

public class lab081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int fact = 1;  //i=1to5 fact= 1*2*3*4*5=120
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }System.out.println(fact);
    }
}
