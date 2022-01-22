package day14;

public class C2StringDemo {
    public static void main(String[] args) {

      String str = "hello";
        System.out.println(str.length());
        System.out.println();   // 5

        String str2 = new String( "hi");
        System.out.println(str2.length()); // 2

        System.out.println("slav".length());  //4
        System.out.println("slav".charAt(3)); //  charAt and index from 0 = 4 counting

        String s1 = "shakira";  // pool object
        String s2 = new String("shakira"); // heap object
        String s3 =  "shakira";
        String s4 = "shakira";
        String s5 = "shakira";


        System.out.println(s1 == s4);
        System.out.println(s4 == s5);
        System.out.println(s5 == s1);


    }
}
