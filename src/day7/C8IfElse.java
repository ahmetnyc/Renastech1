package day7;

public class C8IfElse {
    public static void main(String[]args){
    // Boolean logical operator


             int x = 5;
             if (x<3) System.out.println("X is Negative");
             if (x>4) System.out.println("X is Positive");
             if(x==0) System.out.println("X is Zero");

            int point = 5000;
            if (point < 1000) System.out.println('A');
            if (point < 500) System.out.println('B');
            if (point >= 10000) System.out.println('C');
            else {
                if (point == 5000) System.out.println('D');

            }

           if (point>=200000 && point<=2000) System.out.println('G');
           if (point==40000 && point>=4000) System.out.println('K');
           else if (point >= 600000 && point <= 3055550) System.out.println('F');
               System.out.println("l");






    }
}
