public class lab005 {
    public static void main(String[] args) {
        //important for interview
        //there are two types of casting       1.source and destination conversions
         // widening will have 1.implicit casting 2.explicit casting.  (lossless data)
         // narrowing will also have 1.implicit casting 2.explicit casting.    (loss of data)

        //widening
        byte a = 10;
        int b = a; //VALID -IMPLICIT CASTING -JVM
        int a1 = (int)b;//valid - explicit casting
        System.out.println(a1);


        //Narrowing
        int aa = 300;
      //  byte q2 = aa; //invalid implicit casting - jvm
        byte q2 = (byte)aa;//   loss of data
        System.out.println(q2);//invalid implicit casting - jvm





    }
}
