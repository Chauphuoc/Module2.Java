package storemanagement;

public class Product {
    private String name;
    private long idProduct;
    private int price;
    private int quantity;
    private int idCategory;

    public Product() {
    }

    public Product(String name, long idProduct, int price, int quantity, int idCategory) {
        this.name = name;
        this.idProduct = idProduct;
        this.price = price;
        this.quantity = quantity;
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(long idProduct) {
        this.idProduct = idProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", idProduct=" + idProduct +
                ", price=" + price +
                ", quantity=" + quantity +
                ", idCategory=" + idCategory +
                '}';
    }
}
