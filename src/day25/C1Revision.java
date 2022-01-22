package day25;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class C1Revision {

    static{
        System.out.println("Hi");
    }
    {
        System.out.println(Demo.i);
        System.out.println("Hello");
    }
    C1Revision(){
        Demo.i=30;
        System.out.println("Slaw");
    }

    public static void main(String[] args) {
        System.out.println("Chao");
        new C1Revision();
        System.out.println("Merhaba");
    }
}
