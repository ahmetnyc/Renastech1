package Day6;

public class C1Revision {
    public static void main(String[]args){
        /*
        ++operand    pre increment
        operand++   post increment
        --operand   pre decrement
        operand--  post decrement
        **/
        int i = 1 ;
        int r = --i + i++ + i++ - i-- - ++i;
        System.out.println(r);
        System.out.println(i);


        int a = 1;
        int b = ++i + i-- - i++ + --i;
        System.out.println(b);
        System.out.println(a);



    }
}
