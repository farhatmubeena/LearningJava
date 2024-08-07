package ex_27_07_2024;

import java.util.Scanner;

public class lab074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int i = sc.nextInt();
       // for(int i= 0; i<=100;i++){
            if(i%2==0){
                System.out.println("even ->" +i);
            }else{
                System.out.println("odd ->" +i);
            }
        }
    }

