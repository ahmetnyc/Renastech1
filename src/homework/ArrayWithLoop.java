
      package homework;

      import java.util.Scanner;

        public class ArrayWithLoop {
        public static void main(String[] args) {
        System.out.println("Even number in array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = {1,2,3,4,5,6};
        int count_even = 0, count_odd = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0)
                count_even += num[i];
            else
                count_odd += num[i];
       }
             System.out.println("even number = " + count_even);
             System.out.println("odd number  = " + count_odd);
        }
        }