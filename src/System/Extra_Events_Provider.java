package System;

public class Extra_Events_Provider {
    private boolean included;
    private String picsOfExtraEvents = "url:for photos of extra events";;
    private String duration;
    
    public Extra_Events_Provider(){
        included = false;
        picsOfExtraEvents = "";
        duration = "";
    }
    
    public Extra_Events_Provider(boolean included, String PicsOfExtraEvents, String Duration) {
        this.included = included;
        this.picsOfExtraEvents = PicsOfExtraEvents;
        this.duration = Duration;
    }

    public boolean isIncluded() {
        return included;
    }

    public void setIncluded(boolean included) {
        this.included = included;
    }

    public String getPicsOfExtraEvents() {
        return picsOfExtraEvents;
    }

    public void setPicsOfExtraEvents(String PicsOfExtraEvents) {
        this.picsOfExtraEvents = PicsOfExtraEvents;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String Duration) {
        this.duration = Duration;
    }    
    
    public String getExtraEventInfo(){
        return "Included: " + this.isIncluded() + "\n" + "Duration: " + this.getDuration();
    }
}
