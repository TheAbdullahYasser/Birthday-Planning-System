package System;

public class Cafe extends Place_Provider{
    private boolean OutDoor;

    public Cafe(boolean OutDoor, int NumberOfGuest, String Address, String PicsOfPlace) {
        super(NumberOfGuest, Address, PicsOfPlace);
        this.OutDoor = OutDoor;
    }
    public boolean isOutDoor() {
        return OutDoor;
    }

    public void setOutDoor(boolean OutDoor) {
        this.OutDoor = OutDoor;
    }
}

