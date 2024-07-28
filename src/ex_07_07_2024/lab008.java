package ex_07_07_2024;

public class lab008 {
    public static void main(String[] args) {
     //increament++
        // ++pre and post increament++
        int a = 10;
        int b =++a;      //here pre increment means first expression will be in creased and then value will b increased
        System.out.println(b);
        System.out.println(a);


        //and next post increament ++post
        int a1 = 10;
        int b2 = a1++; //b2 = a1 + 10
        System.out.println(a1);   //here first value of expression will not b increased and then value will b incresed called as post increament
        System.out.println(b2);

        //here we can also write as post increamented
        int c = 10;    //the value is  first increated  and later asigned
        System.out.println(++c);
        //exp = 11   c = 11


        //post increamented
        int d = 20;  //the vlaue is assign first and then increament later
        System.out.println(d++);
        //Exp =20 and d = 20 and then it will in creament
        System.out.println(d);
    }
}
