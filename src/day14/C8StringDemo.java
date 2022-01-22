package day14;

import java.util.Scanner;

      public class C8StringDemo {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // unicode for loop
        int count = 0;
            System.out.println("write in a String : ");
            String name = sc.nextLine();

           for (int a = 0; a < name.length(); a++) {
            if(name.charAt(a)>47 && name.charAt(a)<58){
                count++;
            }
        }
        System.out.println("Digit number of word is :" + count);

    }
}