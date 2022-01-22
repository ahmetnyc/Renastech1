package day13;

import java.util.Scanner;

public class C4ScannerDemo {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("enter an int number" + str);
        if(!sc.hasNextInt()){
            System.out.println("enter a valid int number");

        }
        System.out.println("thanks for entering a valid int number");
        int i = sc.nextInt();
        System.out.println("entered number is " + i);
    }
}
