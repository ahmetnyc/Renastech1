package day22;

public class C1Object {
    public static void main(String[] args) {

       song s1 =  new song();
        System.out.println(s1.getArtist());
        System.out.println(s1.getTitle());
        s1.setArtist("shakira");
        s1.setTitle("whenever ");
        System.out.println(s1.getArtist());
        System.out.println(s1.getTitle());
    }
}
 class song{
    String artist, title ;

    void setArtist(String artist){this .artist = artist;}
    String getArtist(){return this.artist;}
    void setTitle(String title){this.title = title;}
    String getTitle(){return this.title;}
 }