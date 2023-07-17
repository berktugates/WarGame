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
        vampiresDamage *= count;
        int vampiresHealth = vampires.getHealth();
        vampiresHealth *= count;
        int vampiresCost = vampires.getCost();
        vampiresCost *= count;
        //----------------
        // Player Attribute
        int playerDamage = player.getDamage();
        int playerHealth = player.getHealth();
        int playerMoney = player.getMoney();
        //--------------

        // Match
        while(playerHealth > 0 && vampiresHealth > 0){
            ToolStore t = new ToolStore(this.player);
            System.out.println(player.getName() + " attack!");
            // Weapon olup olmadığını sor
            vampiresHealth-= playerDamage;
            System.out.println("Vampires attack!");
            // Armor olup olmadığını sor
            playerHealth -= vampiresDamage;
            if(vampiresHealth <= 0){
                System.out.println("Congratulations, you killed all the vampires!");
                return true;
            }
            else if(player.getHealth() <= 0){
                System.out.println("GAME OVER" + player.getName() + "character is dead");
            }
        }
        return true;
    }

}
