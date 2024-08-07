package ex_27_07_2024;

public class lab083 {
    public static void main(String[] args) {
        int a =10;
        while(a<10) {     //here the condition is false (10<10)
            System.out.println(a);   //so nothing will b printed
            a++;

        }

        do {
            System.out.println(a);    //in this do while a will b printed first and nest it will increament and next it will
            //cheak the condition ,if the condition will fail it will only print
            a++;
        } while(a<10);
    }
}
