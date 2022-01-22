package day11;

import java.util.Scanner;

public class C3ScannerDemo {
    public static void main(String[]ar){

        Scanner car = new Scanner(System.in);
        System.out.print("Enter a int number");
        int i = car.nextInt();  System.out.println(i);

        System.out.println("Enter a byte number ");
        byte b = car.nextByte();
        System.out.println("Entered byte number is = " +b);

        System.out.println("enter a short number:");
        short s = car.nextShort();
        System.out.println("entered short number is = " +s+":))");

        System.out.println("entered long number: ="); long l = car.nextLong();
        System.out.println("haha long number is : ="+l);

        System.out.println("entered float and double number");
        float f =car.nextFloat();
        double d = car.nextDouble();
        System.out.println(f+ "\n"+d);

    }
}
