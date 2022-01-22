package Day6;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

        public class HomeAssignment {
        public static void main(String[]args){
        System.out.println("1.");
        double G =90, E =75, M=98, S=60, C=40,Percentage;
        Percentage=(((G+E+M+S+C)/500)*100);
        System.out.println("Result = " + Percentage);
        if(Percentage<40) System.out.println("Fail");
        else if(Percentage>=70 && Percentage<95) System.out.println("First");
        else if(Percentage>60 && Percentage>=90) System.out.println("Second");
        else if(Percentage==40 && Percentage>65) System.out.println("Third");
        else System.out.println("First distinction\n");
        System.out.println("2.");

        int a=2,b=4,c=6,d=8;
        int l,g;
        System.out.println("Result = " + a + b + c + d);
        l=d; g=c;    d=a;  c=b; a=l; b=g;
        System.out.println("Result = " + a + b + c + d);

        System.out.println("3.");

        int km = 5, m =km*1000,  cm = m*100;
        double ft = m *3.3, in = ft *12;
        System.out.println(km +"km"+","+""+m+"m"+","+""+cm+"cm"+","+"\n"+ft+"ft"+","+""+in+"in");
    }
}