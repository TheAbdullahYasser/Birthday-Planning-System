package System;

public class Clown extends Extra_Events_Provider{
     private int NumberOfClowns;

    public Clown(boolean included, String PicsOfExtraEvents, String Duration) {
        super(included, PicsOfExtraEvents, Duration);
    }

    public int getNumberOfClowns() {
        return NumberOfClowns;
    }

    public void setNumberOfClowns(int NumberOfClowns) {
        this.NumberOfClowns = NumberOfClowns;
    }

}