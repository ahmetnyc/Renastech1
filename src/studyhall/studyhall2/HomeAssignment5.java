
   package studyhall.studyhall2;
   import java.util.Scanner;
   public class HomeAssignment5 {
    public static void main(String[]r){

        System.out.println("1======Enter 2===8===== ");
        Scanner sc = new Scanner(System.in);
        int lenght =0;
        int breadth =0;
        int area1 =0;
        int perimeter =0;
        System.out.print("enter the length of Rectangle : ");
        lenght = sc.nextInt();

        System.out.println("Enter the breadth of Rectangle : ");
        breadth = sc.nextInt();

        area1 = lenght * breadth;
        perimeter = 2 * (lenght + breadth);

        System.out.println("The area of rectangle is : " + area1);
        System.out.println("The perimeter of rectangle is : " + perimeter);
        double radius,area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        radius = input.nextDouble();
        input.close();
        area = Math.PI * radius * radius;
        System.out.println("Area of the Circle is " + area);

    }
}
