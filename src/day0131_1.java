import java.util.Scanner;

class Game{
    String company;
    String gamename;
    double version;
    Game(String company){
        this.company = company;
    }

    double setversion(double version){
        return version;
    }

}
public class day0131_1 {
    public static void main(String[] args) {
        Game g = new Game("HoyoVerse");
        System.out.println(g.company);
        Scanner sc = new Scanner(System.in);
        
    }

}
