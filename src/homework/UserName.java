package homework;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);

              System.out.print("Enter userName: => ");
              String userName = sc.next();

              System.out.print("Enter Password: => ");
              String pass123 = sc.next();

              if("userName".equals(userName) || "pass123".equals(pass123)) {
                  System.out.println("User is successfully loggined...");
              }
              else{
                  System.out.println("Invalid username or Password...");
              }

          }
        }
