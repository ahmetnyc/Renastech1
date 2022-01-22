package day25;

public class C4Inheritance {
    public static void main(String[] args) {
        BMW b = new BMW(); b.accelerate();
        new Car().accelerate();
    }
}
class Car{
    void accelerate(){
        System.out.println("accelerating");
    }
}
class BMW extends Car{

}
