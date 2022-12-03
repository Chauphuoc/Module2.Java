package Abstract;

public class test {
    public static void main(String[] args) {
        Brand brand1 = new Brand("Toyota","Japan");
        Brand brand2 = new Brand("Huynhdai","Korean");
        Brand brand3 = new Brand("Pegaut","Italia");

        Plane plane = new Plane("plane",brand1,"gas");
        Vehicle car = new Car("Accent",brand2,"gas");
        Vehicle bycicle = new Bycicle("X-men",brand3);
        System.out.println("First product:"+"\n1."+plane.brand.getBrand()+","+plane.brand.getCountry()+"\n2.Type off vehicle:"+plane.nameVehicle+"\n3.Type off Fuel:"+plane.getFuel());
        plane.takeOff();
    }
}
