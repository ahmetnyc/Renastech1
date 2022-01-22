package day15;

import java.util.Locale;

        public class C4StringMethods {
        public static void main(String[] args) {

        String str = " HumptyDumpty";
        boolean b = str.contains("mpty");
        System.out.println(b);

        System.out.println("HelloFelloRello".contains("Fell"));

        // trim( trims the space at the beginning and end  of a string

        String s2= "  hello guys  !    ! ";
        System.out.println(s2.trim());

        System.out.println("slav_chao$NAMESTE".toLowerCase());

        System.out.println("slav_chao$NAMESTE".toUpperCase());
    }
}