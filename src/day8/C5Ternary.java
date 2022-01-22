package day8;

public class C5Ternary {
    public static void main(String[] args) {


        String s; int a=10;
        /*if(a<10)
            s="a is less than 10";
        else{
            if(2000>a) s="2000 is greater than a";
            else s="2000 is less than a";
        }*/
       s = (a>100) ?"a is not greater than 10":((a<0) ?"a is less than 10":"30 is greater than 10");
        System.out.println(s);
    }
}