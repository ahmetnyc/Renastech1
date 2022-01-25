package day27;

public class CarTest {
    public static void main(String[] args) {
       //Car c = new Car();
        Tesla t = new Tesla();
        t.moveForward();
        BMW b = new BMW();
        b.moveForward();

    }
}
abstract class Car{

   abstract void moveForward();

}
 class Tesla extends Car{
    void moveForward(){
        System.out.println("tesla is moving forward automatically");
    }
 }
  class  BMW extends Car{
    void moveForward(){
        System.out.println("BMW is moving forward");
    }
 }