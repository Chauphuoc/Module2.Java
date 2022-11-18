package Abstract;

public class Car extends Vehicle{
    private String flue;

    public Car(String nameVehicle, Brand brand, String flue) {
        super(nameVehicle, brand);
        this.flue = flue;
    }

    public String getFlue() {
        return flue;
    }

    public void setFlue(String flue) {
        this.flue = flue;
    }

    @Override
    public double getSpeed() {
        return 70;
    }
}
