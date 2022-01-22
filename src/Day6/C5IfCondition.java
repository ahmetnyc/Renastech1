package Day6;

public class C5IfCondition {
    public static void main(String[]args) {
/*
        if ("hello" == "hello") {
            System.out.println("shakira");
        }
        //  if("hello == Chalo")
            System.out.println("Beyonce");
           if('s' == 's')
            System.out.println("salman khan")
                    int i = 10;
           if(i == ++i){    //false not gonna show output
               System.out.println("Hello");
               System.out.println("Chao");
               System.out.println("Slav");
           }**/

        int i = 10;        //  is there is  {curly brace}  will all show output
        if (i == ++i)    // 11: false  and if there ; will show all statements and  if ( false)  will not show up
            System.out.println("Hello");
        System.out.println("Chao");    // last statement as there is no braces (independent statement)
        System.out.println("Slav");
    }
    }