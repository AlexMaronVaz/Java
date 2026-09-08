public class Truck extends Vehicle {
    private int cargoCap;

    public Truck(int passangers, int fuelCap, int mpg, int cargoCap){
        super(passangers, fuelCap, mpg);
        this.cargoCap = cargoCap;
    }

    public int getCargoCap(){
        return this.cargoCap;
    }

    public void setCargoCap(int cargoCap){
        this.cargoCap = cargoCap;
    }
}
