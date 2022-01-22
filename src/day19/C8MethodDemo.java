package day19;

public class C8MethodDemo {


    public static void main(String[] args) {
        int arr[]={10,20,30,5};
        printarry(arr);

        int arr2[]= {3,9,8};
        System.out.println("\nsecond array");
        printarry(arr2);

        System.out.println("\nthird array");
        printarry(new int[]{9,8,7,6,5,4,});
    }
    static void printarry(int []arr ){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
