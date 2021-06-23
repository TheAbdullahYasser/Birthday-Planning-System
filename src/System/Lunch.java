package System;
import java.util.*;

public class Lunch extends Food_Provider{
     private ArrayList<String> Categories;
   private String Category;

    public ArrayList<String> getCategories() {
        return Categories;
    }

    public void setCategories(ArrayList<String> Categories) {
        this.Categories = Categories;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public Lunch(ArrayList<String> Categories, String Category, String ResturantName, String Menu, String PicOfFood) {
        super(ResturantName, Menu, PicOfFood);
        this.Categories = Categories;
        this.Category = Category;
    }
}
