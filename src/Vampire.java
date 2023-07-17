import java.util.Random;

public class Vampire extends Obstacle{
    public Vampire(){
        super("Vampire",4,14,7);
    }
    @Override
    public int obstacleNumber(){
        Random r = new Random();
        int obstacleNumber = r.nextInt(1,3);
        return obstacleNumber;
    }
}
