package System;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public abstract class User {
    private String name;
    private int ssn;
    private String emailAddress;
    private String dateOfBirth;
    private String username;
    private String password;
 
    //default constructor
    public User(){
        this.name = "";
        this.ssn = 0;
        this.emailAddress = "";
        this.dateOfBirth = "";
        this.username = "";
        this.password = "";
    }
    //save the data of user in accounts file as the constructor is called
    public User(String name, int ssn, String emailAddress, String dateOfBirth, String username, String password) throws IOException {
        this.name = name;
        this.ssn = ssn;
        this.emailAddress = emailAddress;
        this.dateOfBirth = dateOfBirth;
        this.username = username;
        this.password = password;
        saveDataToAccountsFile();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    //As it is the last attribute to be set, then it will call all the variables to save in file.
    public void setPassword(String password)throws IOException {
        this.password = password;
        saveDataToAccountsFile();
    }
    //transform attributes into long string to be saved in file
    public String getUserInfo(){
        return "Name: " + this.getName() + "\n" + "SSN:" + this.getSsn() + "\n" + "Date Of Birth: " + this.getDateOfBirth() + "\n" + "Email: " + this.getEmailAddress() + "\n" +
                "Username: " + this.getUsername() + "\n" + "Password: " + this.getPassword();
    }
    //save credentials as "username:password" which will be easier to search in 
    private void savecredentials() throws IOException{
        File credentials = new File("C:\\Users\\Mr. White\\Documents\\NetBeansProjects\\Birthday Reservation System\\src\\Credentials.txt");
        FileWriter fr = new FileWriter(credentials, true);
        fr.write(this.getUsername() + ":" + this.getPassword());
        fr.write("\n------------------------------------------------------ \n");
        fr.close();
    }
    
    //to save the data of the user in file for accounts
    private void saveDataToAccountsFile() throws IOException{
        File accounts = new File("C:\\Users\\Mr. White\\Documents\\NetBeansProjects\\Birthday Reservation System\\src\\accounts.txt");
        FileWriter fr = new FileWriter(accounts, true);
        fr.write(this.getUserInfo());
        fr.write("\n------------------------------------------------------ \n");
        fr.close();
        savecredentials();
    }
    
public boolean login(String uname, String password) throws IOException{
        boolean found = false;
        File credentials = new File("C:\\Users\\Mr. White\\Documents\\NetBeansProjects\\Birthday Reservation System\\src\\accounts.txt");
        Scanner dataReader = new Scanner(credentials);
           while (dataReader.hasNextLine()) {
             String data = dataReader.nextLine();
             String loginData = uname + ":" + password;
             if(data.equals("Id: "+loginData)){
                 found = true; 
                 break;
             }
           }
      dataReader.close();
    return found;
}

};
