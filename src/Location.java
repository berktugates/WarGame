import java.util.Scanner;

public abstract class Location {
    protected Scanner input = new Scanner(System.in);
    Player player;
    String name;
    public Location(Player player, String name){
        this.player = player;
        this.name = name;
    }

    public abstract boolean onLocation();

}
