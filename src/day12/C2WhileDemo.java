package day12;

import java.util.Scanner;

public class C2WhileDemo {
    public static void main(String[]args){
        System.out.println("printing numbers");

              while( true){
                  int i;
                  Scanner scan = new Scanner(System.in);
                 i = scan.nextInt();
                 if(i==-1){
                     System.out.println("good bye");
                     break;
                 }
                  System.out.println(i + " is entered");


        }



    }
}
