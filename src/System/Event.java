package System;

public class Event {
    private int id;   
    private String status; 
    private String time; 
    private String date; 
    private Place_Provider place;
    private Decoration_Provider theme;
    private Food_Provider food;
    private Extra_Events_Provider extraEvents; 

    public Event(int Id, String Status, String Time, String Date, Place_Provider Place, Decoration_Provider Theme, Food_Provider Food, Extra_Events_Provider ExtraEvents) {
        this.id = Id;
        this.status = Status;
        this.time = Time;
        this.date = Date;
        this.place = Place;
        this.theme = Theme;
        this.food = Food;
        this.extraEvents = ExtraEvents;
    }

    public Food_Provider getFood() {
        return food;
    }

    public void setFood(Food_Provider Food) {
        this.food = Food;
    }

    public Decoration_Provider getTheme() {
        return theme;
    }

    public void setTheme(Decoration_Provider theme) {
        this.theme = theme;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String Status) {
        this.status = Status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String Time) {
        this.time = Time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String Date) {
        this.date = Date;
    }

    public Place_Provider getPlace() {
        return place;
    }

    public void setPlace(Place_Provider Place) {
        this.place = Place;
    }
    
    public String getEventInfo(){
        return "ID: " + this.getId() + "\n" + "Status:" + this.getStatus() + "\n" + "Time: " + this.getTime() + "\n" +
                "Date: " + this.getDate() + "Place: " + this.place.getPlaceData() + "\n" + "Theme: " + this.theme.getThemeInfo() + "\n" +
                "food: " + this.food.getFoodInfo() + "\n" + "Extra Events: " + this.extraEvents.getExtraEventInfo() + "\n";
    }
}
