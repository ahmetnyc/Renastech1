package homework;

public class Array2 {
    public static void main(String[] args) {

        int [] arr = {8,7,6,5,4};
        System.out.println("Enter element of array ");
        System.out.println("First  Element: is "  + arr[0]);
        System.out.println("Second Element: is "  + arr[1]);
        System.out.println("Third  Element: is "  + arr[2]);
        System.out.println("Fourth Element: is "  + arr[3]);
        System.out.println("Fifth  Element: is "  + arr[4]);

        int [] num = {7,5,6};
        for(int i = 0; i <=num.length; i++){
        System.out.println(num[i]);
   }
        int[] i = {10,8,6};
        for(int a: arr){
        System.out.println(a);
   }
    }
}
