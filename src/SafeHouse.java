public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player){
        super(player,"Safe House");
    }

    @Override
    public boolean onLocation(){
        System.out.println("Welcome to the safe house.");
        System.out.println("There are no monsters in the safe house. Your health is renewed!");
        return true;
    }
}
