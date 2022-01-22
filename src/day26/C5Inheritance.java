package day26;

public class C5Inheritance {
    public static void main(String[] args) {
        Child1 c = new Child1();
      //  c.show();
        c.showA();
      //  super.show();
    }

}

class Base1 {
    int a = 10;
    void show() {System.out.println("hello");}
}
class Child1 extends Base1{
    int a = 20;
    void show(){System.out.println("Hi"); super.show();}
        void showA(){
        int a = 30;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(super.a);
    }
}
