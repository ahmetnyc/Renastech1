package day14;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class C7StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        System.out.println("Enter char");
        char c1 =  sc.next().charAt(1);


        for (int counter = 1; counter <= 5; counter++) {
            System.out.println("Hello" + counter);
        }

    }
}
