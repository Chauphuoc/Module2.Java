package storemanagement;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public List<Product> products;
    public void initiate(){
        products = new ArrayList<>();
        products.add(new Product("IPhone7plus",1,8000000,1,1));
        products.add(new Product("IPhone8plus",2,10000000,1,1));
        products.add(new Product("IPhoneXs",1,8900000,1,1));
        products.add(new Product("IPhone12Promax",1,14000000,1,1));
    }
    public void addProduct(Product product){
        products.add(product);
    }
}
