package FileService;

import Comparator.ComparatorByDecreasingPrice;
import Comparator.ComparatorByIncreasingPrice;
import Model.ECategory;
import Model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    Scanner scanner = new Scanner(System.in);
    public List<Product> products;
    public ProductService(){
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\Case-Study-Module2\\src\\main\\data\\Product.txt");
        List<String> lines = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line="";
            while ((line = bufferedReader.readLine())!=null){
                lines.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
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
