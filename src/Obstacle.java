import java.util.Random;
public abstract class Obstacle {
    private String id;
    private int damage;
    private int health;
    private int cost;

    public Obstacle(String id, int damage, int health, int cost){
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.cost = cost;
    }
    public abstract int  obstacleNumber();

    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
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

    public int getCost(){
        return this.cost;
    }
    public void setCost(int cost){
        this.cost = cost;
    }

}
