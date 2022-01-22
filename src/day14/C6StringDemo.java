package day14;

import java.util.Scanner;

public class C6StringDemo {
    public static void main(String[] args) {

         String s1 = "drum" ;
        System.out.println(s1.indexOf('u')); // index and charAt  count from 0

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        System.out.println("enter the character to find index for");
        char ch = sc.next().charAt(0);


        if(str.indexOf(ch) == -1)
            System.out.println("character'" + ch+ " ' is not there!");
        else
        System.out.println("index of " +ch+ " is " + str.indexOf(ch));

    }
}
