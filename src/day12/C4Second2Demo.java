package day12;

    import java.util.Scanner;

    public class C4Second2Demo {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        String str = "Hello";
        char ch = str.charAt(1);
        System.out.println(ch);

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));

        int len = str.length();
        System.out.println(str.length());
        System.out.println(str);
    }
}
