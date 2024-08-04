package ex_20_07_2024;

import java.util.Scanner;

public class lab047 {
    public static void main(String[] args) {
        //writing a program of your name,age and salary

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name");
        String name = sc.next();

        System.out.println("enter your age ");
        int age = sc.nextInt();

        System.out.println("enter your salary");
        double salary = sc.nextDouble();

        System.out.println("your name is " + name);
        System.out.println("your age is " + age);
        System.out.println("your salara is "+ salary);
        sc.close();
    }
}
