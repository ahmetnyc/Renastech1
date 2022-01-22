package day7;

public class C10 {
    public static void main(String[]args){
    /*
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(true || false && !false);
**/

        int i=1, a = 2, b = 3;
        if (i>a) System.out.println(i);
        else System.out.println(a);

        if (i<a) System.out.println(i);
        else System.out.println(a);

        if (i>a && i>b) System.out.println(i);
        else if (a>i && a > b) System.out.println(a);
        else System.out.println(b);

        if (i<a && i<b) System.out.println(i);
        else if (a<i && a < b) System.out.println(a);
        else System.out.println(b);

    }
}
