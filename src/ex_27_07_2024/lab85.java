package ex_27_07_2024;

import java.util.Scanner;

public class lab85 {
    public static void main(String[] args) {
        //right trianglestar pattern
       // ****
      //***
      //**
      //*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of coloms");
        int n = sc.nextInt();
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
