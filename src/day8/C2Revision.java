package day8;

public class C2Revision {
    public static void main(String[]args){


        int salary= 50000;
        if(salary<1000) System.out.println("not an employee");
       else if(salary>=1000 && salary<=10000) System.out.println("software tester");
       else if(salary>10000 &&salary<=25000) System.out.println("software developer");
       else if(salary>25000 && salary<=50000) System.out.println("project manager");
      else  if(salary>5000 && salary<=100000) System.out.println("team leader");
        else System.out.println("hr manager");



    }
}
