public class Cave extends BattleLoc{
    private int food;
    public Cave(Player player){
        super(player,"Cave");
        this.food = 0;
    }
    @Override
    public boolean onLocation(){
        Zombie zombies = new Zombie();
        System.out.println("Welcome to the cave! Watch out for zombies");
        int count = zombies.obstacleNumber();
        System.out.println("Zombie count: " + count);
        // Zombies Attributes
        int zombieDamage = zombies.getDamage();
        int zombieHealth = zombies.getHealth();

        // Player Attributes
        int playerDamage = player.getDamage();
        int playerHealth = player.getHealth();

        ToolStore t = new ToolStore(this.player);
        int prize = 0;
        for(int i = 1; i<= count; i++){
            zombieHealth = zombies.getHealth();
            while(playerHealth > 0 && zombieHealth > 0){
                System.out.println("----------------------------------------------------------------------");
                System.out.println(player.getName() + " attack!");
                if(t.getGun() == 1){
                    playerDamage += 2;
                }
                else if(t.getSword() == 1){
                    playerDamage += 4;
                }
                else if(t.getRifle() == 1){
                    playerDamage += 7;
                }
                zombieHealth -= playerDamage;

                if(zombieHealth < 0){
                    zombieHealth = 0;
                }
                System.out.println("Player's Health: " + playerHealth + "\nZombie's Health: " + zombieHealth);
                System.out.println("----------------------------------------------------------------------");

                if(zombieHealth == 0){
                    System.out.println("Congratulations, you killed the zombie!");
                    player.setMoney(player.getMoney() + 4);
                    prize++;
                    System.out.println("Player's money: " + player.getMoney());
                    System.out.println("----------------------------------------");
                    break;
                }

                System.out.println("Zombie attack!");
                if(t.getLightArmor() == 1){
                    zombieDamage -= 1;
                }
                else if(t.getMediumArmor() == 1){
                    zombieDamage -= 3;
                }
                else if(t.getHeavyArmor() == 1){
                    zombieDamage = 0;
                }

                playerHealth -= zombieDamage;
                if(playerHealth < 0){
                    playerHealth = 0;
                }
                System.out.println("Player's Health: " + playerHealth + "\nZombie's Health: " + zombieHealth);

                if(playerHealth <= 0){
                    return false;
                }
            }


        }
        if(prize == count){
            System.out.println("Congratulations! You killed all the zombies in the Cave!");
            this.food += 1;
            System.out.println("The item you earn is food: " + this.food);
        }
        return true;
    }

    public int getFood() {
        return this.food;
    }

    public void setFood(int food) {
        this.food = food;
    }

}
