public class Cave extends BattleLoc{
    public Cave(Player player){
        super(player,"Cave");
    }
    @Override
    public boolean onLocation(){
        System.out.println("Cave kısmındasın!");
        return true;
    }
    @Override
    public void combat(){

    }
}
