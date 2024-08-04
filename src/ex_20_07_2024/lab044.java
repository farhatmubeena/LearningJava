package ex_20_07_2024;

public class lab044 {
    public static void main(String[] args) {
        //instead of break we can use ->
        int iteams = 003;
        switch(iteams){
            case 001 -> System.out.println("its an iphone");
            case 002 -> System.out.println("its an laptop");
            case 003 -> System.out.println("its an laptop"); //upgraded in this we dont need the break in java 17
            default -> System.out.println("none");  //it is just foe one liner


        }
    }
}
