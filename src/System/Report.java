package System;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Report {
    private String title;
    private String date;
    private String time;
    private String description;
    
    public Report(){
        title = "";
        date = "";
        time = "";
        description = "";
    }
    //save the data of report in reports file as the constructor is called
    public Report(String title, String date, String time, String description) throws IOException {
        this.title = title;
        this.date = date;
        this.time = time;
        this.description = description;
        saveDatatoReportsFiles();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }
    //As it is the last attribute to be set, then it will call all the variables to save in file.
    public void setDescription(String description) throws IOException {
        this.description = description;
        saveDatatoReportsFiles();
    }
    //transform attributes into long string to be saved in file
    public String getReportInfo(){
        return "Tile: " + this.getTitle() + "\n" + "Date:" + this.getDate() + "\n" + "Time: " + this.getTime() + "\n" +
                "Description: " + this.getDescription();
    }
    //save data from file as string form the getReportsInfo function
    private void saveDatatoReportsFiles() throws IOException{
        File reports = new File("C:\\Users\\Mr. White\\Documents\\NetBeansProjects\\Birthday Reservation System\\src\\System\\Reports.txt");
        FileWriter fr = new FileWriter(reports, true);
        fr.write(this.getReportInfo());
        fr.write("\n------------------------------------------------------ \n");
        fr.close();
    }
}
