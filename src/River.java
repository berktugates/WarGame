public class River extends BattleLoc{
    private int water;
        public River(Player player){
        super(player,"River");
        this.water = 0;
    }

    @Override
    public boolean onLocation(){
        Bear bear = new Bear();
        System.out.println("Welcome to River! Watch ot for bears!");
        int count = bear.obstacleNumber();
        System.out.println("Bear count: " + count);

        // Bear Attribute
        int bearDamage = bear.getDamage();
        int bearHealth = bear.getHealth();
        int bearCost = bear.getCost();
        //--------------
        // Player Attribute
        int playerDamage = player.getDamage();
        int playerHealth = player.getHealth();
        //--------------

        // Match
        ToolStore t = new ToolStore(this.player);
        int prize = 0;
        for(int i = 1; i<= count; i++){
            bearHealth = bear.getHealth();
            while(playerHealth > 0 && bearHealth > 0){
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
                bearHealth -= playerDamage;

                if(bearHealth < 0){
                    bearHealth = 0;
                }
                System.out.println("Player's Health: " + playerHealth + "\nBear's Health: " + bearHealth);
                System.out.println("----------------------------------------------------------------------");

                if(bearHealth == 0){
                    System.out.println("Congratulations, you killed the bear!");
                    player.setMoney(player.getMoney() + 12);
                    System.out.println("Player's money: " + player.getMoney());
                    System.out.println("----------------------------------------");
                    prize++;
                    break;
                }

                System.out.println("Bear attack!");
                if(t.getLightArmor() == 1){
                    bearDamage -= 1;
                }
                else if(t.getMediumArmor() == 1){
                    bearDamage -= 3;
                }
                else if(t.getHeavyArmor() == 1){
                    bearDamage -= 5;
                }

                playerHealth -= bearDamage;

                if(playerHealth < 0){
                    playerHealth = 0;
                }
                System.out.println("Player's Health: " + playerHealth + "\nBear's Health: " + bearHealth);

                if(playerHealth <= 0){
                    return false;
                }
            }
        }
        if(prize == count){
            System.out.println("Congratulations! You killed all the bears in the River!");
            this.water += 1;
            System.out.println("The item you earn is water: " + water);
        }
        return true;
    }

    public int getWater() {
        return this.water;
    }

    public void setWater(int water) {
        this.water = water;
    }

}
