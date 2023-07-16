public class River extends BattleLoc{
    public River(Player player){
        super(player,"River");
    }
    @Override
    public boolean onLocation(){
        System.out.println("River kısmındasın");
        return true;
    }
    @Override
    public void combat(){

    }
}
