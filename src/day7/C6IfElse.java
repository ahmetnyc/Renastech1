package day7;

public class C6IfElse {
    /*
    if else  if ladder
    Age         Advice
    0-5         get loved
    6-10        play
    11-20       study
    21-60       work
    >60        retire and pray to god
    * */
    public static void main(String[]args){
        int age = 25;
        if(age<+5)
            System.out.println("get loved");
        else{
            if(age<=10)
                System.out.println("play");
            else{
                if(age<=20)
                    System.out.println("study");
                else{
                    if(age<=60)
                        System.out.println("work");
                    else{
                        if(age>60)
                            System.out.println("retire and pray to god ");
                    }
                }
            }
        }
    }
}
