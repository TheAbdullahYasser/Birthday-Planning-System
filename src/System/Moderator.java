package System;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Moderator extends User{
    private int officeNumber;
    private float Salary;
    private ArrayList<Integer>tasks;
    private ArrayList<Report> reports;

    public Moderator() {
        this.officeNumber = 0;
        this.Salary = 0;
        tasks = new ArrayList<Integer>();
        reports = new ArrayList<Report>();
    }

    public Moderator(int officeNumber, float Salary, ArrayList<Integer> tasks, ArrayList<Report> reports, String name, int ssn, String emailAddress, String dateOfBirth, String username, String password) throws IOException {
        super(name, ssn, emailAddress, dateOfBirth, username, password);
        this.officeNumber = officeNumber;
        this.Salary = Salary;
        this.tasks = tasks;
        this.reports = reports;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float Salary) {
        this.Salary = Salary;
    }
    
    public void viewTasks(){
        for(int x : tasks){
            System.out.println(x);
        }
    }
    
    //set tasks for the moderator by the id of the task
    public void setTasks(int taskId) throws FileNotFoundException {
        File tasksData = new File("C:\\Users\\Mr. White\\Documents\\NetBeansProjects\\Birthday Reservation System\\src\\System\\Tasks.txt");
        Scanner dataReader = new Scanner(tasksData);
            while (dataReader.hasNextLine()) {
              String data = dataReader.nextLine();
              if(data.equals("Id: "+taskId)){
                  tasks.add(taskId);
              }
            }
      dataReader.close();
    }
    //create breport that will be saved to reports txt file and saved to the arraylist of reports created by the moderator
    public void createReports(String title, String date, String time, String decription) throws IOException {
        Report report = new Report();
        report.setTitle(title);
        report.setDate(date);
        report.setTime(time);
        report.setDescription(decription);
        
        reports.add(report);
    }
}
