package homework;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0 ;
        System.out.println("please write in a string");
        String num = sc.nextLine();
        int lower_case = 0, upper_case=0,  digits =0,sp_char=0,  spaces=0;

        for(int j = 0 ; j <=num.length(); j++){

            char ch = num.charAt(j);
            if (ch >= 48 && ch < 57) digits++;
            else if(ch>=48 && ch<=122) lower_case++;
            else if(ch>=65 && ch<=90) upper_case++;
            else if(ch==32) spaces++;
            else if( (ch==33 && ch<=47)  || (ch>=58 && ch<=64)   ||
                    (ch>=91 && ch<=96) || ch>=123 && ch <=126) sp_char++;

            else System.out.println("digit number of word is :" + count);
            System.out.println("lower_case count:"+ lower_case);
            System.out.println("upper_case count:"+ upper_case);
            System.out.println("space count:" +spaces);


        }
    }
}
