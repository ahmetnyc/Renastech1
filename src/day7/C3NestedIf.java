package day7;

public class C3NestedIf {
    public static void main(String[]args){
        int population=5451, area=55697;
        if (population<10000){

            if (area<10000){
                System.out.println("small country");
            }
     else
                System.out.println("population is less than 10000 but "+"\narea is greater than 10000");
        }
        else
            if (area<10000){
                System.out.println("population is greater than 10000\n" +" but area is less than 10000");
            }
            else
                System.out.println("population is greater than 100000\n" + "and area is also greater than 10000");
    }
}
