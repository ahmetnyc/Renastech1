package studyhall;
import java.util.Scanner;
public class HomeAssignment3 {
    public static void main(String[]args){
        System.out.println("5==========");
    int a, s = 0, b, r;
    System.out.println("Enter 121 number");
    Scanner sc = new Scanner(System.in);
    a=sc.nextInt();
    b=a;
    while(a>0)
    {
        r = a % 10; s = (s * 10) + r; a = a / 10;
    }
    if(b==s)
            System.out.println("Palindrome Number");
    else System.out.println("Not Palindrome Number");
    System.out.println("6===============");
    int h = 10, g = 20;
    int t;
    t=a; a=b; b=t;
    System.out.println("a = " +a);
    System.out.println("b = " +b);
    System.out.println("7================");
    int x = 10, y = 20;
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println("x="+x);
    System.out.println("y="+y);
    System.out.println("8====================");
    int e = 17;
    if(e %2==0)System.out.println("number is even");
    else System.out.println("number is odd");
}
}
