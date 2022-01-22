package day26;

public class C2Overridding {
    public static void main(String[] args) {
        Apple a = new Apple();
        System.out.println(a.getPrice());
    }
}
class Fruit{
    int price = 10;
}

class Apple extends Fruit{
   // int price = 20;
    int getPrice(){
        return price;
    }
}
