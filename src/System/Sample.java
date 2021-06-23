package System;
import java.util.*;

public class Sample implements Provided_sample{
    private static Sample sample = null;
      
    private ArrayList<String> PlaceSample;
    private ArrayList<String> FoodSample;
    private ArrayList<String> DecorationSample;
    private ArrayList<String> ExtraEventsSample;

    private Sample(ArrayList<String> PlaceSample, ArrayList<String> FoodSample, ArrayList<String> DecorationSample, ArrayList<String> ExtraEventsSample) {
        this.PlaceSample = PlaceSample;
        this.FoodSample = FoodSample;
        this.DecorationSample = DecorationSample;
        this.ExtraEventsSample = ExtraEventsSample;
    }
     private Sample() {
        this.PlaceSample = new ArrayList<String>();
        this.FoodSample = new ArrayList<String>();
        this.DecorationSample = new ArrayList<String>();
        this.ExtraEventsSample = new ArrayList<String>();
    }

    public ArrayList<String> getPlaceSample() {
        return PlaceSample;
    }

    public void setPlaceSample(ArrayList<String> PlaceSample) {
        this.PlaceSample = PlaceSample;
    }
 public static Sample getInstance(){
        
    if(sample == null){
        sample = new Sample(); 
        
    }
    return sample;
    
    }
    public ArrayList<String> getFoodSample() {
        return FoodSample;
    }

    public void setFoodSample(ArrayList<String> FoodSample) {
        this.FoodSample = FoodSample;
    }

    public ArrayList<String> getDecorationSample() {
        return DecorationSample;
    }

    public void setDecorationSample(ArrayList<String> DecorationSample) {
        this.DecorationSample = DecorationSample;
    }

    public ArrayList<String> getExtraEventsSample() {
        return ExtraEventsSample;
    }

    public void setExtraEventsSample(ArrayList<String> ExtraEventsSample) {
        this.ExtraEventsSample = ExtraEventsSample;
    }
    //read only fucntion for customer
      public void get_samples(){
          System.out.println("place samples");
      for(int i=0;i<PlaceSample.size();i++){
          System.out.println(PlaceSample.get(i));
      }
             System.out.println("food samples");
      for(int i=0;i<FoodSample.size();i++){
          System.out.println(FoodSample.get(i));
      }
             System.out.println("Decoration samples");
      for(int i=0;i<DecorationSample.size();i++){
          System.out.println(DecorationSample.get(i));
      }
             System.out.println("Extra Events samples");
      for(int i=0;i<ExtraEventsSample.size();i++){
          System.out.println(ExtraEventsSample.get(i));
      }
     }
//      public static void main(String args[]){
//          Sample s =Sample.getInstance();
//          
//      }
};
