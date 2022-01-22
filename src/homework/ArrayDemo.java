package homework;

import java.util.Scanner;

public class ArrayDemo {

            public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array size");
            int size = sc.nextInt();
            int []array = new int[size];

            System.out.println("Enter array values:");
            double arr[] = new double[size];
            for(int i=0; i<size; i++){
                double value = sc.nextDouble();
                arr[i] = value;
            }
            double length = array.length;
            double sum = 0;
            for(int i=0; i< array.length; i++){
                sum+=array[i];
            }
            double average = sum /size;
            System.out.println("average of array "+ average);
            System.out.println("sum is "+sum);

        }
    }

