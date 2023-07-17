import java.util.Random;

public class Bear extends Obstacle{
    public Bear(){
        super("Bear",7,20,12);
    }

    @Override
    public int obstacleNumber(){
        Random r = new Random();
        int obstacleNumber = r.nextInt(1,3);
        return obstacleNumber;
    }
}
