 class Genshin {
    String weapon;
    String character;
    String artifact;

    Genshin(String character, String weapon, String artifact) {
        this.character = character;
        this.weapon = weapon;
        this.artifact = artifact;
        System.out.println("your character is " + character + " weapon : "+
                weapon + " and Artifact : " + artifact);
    }

}
public class party{
    public static void main(String[] args){
          Genshin play1 = new Genshin("Diluc","wolfs end","witch4");
          Genshin play2 = new Genshin("Kazuha","kshiforce","wind4");
          Genshin play3 = new Genshin("Bennet","kightsword","loyal4");
          Genshin play4 = new Genshin("hangtsu","twinsword","energycharge4");
    }
}