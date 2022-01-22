    package day12;
    import java.util.Scanner;
    public class C3EvenOrOdd {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("****even or odd check*****");
        char ch = 'y';
        while(ch=='y'){
            System.out.println("enter number");
            int i = scan.nextInt();
            if(i%2 == 0) System.out.println(i+ " = is even");
            else System.out.println(i + " is odd");
            System.out.println("enter y to continue or any other key to stop");
            ch = scan.next() .charAt(0);
        }
        System.out.println("thanks for using ");

    }
}
