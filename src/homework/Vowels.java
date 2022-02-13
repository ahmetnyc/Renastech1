package homework;

import java.util.Locale;

public class Vowels {
    public static void main(String[] args) {

        System.out.println(Vowels("Hello"));
        System.out.println(Vowels("TV"));

    }
    public static boolean Vowels(String input){
        return input.toLowerCase(Locale.ROOT).matches(".*[hello]");
    }
}
