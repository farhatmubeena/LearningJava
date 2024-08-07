package ex_27_07_2024;

public class lab072 {
    public static void main(String[] args) {
        for(int i = 0;i<=10;i++){    //i=0to9, and it runs 10 times.
            System.out.println(i);
            if(i==5){
                continue;    //it this is true go back and it will  contine but will not go to down line means the
                // below line will not b printed
            }///5 will not print after!!! because of continue key word
            System.out.println("after!!!");
        }
    }
}
