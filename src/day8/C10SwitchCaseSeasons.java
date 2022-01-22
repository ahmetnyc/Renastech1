package day8;

public class C10SwitchCaseSeasons {
    public static void main(String[]args){

        String season;
        int month=9;
        switch (month){
        case 12:

        case 1:
        case 2: System.out.println("get you coat");
            season = "winter"; break;
        case 3:System.out.println("let go movies");

            case 4:
            case 5: season ="Spring"; break;

            case 6:
            case 7:
            case 8:season="summer"; break;

            case 9:
            case 10:
            case 11: season= "autumn"; break;

            default:season= "not a season of eart go to mars";
        }
        System.out.println("season is"+season);
    }
}
