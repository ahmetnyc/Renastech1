package day7;

import org.omg.CORBA.PUBLIC_MEMBER;

public class C5IfElse {
    /*
    point       grades
    91-100        A
    75-90         B
    60-74         C
    40-59         D
    <40           E
    * */
    public static void main(String[]args){
    int age = 20;
    if(age<100) System.out.println ("A");
    else if (age<=75) System.out.println("B");
    else if (age<40) System.out.println("C" );
    else if (age==20) System.out.println("D");
    else if (age>=10) System.out.println("E");

    }


    }

