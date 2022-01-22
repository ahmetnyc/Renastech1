package Day6;

public class C10IfElse {
    public static void main(String[]args){
        int i=5, j=2;

        if (i*j >=10){  //

            i++; j--;        //( i 5 + i++ = 6)  (j 2 -1 = 1)  (6+1 -1 =r =6)  (r+r = 12)
            int r = i*j;

            System.out.println(r+r);
        }
        else{
            int r = ++i * --j;
            System.out.println(r);
        }

        System.out.println(i +"\n" + j);  // (i + + j) = 6
                                          // (j -1  ) =  1

    }
}
