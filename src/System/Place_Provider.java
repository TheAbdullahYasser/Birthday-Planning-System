package System;
import java.util.*;

public class Place_Provider {
    private int NumberOfGuest;
    private String Address;
    private String PicsOfPlace = "url:for photos of places";
    Sample sample;

    public Place_Provider(int NumberOfGuest, String Address, String PicsOfPlace) {
        this.NumberOfGuest = NumberOfGuest;
        this.Address = Address;
        this.PicsOfPlace = PicsOfPlace;
    }
    
    public int getNumberOfGuest() {
        return NumberOfGuest;
    }

    public void setNumberOfGuest(int NumberOfGuest) {
        this.NumberOfGuest = NumberOfGuest;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPicsOfPlace() {
        return PicsOfPlace;
    }

    public void setPicsOfPlace(String PicsOfPlace) {
        this.PicsOfPlace = PicsOfPlace;
    }
    
    public String getPlaceData(){
        return "NumberOfGuest: " + this.getNumberOfGuest() + "\n" + "Address: " + this.getAddress();
    }
    
     public void addPlaceSample(){
       sample= Sample.getInstance();
        Scanner sc = new Scanner (System.in);
        System.out.println("how many places sample do you want to add");
        int x=sc.nextInt();
        System.out.println("enter the" +x+"place");
        for(int i=0;i<x;i++){
        String z=sc.nextLine();
        sample.getPlaceSample().add(z);
        
        }
        System.out.println("the places have been added");
    }
}
