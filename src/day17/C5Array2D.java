package day17;

import java.util.Scanner;

public class C5Array2D {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of rows of the array");
        int r = scan.nextInt();
        System.out.println("Enter the no of columns of the array");
        int c = scan.nextInt();
        int arr[][] = new  int[r][c];
        System.out.println("Enter the element of the array");
        for(int i=0; i<arr.length; i++){

        for(int j=0; j<arr[i].length; j++){
        arr[i][j]= scan.nextInt();
  }
   }
        System.out.println("entered array is: ");
        for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
        System.out.println(arr[i][j]+"\t");
   }
        System.out.println();
   }
    }
}
