package Service;

import Model.Product;

import java.util.List;

public interface InterfaceProductService {
    List<Product> showProductView();
    void addProduct ();
    void removeProductByID ();
    void updateProduct ();
    Product findProductByID(long id);
    Product findProductByName (String name);
    void sortByPrice();
    void sortByName();
    void sortByQuantity();

}
