package day12;

import java.util.Scanner;

public class C4Demo {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
       System.out.println("enter a word");
       String word = scan.next();
       // to consume the new line character
       scan.nextLine();
        System.out.println(word);
        System.out.println("enter the name");

        String name = scan.nextLine();
        System.out.println(name);

    }
}
