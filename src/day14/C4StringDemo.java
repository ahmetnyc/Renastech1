package day14;

public class C4StringDemo {
    public static void main(String[] args) {

        String s1 = "rihana";                      // pool object
        String s2 = new String("rihana");   // heap object


        System.out.println(s1==s2);

        System.out.println(s1.length());
        System.out.println(s2.length());

        System.out.println(s1==s2.intern());// intern return method the pool object

        System.out.println(s1.equals(s2));
    }
}
