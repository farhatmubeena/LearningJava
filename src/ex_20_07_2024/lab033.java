package ex_20_07_2024;

import java.util.Scanner;

public class lab033 {
   public static void main(String[] args) {

        Scanner num = new Scanner(System.in);//100  //this is the class that we can creat
        System.out.println("enter a number");  //if i enter 100 it will aotomatically assigned to user_input
        int user_input = num.nextInt();   //this .nextInt will give the output,assign the value in user_input   ,this part will help us to take the input and assigning to user_input
        System.out.println(user_input);
        if (user_input%2 == 0){
         System.out.println("even");
        }else{
         System.out.println("odd");
      }
    }
    //line 25 says we are using a scanner class reference and i am using a function ,whatever the user is entering will b putting in user_input
        //cheaking from user and cheaking wheather its an odd r even number
        //1.logical building
        //2.data type
        //3.taking input through scanner class
        //4.nextInt-->input   will give integer value
        //5.rough logic -->num% == 0 even ,num% == 1 odd
        //optimise
}
