import java.util.Random;

public class Zombie extends Obstacle{
    public Zombie(String id, int damage, int health, int cost){
        super("1",3,10,4);
    }

    @Override
    public int obstacleNumber() {
        Random r = new Random();
        int obstacleNumber = r.nextInt(1,3);
        return obstacleNumber;
    }
}
