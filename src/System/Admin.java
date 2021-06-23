package System;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Admin extends User {
    private int officeNumber;
    private float salary;
    private static Admin uniqueInstance = null;
    private ArrayList<String> feedbacks;
    
    //defult constructor as it is private for implementing singlton
    private Admin() throws IOException{
        this.officeNumber = 0;
        this.salary = 0;
        this.feedbacks = new ArrayList<String>();
        setFeedbacks();
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    //set data to task
    public void createTask(int id, String title, String description, String initialDate, String dueDate, String status) throws IOException{  
        Task task = new Task();
        task.setId(id);
        task.setTitle(title);
        task.setDescription(description);
        task.setInitialDate(initialDate);
        task.setDueDate(dueDate);
        task.setStatus(status);
    }
   
    //edit specific task in the file of tasks using the id of the task, and then set to the commentToEdit attribute 
    public void editTask(int taskId, String commentToEdit, int newId, String newTitle, String newDescription, String newInitialDate, String newDueDate, String newStatus) throws FileNotFoundException, IOException{
        File tasksData = new File("C:\\Users\\Mr. White\\Documents\\NetBeansProjects\\Birthday Reservation System\\src\\System\\Tasks.txt");
        Scanner dataReader = new Scanner(tasksData);
            while (dataReader.hasNextLine()) {
              String data = dataReader.nextLine();
              if(data.equals("Id: "+taskId)){
                  for(int i = 0; i < 6; i++){
                      data = dataReader.nextLine();
                  }
                  String comment = "Comment To Edit: " + commentToEdit;
                  data.replaceAll(data, comment);
                  break;
              }
            }
      dataReader.close();
    }
    //get info of feadbacks from the feedbacks file and set it to the feedbacks arraylist
    private void setFeedbacks() throws FileNotFoundException, IOException{
        File feedbacksData = new File("C:\\Users\\Mr. White\\Documents\\NetBeansProjects\\Birthday Reservation System\\src\\System\\Feedbacks.txt");
        Scanner dataReader = new Scanner(feedbacksData);
            while (dataReader.hasNextLine()) {
                String data = dataReader.nextLine();
                this.feedbacks.add(data);
              }
        dataReader.close();
    }
    
    //view feedbacks from the arraylist of feedbacks
    public void viewFeedbacks(){
        for(String x : this.feedbacks){
           System.out.println(x);
        }
    }
      
    //get the reports data from the file of reports
    public void viewReports() throws FileNotFoundException{
        File reportsData = new File("C:\\Users\\Mr. White\\Documents\\NetBeansProjects\\Birthday Reservation System\\src\\System\\Reports.txt");
        Scanner dataReader = new Scanner(reportsData);
            while (dataReader.hasNextLine()) {
                String data = dataReader.nextLine();
                System.out.println(data);
              }
        dataReader.close();
    }
    
    public static Admin getAdminInstance() throws IOException{
        if(uniqueInstance == null){
            uniqueInstance = new Admin();
        }
        return uniqueInstance;
    }
    
    //make 1 admin 
    public static void main(String args[]) throws IOException{
        Admin admin = Admin.getAdminInstance();
        admin.setName("Omar");
        admin.setSsn(123456789);
    }
    
}
