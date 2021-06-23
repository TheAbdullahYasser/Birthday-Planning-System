package System;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Task {
    private int id;
    private String title;  
    private String description;
    private String initialDate;
    private String dueDate;
    private String status;
    private String commentForEdit;
    
    public Task(){
        id = 0;
        title = "";
        description = "";
        initialDate = "";
        dueDate = "";
        status = "";
        commentForEdit= "";
    }
    //save the data of task in tasks file as the constructor is called
    public Task(int id, String title, String description, String initialDate, String dueDate, String status, String commentForEdit) throws IOException {
        this.id = id;
        this.title = title;
        this.description = description;
        this.initialDate = initialDate;
        this.dueDate = dueDate;
        this.status = status;
        this.commentForEdit = commentForEdit;
        saveDataToTasksFile();
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

   
    public String getStatus() {
        return status;
    }
    //As it is the last attribute to be set, then it will call all the variables to save in file.
    public void setStatus(String status) throws IOException{
        this.status = status;
        saveDataToTasksFile();
    }
    
    public String getCommentForEdit() {
        return commentForEdit;
    }

    public void setCommentForEdit(String commentForEdit) {
        this.commentForEdit = commentForEdit;
    }
    //transform attributes into long string to be saved in file
    private String getTaskInfo(){
        return "Id: " + this.getId() + "\n" + "Title:" + this.getTitle() + "\n" + "Description: " + this.getDescription() + "\n" + "Initial Date: " + this.getInitialDate() +
                "\n" + "Due Date: " + this.getDueDate() + "\n" + "Status: " + this.getStatus() + "\n" + "Comment For Edit: " + this.getCommentForEdit();
    }
    //save data from file as string form the getTaskInfo function
    private void saveDataToTasksFile() throws IOException{
            File tasks = new File("C:\\Users\\Mr. White\\Documents\\NetBeansProjects\\Birthday Reservation System\\src\\System\\Tasks.txt");
            FileWriter fr = new FileWriter(tasks, true);
            fr.write(this.getTaskInfo());
            fr.write("\n------------------------------------------------------ \n");
            fr.close();
    }
    
//    public static void main(String args[]) throws IOException{
//        Task x = new Task();
//        x.setId(100);
//        x.setTitle("test");
//        x.setDescription("testing for admin");
//        x.setInitialDate("05/15/2021");
//        x.setDueDate("05/20/2021");
//        x.setStatus("Delivered");
//    }
}
