package day24;

import java.util.concurrent.Callable;

public class C1Revision {

   static int count;
    C1Revision(){
        System.out.println("Object number "+ ++count +"created...");

    }
      public static void main(String[] args) {

          System.out.println("count="+count);
        new C1Revision();
        C1Revision c = new C1Revision();
        new C1Revision();

    }
}
