import java.util.Random;

public class Weapons {
    private final int minDamage; 
    private final int maxDamage;
    public Weapons (int minDamage, int maxDamage) {
        this.minDamage = minDamage;
        this.maxDamage= maxDamage;
    }
    public int RollDamage(){
        Random randomNumbers = new Random();
        return randomNumbers.nextInt(minDamage,maxDamage);
    }
}
