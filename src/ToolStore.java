public class ToolStore extends NormalLoc{
    private boolean control = true;

    private int lightArmor = 0;
    private int mediumArmor = 0;
    private int heavyArmor = 0;
    private int gun = 0;
    private int sword = 0;
    private int rifle = 0;
    public ToolStore(Player player){
        super(player,"Tool Store");
    }

    @Override
    public boolean onLocation(){
        System.out.println("-------------------------------------------");
        System.out.println("You are in the Tool Store. Which action do you want to apply?");
        System.out.println("1- Buy armors or weapons");
        System.out.println("2- Exit");
        System.out.print("Make your selection: ");
        int choose = input.nextInt();
        switch (choose){
            case 1:
                menu();
                break;
            case 2:
                control = false;
                System.out.println("Leaving the shop without buying anything.");
                break;

        }
        return true;
    }

    public void menu(){
        while(control){
            System.out.println("--------------------------------------------");
            System.out.println("Armors and Weapons");
            System.out.println("------------------------");
            System.out.println(
                    "1- Light Armor:\t Block: 1\t Money:15\n" +
                            "2- Medium Armor:\t Block: 3\t Money:25\n" +
                            "3- Heavy Armor:\t Block: 5\t Money:40\n" +
                            "4- Gun:\t Damage: 2\t Money 25\n" +
                            "5- Sword:\t Damage: 3\t Money 35\n" +
                            "6- Rifle:\t Damage: 7\t Money 45\n" +
                            "7- Exit");
            System.out.print("Have a tool you want to buy: ");
            int chooseArmor = input.nextInt();

            switch(chooseArmor){
                case 1:
                    if(this.player.getMoney() >= 15 && this.lightArmor == 0){
                        System.out.println("Light armor taken!");
                        this.lightArmor = 1;
                        this.player.setMoney(this.player.getMoney()-15);
                        if(this.mediumArmor != 0 || this.heavyArmor != 0){
                            this.mediumArmor = 0;
                            this.heavyArmor = 0;
                        }
                    }
                    System.out.println("-------- Owned --------");
                    System.out.println(
                            "Light Armor:" + this.lightArmor + "\n" +
                                    "Medium Armor: " + this.mediumArmor + "\n" +
                                    "Heavy Armor: " + this.heavyArmor + "\n" +
                                    "Gun: " + this.gun + "\n" +
                                    "Sword: " + this.sword + "\n" +
                                    "Rifle: " + this.rifle + "\n"
                    );
                    break;
                case 2:
                    if(this.player.getMoney() >= 25 && this.mediumArmor == 0){
                        System.out.println("Medium armor taken!");
                        this.mediumArmor = 1;
                        this.player.setMoney(this.player.getMoney()-25);
                        if(this.lightArmor != 0 || this.heavyArmor != 0){
                            this.lightArmor = 0;
                            this.heavyArmor = 0;
                        }
                    }
                    System.out.println("-------- Owned --------");
                    System.out.println(
                            "Light Armor:" + this.lightArmor + "\n" +
                                    "Medium Armor: " + this.mediumArmor + "\n" +
                                    "Heavy Armor: " + this.heavyArmor + "\n" +
                                    "Gun: " + this.gun + "\n" +
                                    "Sword: " + this.sword + "\n" +
                                    "Rifle: " + this.rifle + "\n"
                    );
                    break;
                case 3:
                    if(this.player.getMoney() >= 40 && this.heavyArmor == 0){
                        System.out.println("Heavy armor taken!");
                        this.heavyArmor = 1;
                        this.player.setMoney(this.player.getMoney()-40);
                        if(this.lightArmor != 0 || this.mediumArmor != 0){
                            this.lightArmor = 0;
                            this.mediumArmor = 0;
                        }
                    }
                    System.out.println("-------- Owned --------");
                    System.out.println(
                            "Light Armor:" + this.lightArmor + "\n" +
                                    "Medium Armor: " + this.mediumArmor + "\n" +
                                    "Heavy Armor: " + this.heavyArmor + "\n" +
                                    "Gun: " + this.gun + "\n" +
                                    "Sword: " + this.sword + "\n" +
                                    "Rifle: " + this.rifle + "\n"
                    );
                    break;

                case 4:
                    if(this.player.getMoney() >= 25 && this.gun == 0){
                        System.out.println("Gun weapon token!");
                        this.gun = 1;
                        this.player.setMoney(this.player.getMoney()-25);
                        if(this.sword != 0 || this.rifle != 0){
                            this.sword = 0;
                            this.rifle = 0;
                        }
                    }
                    System.out.println("-------- Owned --------");
                    System.out.println(
                            "Light Armor:" + this.lightArmor + "\n" +
                                    "Medium Armor: " + this.mediumArmor + "\n" +
                                    "Heavy Armor: " + this.heavyArmor + "\n" +
                                    "Gun: " + this.gun + "\n" +
                                    "Sword: " + this.sword + "\n" +
                                    "Rifle: " + this.rifle + "\n"
                    );
                    break;
                case 5:
                    if(this.player.getMoney() >= 35 && this.sword == 0){
                        System.out.println("Sword weapon token!");
                        this.sword = 1;
                        this.player.setMoney(this.player.getMoney()-35);
                        if(this.gun != 0 || this.rifle != 0){
                            this.gun = 0;
                            this.rifle = 0;
                        }
                    }
                    System.out.println("-------- Owned --------");
                    System.out.println(
                            "Light Armor:" + this.lightArmor + "\n" +
                                    "Medium Armor: " + this.mediumArmor + "\n" +
                                    "Heavy Armor: " + this.heavyArmor + "\n" +
                                    "Gun: " + this.gun + "\n" +
                                    "Sword: " + this.sword + "\n" +
                                    "Rifle: " + this.rifle + "\n"
                    );
                    break;

                case 6:
                    if(this.player.getMoney() >= 45 && this.rifle == 0){
                        System.out.println("Rifle weapon token!");
                        this.rifle = 1;
                        if(this.gun != 0 || this.sword != 0){
                            this.gun = 0;
                            this.sword = 0;
                        }
                    }
                    System.out.println("-------- Owned --------");
                    System.out.println(
                            "Light Armor:" + this.lightArmor + "\n" +
                                    "Medium Armor: " + this.mediumArmor + "\n" +
                                    "Heavy Armor: " + this.heavyArmor + "\n" +
                                    "Gun: " + this.gun + "\n" +
                                    "Sword: " + this.sword + "\n" +
                                    "Rifle: " + this.rifle + "\n"
                    );
                    break;

                case 7:
                    System.out.println("Leaving the store.");
                    control = false;
                    break;
                default:
                    System.out.println("Incorrect operation!");
                    break;
            }
        }
    }

}
