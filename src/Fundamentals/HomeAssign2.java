package Fundamentals;

public class HomeAssign2 {
    public static void main(String[] args) {

        System.out.println("1.)  Write a Java program to print the result of the following operations.\n");
        System.out.print("a: -5 + 8 * 6 = ");
        System.out.println(-5 + 8 * 6);
        System.out.print("b: 55 + 9) % 9 = ");
        System.out.println((55 + 9) % 9);
        System.out.print("c: 20 + -3 * 5 / 8 = ");
        System.out.println(20 + -3 * 5 / 8);
        System.out.print("d: 5 + 15 / 3 * 2 - 8 % 3 = ");
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);


        System.out.println("\n2.) Write a Java program that prints the multiplication table. \n");

        int number = 5;
        for (int i = 0;  i <= 10; i++) {
            System.out.println(number + " * " +i+ " = " +(number * i ));
        }



    }
}

