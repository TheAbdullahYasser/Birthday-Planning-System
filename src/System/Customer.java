package System;

import java.io.IOException;
import java.util.*;

public class Customer extends User{

    private Feedback feedback;
    Provided_sample samples;
    
    //default constructor
    public Customer() {
        feedback = new Feedback();
    }

    public Customer(Provided_sample samples, Feedback feedback, String name, int ssn, String emailAddress, String dateOfBirth, String username, String password) throws IOException {
        super(name, ssn, emailAddress, dateOfBirth, username, password);
        this.feedback = feedback;
        this.samples = samples;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }
    
    public void signup(String name, int ssn, String emailAddress, String dateOfBirth, String username, String password) throws IOException{
        this.setName(name);
        this.setSsn(ssn);
        this.setEmailAddress(emailAddress);
        this.setDateOfBirth(dateOfBirth);
        this.setUsername(username);
        this.setPassword(password);
    }
   
    public void view_samples(){
        samples.get_samples();
    }
}
