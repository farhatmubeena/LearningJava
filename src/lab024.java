import java.util.Locale;

public class lab024 {
    public static void main(String[] args) {
        //if i want to cheak the password
        String password = "Mubeena@123";
        String p = password.toLowerCase();
        System.out.println(p);
       System.out.println(password==p);
        System.out.println(password.equals(p));
        System.out.println(password.equalsIgnoreCase(p)); //all the  capital leters or small letters will b ignored
        System.out.println(password.substring(0,3));//it will give the characters from index 0 to index3
        System.out.println(password.indexOf('a'));// index number will  b given
        System.out.println(password.length());//lenght will start from index 1
    }
}
