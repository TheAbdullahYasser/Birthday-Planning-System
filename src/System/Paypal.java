package System;

public class Paypal extends Payment {
    private String email;

    public Paypal(float amountOfMoney, String Method, String Email) {
        super(amountOfMoney, Method);
        this.email = Email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
