package day15;

import com.sun.xml.internal.ws.wsdl.writer.document.soap.Body;

public class C7CompareToDemo {
    public static void main(String[] args) {

        // postive  count rest 3
        // is negative count from -

        System.out.println("Apple".compareTo("Boy"));      // -1 negative
        System.out.println("Apple" .compareTo("Apply"));   // --20 between y to e
        System.out.println("Appy".compareTo("Apply"));     //  13  between y to l 13
        System.out.println("Appy ".compareTo("Boyhood"));  // -1  between a and b  65 to 66
        System.out.println("Girlish".compareTo("Girl"));  //  3  ish between same character after positive
        System.out.println("Ahmet".compareTo("ahmet"));  // -31  between uppercase A to lowercase a 65 from 97 A to 65 a


    }
}
