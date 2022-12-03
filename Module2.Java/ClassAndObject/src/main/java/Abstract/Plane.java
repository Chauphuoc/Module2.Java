package Abstract;

public class Plane extends Vehicle{
    private String fuel;

    public Plane(String nameVehicle, Brand brand, String fuel) {
        super(nameVehicle, brand);
        this.fuel = fuel;
    }


    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public double getSpeed() {
        return 500;
    }
    public void takeOff (){
        System.out.println("The plane is takeoff");
    }
    public void land (){
        System.out.println("The plane is landing");
    }
}
