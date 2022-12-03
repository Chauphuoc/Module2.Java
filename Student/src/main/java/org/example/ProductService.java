package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    Scanner scanner = new Scanner(System.in);
    public List<Product> products;

    public void initiate() {
        products = new ArrayList<>();
        products.add(new Product("IphoneX",1,8000,1,1));
        products.add(new Product("IphoneXs",2,10000,1,1));
        products.add(new Product("Iphone11",3,11000,1,1));
        products.add(new Product("Iphone8",4,7000,2,1));
        products.add(new Product("Note7",5,9000,1,2));
        products.add(new Product("Note8",6,7000,1,2));
    }

    public void addProduct (Product product){
        products.add(product);
    }

    public void editProduct (int id, Product product){
        for (Product p: products){
            if (id == p.getId()){
                p.updateProduct(product);
            }
        }
    }

    public void removeProduct(int id){
        Product a = findProductByID(id);
        products.remove(a);
    }



    public List<Product> getProducts(){
        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Product findProductByID (int id){
        for (Product product : products){
            if (id == product.getId()){
                return product;
            }
        }
        return null;
    }

    public Product findProductByname (String name){
        for (Product a :products){
            if ((a.getName().toUpperCase()).equals(name)){
                return a;
            }
        }
        return null;
    }


//    private int removeProduct() {
//        System.out.println("Enter ID Product you want to remove");
//        int idRemoveProduct = Integer.parseInt(scanner.next());
//        for (Product product : products){
//            if (product.getId()==idRemoveProduct){
//                return products.indexOf(product);
//            }
//        }
//        return -1;
//    }



}
