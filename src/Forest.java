public class Forest extends BattleLoc{
    public Forest(Player player){
        super(player,"Forest");
    }
    @Override
    public boolean onLocation(){
        Vampire vampires = new Vampire();
        System.out.println("Welcome to Forest! Beware of vampires!");
        int count = vampires.obstacleNumber();
        System.out.println("Vampire count: " + count);

        // Vampires Attribute
        int vampiresDamage = vampires.getDamage();
        int vampiresHealth = vampires.getHealth();
        int vampiresCost = vampires.getCost();
        //----------------
        // Player Attribute
        int playerDamage = player.getDamage();
        int playerHealth = player.getHealth();
        //--------------

        // Match
        ToolStore t = new ToolStore(this.player);
        for(int i = 1; i<= count; i++){
            vampiresHealth = vampires.getHealth();
            while(playerHealth > 0 && vampiresHealth > 0){
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
                vampiresHealth -= playerDamage;

                if(vampiresHealth < 0){
                    vampiresHealth = 0;
                }
                System.out.println("Player's Health: " + playerHealth + "\nVampire's Health: " + vampiresHealth);
                System.out.println("----------------------------------------------------------------------");

                if(vampiresHealth == 0){
                    System.out.println("Congratulations, you killed the vampire!");
                    player.setMoney(player.getMoney() + 7);
                    System.out.println("Player's money: " + player.getMoney());
                    System.out.println("----------------------------------------");
                    break;
                }

                System.out.println("Vampire attack!");
                if(t.getLightArmor() == 1){
                    vampiresDamage -= 1;
                }
                else if(t.getMediumArmor() == 1){
                    vampiresDamage -= 3;
                }
                else if(t.getHeavyArmor() == 1){
                    vampiresDamage = 0;
                }

                playerHealth -= vampiresDamage;
                if(playerHealth < 0){
                    playerHealth = 0;
                }
                System.out.println("Player's Health: " + playerHealth + "\nVampire's Health: " + vampiresHealth);

                if(player.getHealth() <= 0){
                    System.out.println("GAME OVER" + player.getName() + "character is dead");
                    return false;
                }
            }


        }
        return true;
    }

}

