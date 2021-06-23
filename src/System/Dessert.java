package System;
import java.util.*;

public class Dessert extends Food_Provider{
   private ArrayList<String> Types;
   private String Type;

    public Dessert(ArrayList<String> Types, String Type, String ResturantName, String Menu, String PicOfFood) {
        super(ResturantName, Menu, PicOfFood);
        this.Types = Types;
        this.Type = Type;
    }

    public ArrayList<String> getTypes() {
        return Types;
    }

    public void setTypes(ArrayList<String> Types) {
        this.Types = Types;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
}