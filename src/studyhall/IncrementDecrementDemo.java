package studyhall;

public class IncrementDecrementDemo {
    public static void main(String[]args){
        int i = 5; // pre increment before, post increment later
        int r = ++i + i++ - --i;
        System.out.println(r);
        System.out.println(i);

    }
}
