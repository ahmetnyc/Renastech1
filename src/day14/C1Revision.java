package day14;

import java.util.Scanner;

public class C1Revision {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
      /*  if(scan.hasNextInt()){

            int value = scan.nextInt();
            System.out.println("valid int entered"+ value);
        }
        else{
            System.out.println("no entered is not a valid int");
        } **/
          while(!scan.hasNextInt()){
              System.out.println("please enter valid int number");
              scan.nextLine();
          }
          int value = scan.nextInt();
        System.out.println("enter int valid :"+ value);
    }
}
