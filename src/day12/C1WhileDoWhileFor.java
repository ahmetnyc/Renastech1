package day12;

public class C1WhileDoWhileFor {
    public static void main(String[]args){
        System.out.println("using for while loop"); // if
        int j = 1;
        while(j<=5){
            System.out.println(j++);

        }
        System.out.println("\nusing for loop"); // else
        for (int i=1; i<=5;){
            System.out.println(i++);
        }
        System.out.println("\nusing do while loop");//if else
        int k = 1;
        do{
            System.out.println(k++);
        }while(k<=5);
    }
}
