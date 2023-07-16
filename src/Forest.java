public class Forest extends BattleLoc{
    public Forest(Player player){
        super(player,"Forest");
    }
    @Override
    public boolean onLocation(){
        System.out.println("Forest kısmındasın.");
        return true;
    }
    @Override
    public void combat(){

    }
}
