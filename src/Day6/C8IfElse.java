package Day6;

public class C8IfElse {
    public static void main(String[]args){
        //  < LES THAN  > GREATER THAN
         int i = 0, j=5;

         if (j<40) i++; // true 1

         if(j>=50)  // false

         if (j==50){
             ++i;  // false

             j=j+i; //   true 5
          }
        System.out.println(j);
        System.out.println(i);
    }
}
