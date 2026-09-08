public class Vehicle {
    private int passangers, fuelCap, mpg;
    public Vehicle(int passangers, int fuelCap, int mpg){
        this.passangers = passangers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
    }

    //métodos get
    public int getPassangers(){
        return this.passangers;
    }
    public int getFuelCap(){
        return this.fuelCap;
    }
    public int getMpg(){
        return this.mpg;
    }

    //métodos set
    public void setPassangers(int passangers){
        this.passangers = passangers;
    }
    public void setFuelCap(int fuelCap){
        this.fuelCap = fuelCap;
    }
    public void setMpg(int mpg){
        this.mpg = mpg;
    }
}
