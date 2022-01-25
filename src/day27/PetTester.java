package day27;

public class PetTester {
    public static void main(String[] args) {
        Labrador Dog1 = new Labrador();
        Dog Dog2 = new Labrador();
        Pet Dog3 = new Labrador();

    }
}
abstract class Pet{
   abstract void play();
}
abstract class Dog extends Pet{


}

class Labrador extends Dog{
    void play(){
        System.out.println("cute labra is playing...");
    }

}