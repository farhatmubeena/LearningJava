package ex_20_07_2024;

import java.util.Scanner;

public class lab039 {
    public static void main(String[] args) {
        //a ptogram that classifies the triange based on the side length
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side 1");
        System.out.println("enter the side 2");
        System.out.println("enter the side 3");
        int lenght_1 = sc.nextInt();
        int lenght_2 = sc.nextInt();
        int lenght_3 = sc.nextInt();
        if (lenght_1 == lenght_2 && lenght_2 == lenght_3 ){
            System.out.println("equilatoral triange");
        } else if (lenght_1 == lenght_2 && lenght_2 != lenght_3) {
            System.out.println("isolatoral triangle");
        }else if(lenght_1 != lenght_2 && lenght_2 != lenght_3 && lenght_3 != lenght_1){
            System.out.println("scaler triangle");
        }
    }
}
