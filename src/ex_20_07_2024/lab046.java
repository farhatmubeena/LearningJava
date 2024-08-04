package ex_20_07_2024;

public class lab046 {
    public static void main(String[] args) {
        //after JDK 13 switch can return something
        //this is new feature people rarely will use this
        char code_1 = 'a';
        int val = switch (code_1){
            case  'a':
                yield 65;//this is nothing but return
            case 'b':
                yield 66;
            default:
               throw new IllegalStateException("unexpected");

        };
        System.out.println(val);
    }
}
