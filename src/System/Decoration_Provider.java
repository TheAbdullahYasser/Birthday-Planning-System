package System;
import java.util.*;

public class Decoration_Provider {
    private String LightMode; 
    private String Style;
    private String Ballons;
    private String AddtionalRequirments;
    private String PicsOfDecoration = "url:for photos of themes";;
    Sample sample;
    
    
     public Decoration_Provider(String LightMode, String Style, String Ballons, String AddtionalRequirments, String PicsOfDecoration) {
        this.LightMode = LightMode;
        this.Style = Style;
        this.Ballons = Ballons;
        this.AddtionalRequirments = AddtionalRequirments;
        this.PicsOfDecoration = PicsOfDecoration;
    }

    public String getLightMode() {
        return LightMode;
    }

    public void setLightMode(String LightMode) {
        this.LightMode = LightMode;
    }

    public String getStyle() {
        return Style;
    }

    public void setStyle(String Style) {
        this.Style = Style;
    }

    public String getBallons() {
        return Ballons;
    }

    public void setBallons(String Ballons) {
        this.Ballons = Ballons;
    }

    public String getAddtionalRequirments() {
        return AddtionalRequirments;
    }

    public void setAddtionalRequirments(String AddtionalRequirments) {
        this.AddtionalRequirments = AddtionalRequirments;
    }

    public String getPicsOfDecoration() {
        return PicsOfDecoration;
    }

    public void setPicsOfDecoration(String PicsOfDecoration) {
        this.PicsOfDecoration = PicsOfDecoration;
    }
    
    public String getThemeInfo(){
        return "LightMode: " + this.getLightMode() + "\n" + "Style: " + this.getStyle() + "\n" + "Ballons: " + this.getBallons() +
                "\n" + "AddtionalRequirments: " + this.getAddtionalRequirments();
    }
    
    public void addDecSample(){
        sample= Sample.getInstance();
        Scanner sc = new Scanner (System.in);
        System.out.println("how many decoration sample do you want to add");
        int x=sc.nextInt();
        System.out.println("enter the" +x+"decorations");
        for(int i=0;i<x;i++){
        String z=sc.nextLine();
        sample.getDecorationSample().add(z);
        
        }
        System.out.println("the decoration has been added");
    }
}
