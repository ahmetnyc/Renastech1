package Day6;

public class CPIfElse {
    public static void main(String[]args){
        int i = 1, j = 10;

        if (i < j) // true if (i==j) (false)  execute   12
          i = i + j; // = 11

        else
            i = ++i + j ;  // 10

        System.out.println(i+"\n"+j);

    }
}
