package day8;

public class C9SwitchCase {
    public static void main(String[]arg){

        char color='I';
        switch(color){
            case'i':
            case'I': System.out.println("color is indigo");break;

            case 'b':
            case 'B': System.out.println("color is voilet");break;

            case 'c':
            case 'C': System.out.println("color is blue");break;

            default: System.out.println("no color");

        }
    }
}
