package day7;

public class HomeAssign {
    public static void main(String[]args){

             int x = 5;
             if (x<3) System.out.println("X is Negative");
             if (x>4) System.out.println("X is Positive");
             if(x==0) System.out.println("X is Zero");

             int point = 5000;
             if (point < 1000) System.out.println('A');
             if (point < 500) System.out.println('B');
             if (point >= 10000) System.out.println('C');
             else
             if (point == 5000) System.out.println('D');

             int salary = 10000;
             if(salary<1000) System.out.println("Not an Employee");
             if(salary==2000) System.out.println("Software Tester");
             if(salary>300000) System.out.println("Project Manager");
             if(salary>=400000) System.out.println("Team Leader" );
             else System.out.println("HR Manager");

        }
}
