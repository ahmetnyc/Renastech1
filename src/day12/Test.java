package day12;

import java.util.Scanner;

public class Test {
    public static void main(String[]aerg){
/*
        System.out.println("type any name");
        Scanner scan= new Scanner(System.in);

       String name = scan.nextLine();
       for(int a =1; a<=name.length();a++){
           System.out.println(name.charAt(a));
       }
        System.out.println(name.length());
**/     Scanner scan= new Scanner(System.in);
        System.out.println("enter a string");
        String str = scan.nextLine();

        for(int j=2; j<=str.length(); j++){
            System.out.println(str.charAt(j));
        }
        System.out.println(str.length());
    }
}
