import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.joda.time.DateTime;
import org.junit.jupiter.api.*;
import java.util.ArrayList;

public class ModuleTest {

    Module module;
    protected ArrayList<Student> students = new ArrayList<Student>();
    protected ArrayList<Course> courses = new ArrayList<Course>();

    @BeforeEach
    void setUp(){
        module = new Module("numero uno", "NO1");
        Student s_1 = new Student("Jimmy", 23, DateTime.parse("1998-10-11"), 1);
        Student s_2 = new Student("Johnny", 24, DateTime.parse("1997-10-11"), 2);
        Student s_3 = new Student("Jeff", 25, DateTime.parse("1996-10-11"), 3);
        students.add(s_1);
        students.add(s_2);
        students.add(s_3);
        module.setStudents(students);

        Course c_1 = new Course("course 1", DateTime.parse("1998-10-11"), DateTime.parse("1998-10-11"));
        Course c_2 = new Course("course 2", DateTime.parse("1998-10-11"), DateTime.parse("1998-10-11"));
        Course c_3 = new Course("course 3", DateTime.parse("1998-10-11"), DateTime.parse("1998-10-11"));
        courses.add(c_1);
        courses.add(c_2);
        courses.add(c_3);
        module.setCourses(courses);

    }



    @Test
    @DisplayName("getting name should work")
    void getName(){
        Assertions.assertEquals("numero uno", module.getName());
    }

    @Test
    @DisplayName("setting name should work")
    void setName(){
        module.setName("the second one");
        Assertions.assertEquals("the second one", module.getName());
    }



    @Test
    @DisplayName("getting id should work")
    void getID(){
        Assertions.assertEquals("NO1", module.getID());
    }

    @Test
    @DisplayName("setting id should work")
    void setID(){
        module.setID("NO2");
        Assertions.assertEquals("NO2", module.getID());
    }



    @Test
    @DisplayName("getting students should work")
    void getStudents(){
        Assertions.assertEquals(students, module.getStudents());
    }

    @Test
    @DisplayName("setting students should work")
    void setStudents(){
        ArrayList<Student> students_2 = new ArrayList<Student>();
        Student s_4 = new Student("Joseph", 23, DateTime.parse("1998-10-11"), 1);
        Student s_5 = new Student("Jorn", 24, DateTime.parse("1997-10-11"), 2);
        Student s_6 = new Student("Jacob", 25, DateTime.parse("1996-10-11"), 3);
        students.add(s_4);
        students.add(s_5);
        students.add(s_6);
        module.setStudents(students_2);

        Assertions.assertEquals(students_2, module.getStudents());
    }



    @Test
    @DisplayName("Getting courses should work")
    void getCourses(){
        Assertions.assertEquals(courses, module.getCourses());
    }

    @Test
    @DisplayName("setting courses should work")
    void setCourses(){
        ArrayList<Course> courses_2 = new ArrayList<Course>();
        Course c_4 = new Course("course 4", DateTime.parse("1998-10-11"), DateTime.parse("1998-10-11"));
        Course c_5 = new Course("course 5", DateTime.parse("1998-10-11"), DateTime.parse("1998-10-11"));
        Course c_6 = new Course("course 6", DateTime.parse("1998-10-11"), DateTime.parse("1998-10-11"));
        courses.add(c_4);
        courses.add(c_5);
        courses.add(c_6);
        module.setCourses(courses_2);

        Assertions.assertEquals(courses_2, module.getCourses());
    }
}