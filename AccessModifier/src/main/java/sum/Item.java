package sum;

public class Item {
    public int ID;
    public String name;
    public double salesPrice;
    public String origin;

    public Item() {

    }

    public Item(int ID, String name, double salesPrice, String origin) {
        this.ID = ID;
        this.name = name;
        this.salesPrice = salesPrice;
        this.origin = origin;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setID(int newID) {
        this.ID = newID;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public String getOrigin() {
        return origin;
    }

//    public String toString() {
//        return "Item{" + "ID=" + ID + ",name:" + name + ", salesPrice" + salesPrice + ",origin:" + origin + "}";
//    }


    @Override
    public String toString() {
        return "Item{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", salesPrice=" + salesPrice +
                ", origin='" + origin + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();
        item1.setID(01);
        item1.setName("IphoneX");
        item1.setOrigin("Cellphone");
        item1.setSalesPrice(7000000);
        item2.setID(01);
        item2.setName("Iphone14");
        item2.setOrigin("Cellphone");
        item2.setSalesPrice(10000000);
        double sum = item1.getSalesPrice() + item2.getSalesPrice();
        System.out.println(item1.toString());
        System.out.println(item2.toString());
        System.out.println("Tong 2 san pham:" + sum);
    }
}


