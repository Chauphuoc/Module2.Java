package Model;

import Service.CategoryService;

public class Product {
    private long idProduct;
    private String nameProduct;
    private double price;
    private int quantity;
    private int idBrand;

    public Product() {
    }

    public Product(long idProduct, String nameProduct, double price, int quantity, int idbrand) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.quantity = quantity;
        this.idBrand = idbrand;
    }

    public long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(long idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBrand() {
        return this.idBrand;
    }

    public void setBrand(int brand) {
        this.idBrand = brand;
    }


    @Override
    public String toString() {
        Category category = CategoryService.findCategoryByID(this.idBrand);
        String getNamBrand ="";
        if (category!=null){
            getNamBrand=category.getNameCategory();
        }
        System.out.printf("%10s %20s %20s %10s %10s","ID","Name product","Price","Quantity","Type");
        return
                String.format("%10s %20s %20s %10s %10s",this.idProduct,this.nameProduct,this.price,this.quantity,getNamBrand);
    }
}
