public class lab006 {
    public static void main(String[] args) {
        long phone = 938l;
        //Short num = phone_no; //jvm cant convert it is called as implicit narrowing conversion
        //if u really want to do   ,do this
        short n1 = (short) phone;
        System.out.println(n1);
    }
}
