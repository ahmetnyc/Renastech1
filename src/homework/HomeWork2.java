package homework;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] aegd) {

        Scanner sc = new Scanner(System.in);
        System.out.println("what is your name ");
        String name = sc.next();
        System.out.println(name);

        System.out.println("whats your age");
        int age = sc.nextInt();
        System.out.println(age);

        System.out.println("what is your expectation");
        String expectation = sc.next();
        expectation = expectation + sc.nextLine();
        System.out.println("thank you "+ name + ", you are "+ age + " years old ") ;
        System.out.println("and your expectation is " + expectation);

    }
}