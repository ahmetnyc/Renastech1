package day8;

public class C7SwitchCase {
    public static void main(String[] args) {
        double a = 10, b = 20;
        System.out.println("Numbers are a=" + a + "\tb=" + b);

        System.out.println("Give an option \n1 for addition\n2 for subtraction\n3 for Multiplication" +
                "\n4 for Division\n5 for modulus");
        int option = 5;

        switch (option) {
            case 1: System.out.println("this is case 1");
                    System.out.println("a+b="+ (a+b));
                     break;

             case 2: System.out.println("this case is 2");
                    System.out.println("a-b="+(a-b));
                     break;

            case 3: System.out.println("this is case 3");
                    System.out.println("a*b="+(a*b));
                    break;

            case 4: System.out.println("this is case 4");
                   System.out.println("a/b="+(a/b));
                   break;

            case 5: System.out.println("this is case 4");
                    System.out.println("a%b="+(a%b));
                    break;
            default: System.out.println("Invalid entry");


        }
    }
}

