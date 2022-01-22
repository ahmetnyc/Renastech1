package day24;

public class C4StaticInstance {

    static{System.out.println("Hello"); }
    C4StaticInstance(){System.out.println("chao"); }
    {System.out.println("Hi");}

    {System.out.println();}
    int i = 20;

    static int j=50;
    {System.out.println("Namaste"); }

    C4StaticInstance(String s){System.out.println(s);}
    C4StaticInstance(int p){System.out.println(p);}

    public static void main(String[] args) {
        new C4StaticInstance();
        new C4StaticInstance();
    }
}
