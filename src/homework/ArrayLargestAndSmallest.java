package homework;

import java.util.Scanner;

public class ArrayLargestAndSmallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int count = scan.nextInt();
        int num[]= new int[]{60,45,15,35,30,40};
        int smallest = num[0];
        int largest  = num[0];

        for(int i=0; i<num.length; i++){
         if(num[i]> largest)
         largest = num[i];
         else if (num[i]< smallest)
          smallest = num[i];
   }
        System.out.println("Largest num is :  " + largest);
        System.out.println("smallest num is: " + smallest);
    }
}
