public class OffRoad extends Truck {
    private int groundClearance;

    public OffRoad(int passangers, int fuelCap, int mpg, int cargoCap, int groundClearance){
        super(passangers, fuelCap, mpg, cargoCap);
        this.groundClearance = groundClearance;
    }

    public int getGroundClearance(){
        return this.groundClearance;
    }

    public void setGroundClearance(int groundClearance){
        this.groundClearance = groundClearance;
    }
}
