package day27;

public class HumanTester {
    public static void main(String[] args) {
       Engineer e = new Engineer();
       Human h = e;
       Livingthing t = e;
    }
}
interface Livingthing{
    void breathe();
}
abstract class Human implements Livingthing{
    void eat(){
        System.out.println("Human is eating pizza");
    }
    abstract  void work();
}
class Engineer extends Human{
    void work(){
        System.out.println("Engineer is working");
    }
    public void breathe(){
        System.out.println("Engineer is breathing");
    }
}