
          package homework;

            public class ArrayEvenOrOdd {
            public static void main(String[] args) {

           int[] arr = {1, 2, 3, 4, 5, 6};
           System.out.println("Odd numbers");
           int count_even = 0, count_odd = 0;
           for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
            System.out.println(arr[i]);
            count_odd++;
       }
       }
             System.out.println("even numbers");
             for(int i = 0; i < arr.length; i++) {
             if (arr[i] % 2 == 0) {
              System.out.println(arr[i]);
               count_even++;
     }
     }
    }
    }
