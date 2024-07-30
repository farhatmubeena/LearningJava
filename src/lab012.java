public class lab012 {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(++a + a++ + a++);
        //++a = 11
        //a++ = 11
        //a++ = 12  --> 34
        System.out.println(a);
    }
}
