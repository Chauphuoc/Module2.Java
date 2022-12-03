package Abstract;

public abstract class Vehicle {
    protected String nameVehicle;
    protected Brand brand;

    public Vehicle(String nameVehicle, Brand brand) {
        this.nameVehicle = nameVehicle;
        this.brand = brand;
    }
    public String getNameBrand (){
        return this.brand.getBrand();
    }
    public void start (){
        System.out.println("Ready");
    }
    public void acceleration (){
        System.out.println("Acceleration");
    }
    public void stop (){
        System.out.println("Stoping");
    }
    public abstract double getSpeed();
    public String getNameVehicle() {
        return nameVehicle;
    }

    public void setNameVehicle(String nameVehicle) {
        this.nameVehicle = nameVehicle;
    }
}
