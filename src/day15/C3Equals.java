package day15;

import java.util.Scanner;

public class C3Equals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = "slav";

        System.out.println(str.equals("Slav"));
        System.out.println(str.equals("SLAV"));
        System.out.println(str.equalsIgnoreCase("SlaV"));

        String username = "proCoder";
        String password = "juT7%$";

        System.out.println("Enter username:");
        String uNAME = scan.next();

        System.out.println("Enter password");
        String pass = scan.next();

        if(uNAME.equalsIgnoreCase(username) &&  pass.equals(password)) {

            System.out.println("login succesful");
        } else {
            System.out.println("login unssuccesfull");
        }

    }
}
