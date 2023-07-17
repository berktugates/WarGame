public abstract class BattleLoc extends Location{
    private Obstacle obstacle;
    public BattleLoc(Player player, String name){
        super(player,name);
    }
    @Override
    public abstract boolean onLocation();
}
