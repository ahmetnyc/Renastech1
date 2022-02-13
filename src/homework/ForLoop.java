package homework;



public class ForLoop {
    public static void main(String[] args) {
        int a = 20;
        int x;
        x=3;
        for( x=1; x<20; x++){
            if(x==11) continue;
            System.out.println(x);
        }
        System.out.println(x);
        x=5;
        System.out.println(x);
    }
}
