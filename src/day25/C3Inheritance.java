package day25;



public class C3Inheritance {
    public static void main(String[] args) {
      //  Parent p = new Parent();
        Child c = new Child();
        System.out.println(c.a);
        System.out.println(c.j);
        c.show();
    }
}
 class Parent{
    int a =10;
    void show(){
        System.out.println("Hello");
    }
}
 class Child extends Parent{
    int j = 20;
 }
