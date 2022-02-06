package day28;

public class C3Interface {
    public static void main(String[] args) {

        Tempo t = new Tempo();
        t.show();
        t.play();
        Pet1 p1 = t; p1.show(); p1.play();
        Pet p = t;p.show();
        Pet2 p2 = t; p2.play();// p2.show();
    }
}
interface Pet{ void show();}
interface Pet2{void play();}

interface Pet1 extends Pet,Pet2{

}
class Tempo implements Pet1{
    public void show(){
        System.out.println("hello");
    }
    public void play(){
        System.out.println("hi");
    }
}