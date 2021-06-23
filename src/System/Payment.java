package System;

public abstract class Payment {
    private float amountOfMoney;
    private String method;
    
    public Payment(){
        amountOfMoney = 0;
        method = "";
    }
    
    public Payment(float amountOfMoney, String Method) {
        this.amountOfMoney = amountOfMoney;
        this.method = Method;
    }

    public float getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(float amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
    
    public boolean confirm(){
        boolean confirmed = false;
        return confirmed;
    }
    
    public void viewBalance(){
    
    }
    
    public void pay(){
        
    }
    
}
