package storemanagement;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    List<Category> categories;
    public void initiate (){
        categories = new ArrayList<>();
        categories.add(new Category(1,"Apple"));
        categories.add(new Category(2,"Samsung"));
    }

}
