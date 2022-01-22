package day9;

public class C3WitchRevison {
    public static void main(String[]args){
        // nested swith case
       String option = "fourth";
       switch (option){
           case "first":
               System.out.println("hello");
           case "second":
               System.out.println("slav");
           case "third":
               System.out.println("chao");
           case "fourth":
               int op = 2;
               switch(op){
                   case 1:
                       System.out.println("play");
                       case 2:
                       System.out.println("study");
                           break;
                   case 3:
                       System.out.println("sleepy");
               }
       }


    }
}
