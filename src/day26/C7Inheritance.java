package day26;

public class C7Inheritance {

    C7Inheritance(){
        this(5);
        System.out.println("chao");
    }
    C7Inheritance(int a){
        this("Slaw");
        System.out.println("Hi");}

    C7Inheritance(String a){System.out.println(a);}

    public static void main(String[] args) {
        new C7Inheritance(10);
        new C7Inheritance("Hello");
        new C7Inheritance();

    }
}

