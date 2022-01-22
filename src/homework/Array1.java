package homework;

import java.util.Scanner;

public class Array1 {
        public static void main(String[] args) {

            System.out.println("Enter array size");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();

            int[]arr = new int[10];
            for(int i =0; i<arr.length; i++){
                arr[i] = i*10+i;
            }
    }
}
