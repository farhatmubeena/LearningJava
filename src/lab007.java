public class lab007 {
    public static void main(String[] args) {
        int course = 100;
        float gst = 18.45f;
        //int total_prise = course+ (int) gst;//implicit narrowing jvm will not allow

        //or use float or double
        //like
        double total = course+gst;
        System.out.println(total);



    }
}
