import java.util.*;
public class Player {
    private String name;
    private int damage;
    private int health;
    private int money;

    public Player(String name){
        this.name = name;
    }

    public void selectChar(){
        Scanner input = new Scanner(System.in);
        GameChar [] gameChar = {new Samurai(), new Archer(), new Knighter()};
        System.out.println("--------------- Characters ---------------");
        for(GameChar character : gameChar){
            System.out.println("ID: \t" + character.getID() +
                    "\tName: \t" + character.getName() +
                    "\tDamage: \t" + character.getDamage() +
                    "\tHealth: \t" + character.getHealth() +
                    "\tMoney: \t" + character.getMoney());
        }
        System.out.print("Please choose to character: ");
        int choose = input.nextInt();
        System.out.println("-------------------------");
        switch(choose){
            case 1:
                initPlayer(new Samurai ());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knighter());
                break;
            default:
                initPlayer(new Samurai());
                break;
        }
    }

    public void initPlayer(GameChar gameChar){
        this.setName(gameChar.getName());
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());

        System.out.println(" Character Name: " + getName() +
                "\n Character Damage: " + getDamage() +
                "\n Character Health: " + getHealth() +
                "\n Character Money: " + getMoney());

        System.out.println("-------------------------");

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getDamage(){
        return this.damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public int getHealth(){
        return this.health;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getMoney(){
        return this.money;
    }

    public void setMoney(int money){
        this.money = money;
    }




}
