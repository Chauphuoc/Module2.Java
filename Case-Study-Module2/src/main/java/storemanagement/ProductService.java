package storemanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    Scanner scanner = new Scanner(System.in);
    public List<Product> products;
    public void initiate(){
        products = new ArrayList<>();
        products.add(new Product("IPhone7plus",1,8000000,1,1));
        products.add(new Product("IPhone8plus",2,10000000,1,1));
        products.add(new Product("IPhoneXs",3,8900000,1,1));
        products.add(new Product("IPhone12Promax",4,14000000,1,1));
        products.add(new Product("SamSung A5",5,9100000,1,2));
        products.add(new Product("SamSung Galaxy Note 8",6,14500000,1,2));

    }
    public void addProduct(Product product){
        products.add(product);
    }
    public List<Product> getProduct(){
        return this.products;
    }

    public void sortByPriceProduct (){
        System.out.println("***Sort By Price***");
        System.out.println("1.Increasing Price");
        System.out.println("2.Decreasing Price");
        System.out.println("--Enter your choice--");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                ComparatorByIncreasingPrice comparator = new ComparatorByIncreasingPrice();
                products.sort(comparator);
                break;
            case 2:
                ComparatorByDecreasingPrice comparatorByDecreasingPrice = new ComparatorByDecreasingPrice();
                products.sort(comparatorByDecreasingPrice);
                break;
        }
    }
    public void removeProductbyID (){
        System.out.println("Enter ID you want to remove");
        int idRemove = Integer.parseInt(scanner.nextLine());
        Product product = findByIDProduct(idRemove);
        products.remove(product) ;
    }
    public void removeProductbyName (){
        System.out.println("Enter Name you want to remove");
        String name = scanner.nextLine();
        Product product= findByNameProduct(name);
        products.remove(product);
    }

    public void setProduct(ArrayList<Product> products){
        this.products = products;
    }
    public Product findByIDProduct (int id){
        for (Product product : products ) {
            if (product.getIdProduct() == id) {
                return product;
            }
        }
        return null;
    }
    public Product findByNameProduct (String name){
        for (Product product :products){
            if ((product.getName().toUpperCase()).equals(name)){
                return product;
            }
        }
        return null;
    }
}
