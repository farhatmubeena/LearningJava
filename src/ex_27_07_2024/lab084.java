package ex_27_07_2024;

public class lab084 {
    public static void main(String[] args) {
      //by using if condition and for loop
        //FizzBuzz program
        //write a program printing numbers from 1 to 100
        //for the multipule of 3 print fizz instead of number
        //for the multipule of 5 print buzz instead of number
        //for both multipule od 3 and5 print fizzbuzz
        for(int i = 1;i<=100;i++){
            if(i%3==0 && i%5==0) {
                System.out.println("Fizz ->" + i);
            } else if(i%5==0) {
                System.out.println("Buzz ->" + i);
            } else if(i%3==0) {
                        System.out.println("Fizz Buzz ->" + i);
            } else{
                System.out.println(i);
            }
        }
    }
}








