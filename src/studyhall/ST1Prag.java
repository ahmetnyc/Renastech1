package studyhall;

public class ST1Prag {
    public static void main(String[] args) {

        apple myapple = new apple();
        System.out.println(myapple.price);
        System.out.println(myapple.getPrice());
        myapple.setPrice(12);
        System.out.println(myapple.getPrice());

    }
}
      class train{
}
   class apple{
    int price = 10;

    int getPrice(){return price;}
       void setPrice(int price){ this.price = price; }
   }
