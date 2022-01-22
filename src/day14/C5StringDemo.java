package day14;

import java.util.Scanner;

public class C5StringDemo {
    public static void main(String[] args) {

        String s = "tom";
        System.out.println("enter a string");
        Scanner scan = new Scanner(System.in);
        String s2 = scan.next();

        System.out.println(s==s2);

        System.out.println(s.equals(s2));
        System.out.println(s == s2.intern());
    }
}