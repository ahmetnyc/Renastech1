package day25;

public class C7Inheritance {
    public static void main(String[] args) {
        Evlat e = new Evlat();
        System.out.println(e.m);
        System.out.println(e.j);
        System.out.println(e.getI());
        System.out.println(e.getK());

    }
}
class Dede3{
    private int i = 5;
    int getI(){ return i;}
    int j = 20;
}
class Baba3 extends Dede3{
    private int k = 30;
   public int getK(){ return k;}
}
class Evlat extends Baba3{
    int m = 40;
}
