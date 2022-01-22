package homework;

import java.util.Scanner;

public class PalindromeWhileLoop {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println(" enter number ");
        int i = num.nextInt();
        int reverse = 0, remainder, original;
        original = i;
        while(i !=0){
            remainder = i % 10;
            reverse = reverse * 10 + remainder;

        }
        if (original == reverse) System.out.println(original + " is a palindrome");
        else System.out.println(original + " is not a palindrome");

    }

    }

