public class lab020 {

    //very important for interview

    public static void main(String[] args) {
        String s1 = "mubeena";
        String s2 = "mubeena";
        String s3 = new String("mubeena");
        System.out.println(s1 == s2);//here s1 and s2 are same so no new string will b created in SAP
        System.out.println(s1.equals(s2));//cheak for content
        //here is the key function equal it will chuck //cheak to content
        System.out.println(s1==s3);//it will cheak for reference means location.and will b created in heap
        System.out.println(s1.equals(s3));//it will cheak for content

    }
}
