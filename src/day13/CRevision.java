package day13;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.Scanner;
public class CRevision {
    public static void main(String[] args) {
            float English, match, science, history, computer;
            Scanner num = new Scanner(System.in);
            char option;
            do{
            System.out.println("Enter mark in the following subject");
            System.out.println("English");
            English = num.nextFloat();
            System.out.println("match");
            match = num.nextFloat();
            System.out.println("science");
            science = num.nextFloat();
            System.out.println("history");
            history = num.nextFloat();
            System.out.println("computer");
            computer = num.nextFloat();
            byte count = 0;
            if (English < 33) count++;
            else if (match < 33) count++;
            if (science < 33) count++;
            if (history < 33) count++;
            if (computer < 33) count++;
            if (count >= 1) {

                System.out.println("the student is failing in " + count + "subjects");
            } else System.out.println("PASS");
            System.out.println(" press y to continue or any other key to stop");
            option = num.next().charAt(0);
        }  while (option == 'y' || option == 'y');

    }
}

