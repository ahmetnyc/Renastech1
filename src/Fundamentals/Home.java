package Fundamentals;

import java.sql.SQLOutput;

public class Home {
    public static void main(String[]args) {
        System.out.println("write java");
        System.out.print("a:-5 + 8 * 6  = ");
        System.out.println(-5 + 8 * 6);
        System.out.print("b:(55+9) % 9  = ");
        System.out.println((55+9) % 9);
        System.out.print("c: 20 + - 3 * 5 / 8  = ");
        System.out.println( 20 + -3 * 5 / 8 );
        System.out.print("d:5 + 15 / 3 * 2 - 8 % 3  = ");
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        long num=1_100_000_000L;
        System.out.println("this year sales = $"+num*62);

        int x = 2;
        for (int i= 0; i<=10; i++){
            System.out.println(x+" * "+i+" = "+x*i );

        }



    }
}
