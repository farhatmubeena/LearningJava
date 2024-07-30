public class lab011 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        //++a --> 11
        //+
        //++a -->12  -->23
        System.out.println(a);
        System.out.println(a++ + a++);
        //a++ =12
        //+
        //a++ = 13  -->25
    }
}
