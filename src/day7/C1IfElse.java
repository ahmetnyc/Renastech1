package day7;

public class C1IfElse {
    public static void main(String[]args){

        int i = 4, b =5;
        if(i>b && b<i) System.out.println("value of i is 4 ");
        if(b==i && i>b) System.out.println("value of i is 4");
        else if (b>i && i<b) System.out.println("value of b is 5");
        System.out.println(true || false); // opposite meaning
        System.out.println(false && true); // false
        System.out.println( true || (true && false) && 6*6==30+6 || true);
    }
}
