package Fundamentals;

public class symbol{
      public static void main(String[]args){
        /*
         java uses UNICODE transformation format
        UNICODE is a standard which specifies that
        there is a unique number, corresponding to each character
        that we type on the laptop, computer, mobile etc.device
        **/
        char symbol1 = 'a'; // a : 97
        System.out.println(symbol1);
        char ch = +98;
          System.out.println(ch); // b
          ch = 122;
          System.out.println(ch);
          char f = 97;
          System.out.println(f);

         /* symbols   0UNICODE  unique number
            0 to 9               48 to 57
            A to Z              65 to 90
            a to z             97 to 122
**/
          char ch1 = 48;
          // below statement prints the symbol  corresponding to number
          System.out.println(ch1);
          char a = 65;





    }
}
