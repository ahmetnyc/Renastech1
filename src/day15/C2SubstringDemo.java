package day15;

public class C2SubstringDemo {
    public static void main(String[] args) {
        String str = "we the people of this world ";

        String s = str.substring(5);
        System.out.println(s);
        System.out.println(str.substring(0));

        // index  substring count from 0  counts 7 to 11    12-1
       String s1 = str.substring(7,12);
        System.out.println(s1);

    }
}
