package System;
import java.util.*;

public class Food_Provider {
    private String ResturantName;
    private String Menu;
    private String PicOfFood = "url:for photos of food";;
    Sample sample;
    
    public Food_Provider(String ResturantName, String Menu, String PicOfFood) {
        this.ResturantName = ResturantName;
        this.Menu = Menu;
        this.PicOfFood = PicOfFood;
    }
    
    public String getResturantName() {
        return ResturantName;
    }

    public void setResturantName(String ResturantName) {
        this.ResturantName = ResturantName;
    }

    public String getMenu() {
        return Menu;
    }

    public void setMenu(String Menu) {
        this.Menu = Menu;
    }

    public String getPicOfFood() {
        return PicOfFood;
    }

    public void setPicOfFood(String PicOfFood) {
        this.PicOfFood = PicOfFood;
    }

    public String getFoodInfo(){
        return "ResturantName: " + this.getResturantName() + "\n" + "Menu: " + this.getMenu();
    }
    
     public void addFoodSample(){
       sample= Sample.getInstance();
        Scanner sc = new Scanner (System.in);
        System.out.println("how many Food sample do you want to add");
        int x=sc.nextInt();
        System.out.println("enter the" +x+"place");
        for(int i=0;i<x;i++){
        String z=sc.nextLine();
        sample.getFoodSample().add(z);
        
        }
        System.out.println("the Food have been added");
    }
}
