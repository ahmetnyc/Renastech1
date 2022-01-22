package day18;

public class C2MethodsSemo {
    public static void main(String[] args) {
        // Using a method means calling or invoking a method
        // Below statement calls the show method, show method is called method
        // main is the calling method as show is being called from main method
        show();
  }
        static void show(){
        System.out.println("This is show method");
            play();
    }
        static void play(){
        System.out.println("play method");
    }
}
