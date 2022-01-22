package day15;

public class C8StringConcatination {
    public static void main(String[] args) {
/*
String concatenation
+ operator
concat method
 */
        String s1 = "snow"+"ball"; //String concatenation
        System.out.println(s1);
        System.out.println("new"+" york"+ " is very cold");

        String s2 = "fair".concat("play");
        System.out.println(s2);

        System.out.println("New".concat("jersey"));

        System.out.println(10+20+"30");
        System.out.println(10+20+"30"+10+10);
        System.out.println( 10+20+"30"+(10+10));

        System.out.println("50"+"60"+"gully");
        System.out.println(10+10+" 30 " + 10 + 10 + " 25 " + 10);
    }
}
