package System;

public class Bank extends Payment {
    private String accountNumber;
    private String name; 
    private String location;

    public Bank(String accountNumber, String name, String location, float amountOfMoney, String Method) {
        super(amountOfMoney, Method);
        this.accountNumber = accountNumber;
        this.name = name;
        this.location = location;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
}
