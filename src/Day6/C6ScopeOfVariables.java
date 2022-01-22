package Day6;

public class C6ScopeOfVariables {
    public static void main(String[]args){
        System.out.println(" this is before the block of code ");

       // if (false)
        {
            System.out.println("this is  inside  a block  of code");
            int i = 10;
            System.out.println(i); //10 if there  {curly brace } can use same values
        }
          int i = 20;
        System.out.println(i); //20
        if ('a'!='b')
        System.out.println("this is after block of code");



    }
}
