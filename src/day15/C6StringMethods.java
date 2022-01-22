package day15;

public class C6StringMethods {
    public static void main(String[] args) {

        String s1 = "Hello-slav"; // anything inside double quotes is pool string object
        String s2 = "Hello-slav"; // after s2= new string (s2) became a heap object

        s2 = new String(s2); // heap object with string s2
        System.out.println(s1.contentEquals(s2));
        System.out.println(s1==s2); //(true) if no heap  check equality of the references
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

    }
}
