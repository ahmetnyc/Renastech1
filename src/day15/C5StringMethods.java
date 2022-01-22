package day15;

public class C5StringMethods {
    public static void main(String[] args) {

        String s1 = "New York to Chicago";
        System.out.println(s1.startsWith("New"));
        System.out.println(s1.startsWith("new"));
        System.out.println(s1.endsWith("cago"));


        System.out.println("hell ogo".endsWith("o go"));

        String s2 = "";  // valid string is 0  because itd not contain character
        System.out.println(s2.length()); // length and charAt is index counter
        System.out.println(s2.isEmpty()); // true
        System.out.println(s1.isEmpty());
        System.out.println(s1.length());  //  s1 is 19 (length is index counter from 0 )

    }
}
