package System;

public class Magician extends Extra_Events_Provider{
    private int NumberOfTricks;

    public Magician(boolean included, String PicsOfExtraEvents, String Duration) {
        super(included, PicsOfExtraEvents, Duration);
    }

    public int getNumberOfTricks() {
        return NumberOfTricks;
    }

    public void setNumberOfTricks(int NumberOfTricks) {
        this.NumberOfTricks = NumberOfTricks;
    }
    
}
