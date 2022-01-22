package day26;

public class C6Inheritance {
    public static void main(String[] args) {
        Child2 c = new Child2();
    }
}
 class Dede2{
    Dede2(){super(); System.out.println("chao");}
 }
class Base2 extends Dede2{
    Base2(){super ();System.out.println("Hello");}
}
class Child2 extends Base2{
    Child2(){super (); System.out.println("Hi");}
}
