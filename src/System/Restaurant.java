package System;

public class Restaurant extends Place_Provider{
     private boolean OutDoor;

    public boolean isOutDoor() {
        return OutDoor;
    }

    public void setOutDoor(boolean OutDoor) {
        this.OutDoor = OutDoor;
    }
    public Restaurant(int NumberOfGuest, String Address, String PicsOfPlace) {
        super(NumberOfGuest, Address, PicsOfPlace);
    }
    
}
