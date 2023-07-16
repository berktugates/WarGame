public abstract class GameChar {
    private int ID;
    private String name;
    private int damage;
    private int health;
    private int money;

    public GameChar(int ID, String name, int damage,int health,int money){
        this.ID = ID;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
    };

    public int getID(){
        return this.ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
