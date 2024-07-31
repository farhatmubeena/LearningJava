public class lab017 {
    public static void main(String[] args) {
        String s1 = new String("mubeen");
        String s2 = new String("mubeen");
        //here two strings are created in heap area
        String s3 = s1;
        //here two strings are created and s1 is changed to s3 that is mubeen in heap area
    }
}
