        package day10;
        import java.util.Scanner;
         public class Class {

             public static void main(String[] args) {
                 Scanner sc = new Scanner(System.in);
                 System.out.println("enter age");
                 int age = sc.nextInt();
                 System.out.println("user enter" + age);
                 if (age <= 18) System.out.println(" allowed vote");
                 else System.out.println("not allowed vote");

             }
         }