import org.joda.time.*;
import java.util.ArrayList;

public class Course {

    // initialize variables
    private String name;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private org.joda.time.DateTime startDate;
    private org.joda.time.DateTime endDate;



    public Course(String name,
                  DateTime startDate,
                  DateTime endDate)
    {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }



    // get and set name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }



    // get and set start date
    public DateTime getStartDate(){
        return startDate;
    }
    public void setStartDate(DateTime startDate){
        this.startDate = startDate;
    }



    // get and set endDate
    public DateTime getEndDate(){
        return endDate;
    }
    public void setEndDate(DateTime endDate){
        this.endDate = endDate;
    }



    // get and set students
    public ArrayList<Student> getStudents(){
        return students;
    }
    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }



    // get and set modules
    public ArrayList<Module> getModules(){
        return modules;
    }
    public void setModules(ArrayList<Module> modules){
        this.modules = modules;
    }
}