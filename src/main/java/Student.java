import java.util.ArrayList;
import org.joda.time.*;

public class Student {

    private String name;
    private int age;
    private org.joda.time.DateTime DOB;
    private int ID;
    private String username;
    private ArrayList<Course> courses = new ArrayList<Course>();
    private ArrayList<Module> modules = new ArrayList<Module>();


    public Student(String name,
                   int age,
                   DateTime DOB,
                   int ID){
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
        username = name + age;
    }



    // get and set name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    // get and set age
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }



    // get and set ID
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }



    // get and set DOB
    public DateTime getDOB(){
        return DOB;
    }
    public void setDOB(DateTime DOB){
        this.DOB = DOB;
    }



    // set and get username
    public String getUsername(){
        return (username);
    }
    public void setUsername(String name, int age){
        this.name = name;
        this.age = age;
        username = name + age;
    }



    // get and set modules
    public ArrayList<Module> getModules() {
        return modules;
    }
    public void setModules(ArrayList<Module> modules){
        this.modules = modules;
    }



    // get and set courses
    public void setCourses(ArrayList<Course> courses){
        this.courses = courses;
    }
    public ArrayList<Course> getCourses(){
        return courses;
    }
}