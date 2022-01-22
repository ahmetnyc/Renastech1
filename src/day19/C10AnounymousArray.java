package day19;

public class C10AnounymousArray {
         public static void main(String[] args) {
             System.out.println("first array");
         printArray(new int []{10,20,30});

           System.out.println("\nsecond array");
         printArray(new int[]{5,4,3,2,});

    }
          static void printArray( int arr[]){
          for(int i =0; i<arr.length; i++){
          System.out.println(arr[i]);
        }
      }
}
