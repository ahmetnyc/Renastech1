package array;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class Demo1 {

        public static void main(String[] args) {

            ArrayList<String > al =new ArrayList<>();
            al.add("orange");
            al.add("mango");
            al.add("orange");
            al.add("kiwi");
            al.add("mango");

            System.out.println(al);
            Iterator<String> i = al.iterator();
        /*while(i.hasNext()){
            if(i.next() . equals("mango"))
                i.remove();
        }*/

            al.removeAll(  Arrays.asList("orange","mango")  ) ;

        /*
        Below code gives concurrent modification Exception
        for(String i: al){
            if(i.equals("mango")){
                al.remove(i);
            }
        }*/

            System.out.println(al);


        }
    }
