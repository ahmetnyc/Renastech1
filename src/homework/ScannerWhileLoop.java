package homework;

import java.util.Scanner;

public class ScannerWhileLoop {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int sum = 0;
        int  number = 0;
        do {
          sum+= number;
            System.out.println("enter number");
            number = num.nextInt();
        }while(number>=2);
        System.out.println("sum = "+ sum);
        num.close();
    }
}
