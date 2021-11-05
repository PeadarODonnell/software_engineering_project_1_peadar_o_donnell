import java.util.ArrayList;

public class Module {
    private String name;
    private String ID;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Module(String name, String ID){
        this.name = name;
        this.ID = ID;

    }

    // get and ser name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }



    // get and set ID
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID = ID;
    }



    // get and set students
    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }
    public ArrayList<Student> getStudents(){
        return students;
    }



    // get and set courses
    public void setCourses(ArrayList<Course> courses){
        this.courses = courses;
    }
    public ArrayList<Course> getCourses(){
        return courses;
    }
}