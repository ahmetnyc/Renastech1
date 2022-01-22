package day11;
import java.util.Scanner;
public class C5WhileLoop {
    public static void main(String[]a){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your city:");
        String city ;

        city = scan.next();
        System.out.println("you live in: " + city);
        scan.nextLine();

      //  System.out.println("enter your city again");
     //   city = scan.nextLine();
     //   System.out.println("you live " + city);

        String name;
        System.out.println("enter your full name: ");
        name= scan.nextLine();
        System.out.println("your name is "+ name);


    }
}
