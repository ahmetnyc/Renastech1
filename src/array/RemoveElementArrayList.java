package array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElementArrayList {
    public static void main(String[] args) {
        ArrayList<String>al = new ArrayList<>();
        al.add("orange");
        al.add("mango");
        al.add("banana");
        al.add("kiwi");
        al.add("mango");


       System.out.println(al);
        Iterator<String> i = al.iterator();
        while(i.hasNext()){
            if(i.next().equals("mango"))
                i . remove();
        }
    }
}
