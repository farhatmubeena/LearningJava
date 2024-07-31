public class lab021 {
    public static void main(String[] args) {
        String name_1 = new String("Zaid");
        String name_2 = new String("Zaid");
        String name_3 = new String("Zaid");
        System.out.println(name_1 == name_2); //here it will cheak reference  it will have differente locations
        System.out.println(name_2 == name_3);
        System.out.println(name_3 == name_1);
        System.out.println(name_1.equals(name_2));  //here same contant so result will b true
    }
}
