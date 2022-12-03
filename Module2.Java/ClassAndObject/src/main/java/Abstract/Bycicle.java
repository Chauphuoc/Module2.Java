package Abstract;

public class Bycicle extends Vehicle{
    public Bycicle(String nameVehicle, Brand brand) {
        super(nameVehicle, brand);
    }

    @Override
    public double getSpeed() {
        return 20;
    }
}
