package studyhall.studyhall2;
import java.util.Scanner;
public class ScannerSwitch {
    public static void main(String[]args) {

        System.out.println("*******AREA CALCULATOR");
        Scanner num = new Scanner(System.in);
        System.out.println("1.area of rectangle\n" + "2. area of square\n" + "3.area of circle");
        System.out.println("choice an option number from above");
        Byte option = num.nextByte();
        switch (option) {
            case 1: {


                System.out.println("enter the lenght and breadth of the rectangle ");
                double length = num.nextDouble();
                double breadth = num.nextDouble();
                System.out.println("length and breadth of area rectangle is :" + length * breadth);
            }
            case 2:{
                int i = num.nextInt();
                System.out.println("side of square is "+i*i);
            }
            case 3:{
                int a = num.nextInt();
                System.out.println("radius of circle is "+ (3.14*a*a));
            }
        }
    }
}
