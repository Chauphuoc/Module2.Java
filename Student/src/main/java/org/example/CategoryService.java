package org.example;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    public static List<Category> categories;

    public void initiate() {
        categories = new ArrayList<>();
        categories.add(new Category(1, "Apple"));
        categories.add(new Category(2,"Sam sung"));
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public static Category findCategoryByID (int id){
        for (Category a : categories){
            if (a.getId()==id){
                return a;
            }
        }
        return null;
    }
}
