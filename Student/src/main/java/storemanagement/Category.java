package storemanagement;

public class Category {
    private int idCategory;
    private String brand;

    public Category() {
    }

    public Category(int idCategory, String brand) {
        this.idCategory = idCategory;
        this.brand = brand;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
