package day14;

public class C3StringDemo {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hi";
        System.out.println(s2==s3);
        System.out.println(s1==s3);
        System.out.println(s1==s2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s3 = s1;
        System.out.println(s3);


    }
}
