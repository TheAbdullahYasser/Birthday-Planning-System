package System;

public class Vella extends Place_Provider{
    private boolean Garden;
    private boolean roof;

    public Vella(boolean Garden, boolean roof, int NumberOfGuest, String Address, String PicsOfPlace) {
        super(NumberOfGuest, Address, PicsOfPlace);
        this.Garden = Garden;
        this.roof = roof;
    }

    public boolean isGarden() {
        return Garden;
    }

    public void setGarden(boolean Garden) {
        this.Garden = Garden;
    }

    public boolean isRoof() {
        return roof;
    }

    public void setRoof(boolean roof) {
        this.roof = roof;
    }

}
