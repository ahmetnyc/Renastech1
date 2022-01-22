package day5;

public class C2_ClassAssignment {
    public static void main(String[]args){
        int a = 568, sum;  //56.8
        int digit1= a%10;
        int new_number= a/10;
        int digit2= new_number%10; //6

        new_number = new_number /10;
        int digit3 = 5%10;//5
        sum= digit1 + digit2 + digit3;
        System.out.println(sum);





    }
}
