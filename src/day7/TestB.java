package day7;



public class TestB {
    public static void main(String[]aegs){
    // mistakes

    int a = 5, b = 10, c =40;
    if (a>b) System.out.println(a);
    if(b==a) System.out.println(b);
    if(c<b) System.out.println(c);
    else System.out.println("A is first");

    if (a>b && b<a) System.out.println(a);
    if (b>a && a==b) System.out.println(b);
    else System.out.println("B is second");

    if (a==b && b>a) System.out.println(a);
    if(a>b && b<a) System.out.println(b);
    if (c>=a && a<c) System.out.println(c);
    else System.out.println("C is third");



}
}