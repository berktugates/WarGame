import java.util.Random;

public class Bear extends Obstacle{
    public Bear(String id, int damage, int health, int cost){
        super("Bear",7,20,12);
    }

    @Override
    public int obstacleNumber(){
        Random r = new Random();
        int obstacleNumber = r.nextInt(3);
        return obstacleNumber;
    }
}
