package homework;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int number: ");
        int num;
        num = sc.nextInt();
        if(num % 2 == 0)
            System.out.println("Entered number is even");
        else System.out.println("Entered number is odd");
    }
}
