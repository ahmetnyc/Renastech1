package day7;

public class C7LogicalOperators {
    /*
    boolean logical operator
    ---------------------
    %% boolean and operator
    // boolean or operator
    ! boolean invert / not operator
    note: a boolean logical operator can olny be applied to boolean value

    * */
    public static void main(String[]args){

        System.out.println((10.5>6));
        System.out.println('n'=='n');
       // System.out.println(false>true); error
        System.out.println(false==false);
        System.out.println("hello"=="hell0");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false );
        System.out.println( 10<9  || 5>6);
        System.out.println(false|| false);
        System.out.println( true || false && true);

        System.out.println(true || (true && false) && (6*6==30+6 ) || true);


    }
}
