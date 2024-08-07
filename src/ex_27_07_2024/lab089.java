package ex_27_07_2024;

public class lab089 {
    public static void main(String[] args) {        //here the main function is of 3th type with argument/parameters and without return type
        //functions  are:
        //Block of code which we can reuse.functions are of two types
        //pre built funtions,and user define functions
        //Two component of functions
        //1.Define
        //2.Call the function
        //you need to learn 4 types of functions
        //1.FUNCTION/METHORD WITHOUT PARAMETERS AND WITHOUT RETURN TYPE
        //2.FUNCTION WITHOUT PARAMETERS AND WITH RETURN TYPE
        //3.FUNCTION WITH PARAMETERS AND WITHOUT RETURN TYPE
        //4.FUNCTION WITH PARAMETERS AND WITH RETURN TYPE

        function_type1();//it doesnt return anything because of void
        System.out.println("-------------------------------");
       String name = function_type2 ();
        System.out.println(name);  //funtion 2 value will b return
        System.out.println("--------------------------------");
        function_type3("mubeen");  //this name will b injected in parameter
        System.out.println("--------------------------------");
        int sum = function_type4(2,7);
        System.out.println(sum);
        System.out.println("--------------------------------");
    }
    //1.FUNCTION/METHORD WITHOUT PARAMETERS AND WITHOUT RETURN TYPE
        static void function_type1 () {
            System.out.println("1.FUNCTION/METHORD WITHOUT PARAMETERS AND WITHOUT RETURN TYPE");
        }
    //2.FUNCTION WITHOUT PARAMETERS AND WITH RETURN TYPE
        static String function_type2 () {
            System.out.println("2.FUNCTION WITHOUT PARAMETERS AND WITH RETURN TYPE");
            return "mubeen";
        }
    //3.FUNCTION WITH PARAMETERS AND WITHOUT RETURN TYPe
       static void function_type3 (String name) {       ///here we have writen string so only strings are allowed
           System.out.println("3.FUNCTION WITH PARAMETERS AND WITHOUT RETURN TYPe");
           System.out.println("your name->"+name);   //in the above given name will injected here

       }
    //4.FUNCTION WITH PARAMETERS AND WITH RETURN TYPE
    static int function_type4 (int a, int b){
        System.out.println(" //4.FUNCTION WITH PARAMETERS AND WITH RETURN TYPE");
        return (a+b);

    }
    }


