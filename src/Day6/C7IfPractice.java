package Day6;

public class C7IfPractice {

        /*points   grades
        90 - 100  A
        75 - 90   B
        60 - 74   C
        40 - 59   D
        <40       E

         **/
        public static void main(String[]args){
        int point = 95;  char  grade = 'E';
        if (point>=91 )        grade = 'A';
        if (point>=75)         grade = 'B';
            System.out.println(grade);
    }
}
