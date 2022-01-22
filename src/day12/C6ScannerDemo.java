package day12;

import java.util.Scanner;

public class C6ScannerDemo {
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        System.out.println("enter an integer ");
        int i; boolean flag = true;
        while(flag){
            if (scan.hasNextInt()) { //(true 5.5)    check true or false
                i = scan.nextInt();
                System.out.println("entered number is = " + i);
                flag = false;
                break;
            }
            System.out.println("invalid enter");
        }
    }
}
