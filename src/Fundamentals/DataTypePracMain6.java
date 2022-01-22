package Fundamentals;

public class DataTypePracMain6 {
    public static void main (String[]args){
        /* PRIMITIVE DATA TYPES IN JAVA
        Types    Size
        -----    ---                   range
        byte     1 byte   8 bits     -128 to 127
        short    2 bytes  16 bits    -32,768 to 32,767
        int      4 bytes  32 bits    -2,147,483,648 to 2.147.483,647
        long     8 bytes  64 bits    -9,223,372,036,854,775,808 to 9,223,372,o36,854,775,807
        float    4 bytes  32 bits
        double   8 bytes  64 bits
        char     2 bytes
        boolean  depend on the internal implementation
        memory is limited
         **/
        byte b = 10 ;
        System.out.println(b);
        b = 120;
        System.out.println(b); //b = 128 ;
        byte age = 50;
        System.out.println(age);
        short s = 200;
        System.out.println(s);
        int salary = 5640575;
        // int phone number = 88998785465
        // To specify a long literal  we use the suffix L
        long phone_number = 888998785465L;

        /* Any constant value in java is called literal.
        By default, all integral values within the range of int are treated as int literals
        If we use a literal within the range of int, the literal is by default
        treated as an int literal, L is not required
         **/
    }
}
