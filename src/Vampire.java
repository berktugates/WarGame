import java.util.Random;

public class Vampire extends Obstacle{
    public Vampire(String id, int damage, int health, int cost){
        super("Vampire",4,14,7);
    }
    @Override
    public int obstacleNumber(){
        Random r = new Random();
        int obstacleNumber = r.nextInt(3);
        return obstacleNumber;
    }
}
