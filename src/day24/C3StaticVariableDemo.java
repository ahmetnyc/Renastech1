package day24;

public class C3StaticVariableDemo {

    int IntanceVariable=25;
    int number2 = 10;
    static int  s= 100;
    { System.out.println("Namaste");}
    static {System.out.println("Hi");}
    static int j = 20;

      public static void main(String[] args) {
      C3StaticVariableDemo object = new C3StaticVariableDemo();
      new C3StaticVariableDemo(60);
        System.out.println(s+j);
    }

    static{System.out.println("Hello");}
    { System.out.println("slaw");}
    C3StaticVariableDemo (int a){System.out.println(a);}

    C3StaticVariableDemo(){System.out.println("chao");}
}
