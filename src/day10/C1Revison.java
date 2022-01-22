package day10;

public class C1Revison {
    public static void main(String[] args) {


        int n = 8;
        // every number has at least 2 factors
        // first is the number itself
        // second is number 1
        int no_of_factor = 2;
        boolean isprime = true;
        for (int i = 2; i < i; i++) {
            if (n % i == 0) {
                isprime = false;

            }
        }
        if (isprime)
            System.out.println("prime number ");
        System.out.println("not prime ");

    }
}