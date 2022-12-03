package Service;

import Model.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CategoryService {
    public static List<Category> categories;
    public void initiate (){
        categories = new ArrayList<>();
        categories.add(new Category(1,"Coffee"));
        categories.add(new Category(2,"Beer"));
        categories.add(new Category(3,"Milk Tea"));
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
    public static Category findCategoryByID (int id){
        for (Category category : categories){
            if (category.getIdCategory()==id){
                return category;
            }
        }
        return null;
    }
}
