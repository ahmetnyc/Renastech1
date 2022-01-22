package array;

import java.util.Scanner;

public class C5ArrayDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the array size");
        int a;
        a = scan.nextInt();
        int arr[] = new int[a];
        System.out.println("enter the values");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();

        }
        System.out.println("entered values are: ");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }




    }
}
