package System;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Profile {
    private ArrayList<Event> events;
    private String preferredPayment;
    private Customer customerDetails;

    public Profile(ArrayList<Event> events, String preferredPayment, Customer customerDetails) {
        this.events = events;
        this.preferredPayment = preferredPayment;
        this.customerDetails = customerDetails;
    }

    public void getEvents() {
        for(Event e : events){
            System.out.println(e.getEventInfo());
        }
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public String getPreferredPayment() {
        return preferredPayment;
    }

    public void setPreferredPayment(String preferredPayment) {
        this.preferredPayment = preferredPayment;
    }

    public void getCustomerDetails() {
        System.out.println(customerDetails.getUserInfo());
    }

    public void setCustomerDetails(Customer customerDetails) {
        this.customerDetails = customerDetails;
    }
    
    public boolean editEvent(int eventId, Event newEvent){
        boolean edited = false;
        for(Event e : events){
            if(e.getId() == eventId){
                e = newEvent;
                edited = true;
                break;
            }
        }
        return edited;
    }
    
    public boolean resetPassword(String newPassword) throws FileNotFoundException{
        boolean reseted = false;
        File accountsData = new File("C:\\Users\\Mr. White\\Documents\\NetBeansProjects\\Birthday Reservation System\\src\\System\\accounts.txt");
        Scanner dataReader = new Scanner(accountsData);
            while (dataReader.hasNextLine()) {
                String data = dataReader.nextLine();
                if(data.equals(customerDetails.getUsername())){
                    data = dataReader.nextLine();
                    if(data.equals(customerDetails.getPassword())){
                        data.replaceAll(data, newPassword);
                        reseted = true;
                        break;
                    }
                }
              }
        dataReader.close();
        return reseted;
    }
    //pay to the prefferd payment method setted by the customer
    public void pay_to(Payment paymentMethod){
        paymentMethod.setMethod(this.preferredPayment);
        paymentMethod.pay();
    }

};
