package day12;

import java.util.Scanner;

public class C5WhileDemo {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

            char ch ='y'; int num;

            while (ch =='y' || ch == 'Y'){
                System.out.println("enter number:");
            num = scan.nextInt();

            if(num>=0) System.out.println(num+" = number is positive");
            else if(num<0) System.out.println(num+" = number is negative");
            else System.out.println(num+" = number is zero");

            System.out.println(" = do you want continue y/n");
            ch = scan.next().charAt(0);
        }
        System.out.println(" = thanks for using");

    }
}
