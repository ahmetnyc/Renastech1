package day25;

public class C9Inheritance {
    public static void main(String[] args) {
        Evlat9 e = new Evlat9();
        e.show();
    }
}
class Baba9{
    void show(){
        System.out.println("Hello");
    }
}
class Evlat9 extends Baba9{
    void show(){
        System.out.println("Hi");
    }
}
