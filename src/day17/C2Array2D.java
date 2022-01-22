package day17;

public class C2Array2D {
    public static void main(String[] args) {

      //  int arr[][]; ary = new int[3][];
        //  arr = new int[3][5];

         int arr [][] = new int[3][];
         arr[0] = new int[4];
         arr[1] = new int[3];
         arr[2] = new int[5];

        System.out.println(arr[2][0]);
        System.out.println(arr[2][4]);

        arr[0][2]= 5;     arr[2][1]= 7;
        System.out.println(arr[0][2] + arr[2][1]);



    }
}
