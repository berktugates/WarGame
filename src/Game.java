import java.util.*;
public class Game {
    private Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("Welcome to War Game!");
        System.out.print("Please enter the name: ");
        String playerName = input.nextLine();
        System.out.println("Hello " + playerName + " , welcome to this tough battle! May luck be with you.");
        Player p1 = new Player(playerName);
        p1.selectChar();

        Location location = null;
        while(true){
            System.out.println("--------------- Locations ---------------");
            System.out.println("1) Safe House\n2) Tool Store\n3) Forest\n4) Cave\n5) River");
            System.out.print("Please choose where you want to go: ");
            int locChoose = input.nextInt();

            switch (locChoose){
                case 1:
                    location = new SafeHouse(p1);
                    location.onLocation();
                    break;
                case 2:
                    location = new ToolStore(p1);
                    location.onLocation();
                    break;

                case 3:
                    location = new Forest(p1);
                    location.onLocation();
                    break;
                case 4:
                    location = new Cave(p1);
                    location.onLocation();
                    break;
                case 5:
                    location = new River(p1);
                    location.onLocation();
                    break;
                default:
                    location = new SafeHouse(p1);
                    break;
            }
            location.onLocation();

            if(!location.onLocation()){
                System.out.println("GAME OVER");
            }
        }

    }
}
