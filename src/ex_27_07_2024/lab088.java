package ex_27_07_2024;

public class lab088 {
    public static void main(String[] args) {
        //functions  are:
        //Block of code which we can reuse..functions are of two types
        //pre built funtions,and user define functions
        ;  //here max is a prebuild function    //
        //Two component of functions
        //1.Define
        //2.Call the function
        //lets creat a function
        //calling the function
        for(int i=0;i<=5;i++) {   //here instead of dublicating we can use for loop
            // green();
            green();//if i dublicute this it will print two times
        }
            green2();
//first JVM calles main function//
        //then it sawthere is a function
        //and then it will go to  ,where it is defined
        //sout line will executed
    }
        static void green() {    //brackets will define the function
            //and this is the code that will execute
            //void basically means it doent return anything
            System.out.println("hi jeelu ,how are you baby");

        }
            static void green2(){
                System.out.println("hi jeelu ");
            }



}
//functions can b reused and called multipule times
//void basically means no return
//we cant write this in main function because function with in function not possibule