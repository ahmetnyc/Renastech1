package studyhall;
import java.util.Scanner;
public interface HomeAssignment2 {
    public static void main(String[]ar){

        int a,i=0,b,r;
        System.out.println("Enter 121 number");
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b=a;
        while(a>0) {
                     r=a%10; i=(i*10) +r; a=a/10;
        }
        if(b==i)
            System.out.println("Palindrome Number");
        else System.out.println("Not Palindrome Number");

        int h=10, c=20;
        int t; t=a; a=b; b=t;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int x=10, y=20;
        x=x+y; y=x-y; x=x-y;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        int e = 17;
        if (e % 2 == 0) System.out.println("number is even") ;
        else System.out.println("number is odd") ;
    }
}
