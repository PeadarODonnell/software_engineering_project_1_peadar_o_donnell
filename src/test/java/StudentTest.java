import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.joda.time.DateTime;
import org.junit.jupiter.api.*;
import java.util.ArrayList;

public class StudentTest {

    Student student;
    protected ArrayList<Module> modules = new ArrayList<Module>();
    protected ArrayList<Course> courses = new ArrayList<Course>();


    @BeforeEach
    void setUp(){
        student = new Student(
                "Jimmy",
                23,
                DateTime.parse("1998-10-11"),
                1
        );

        Module mod_1 = new Module("machine learning", "ML123");
        Module mod_2 = new Module("Artificial Intelligence", "AI123");
        Module mod_3 = new Module("Software Engineering", "SE123");
        modules.add(mod_1);
        modules.add(mod_2);
        modules.add(mod_3);
        student.setModules(modules);

        Course c_1 = new Course("course 1", DateTime.parse("1998-10-11"), DateTime.parse("1998-10-11"));
        Course c_2 = new Course("course 2", DateTime.parse("1998-10-11"), DateTime.parse("1998-10-11"));
        Course c_3 = new Course("course 3", DateTime.parse("1998-10-11"), DateTime.parse("1998-10-11"));
        courses.add(c_1);
        courses.add(c_2);
        courses.add(c_3);
        student.setCourses(courses);
    }



    @Test
    @DisplayName("Getting username should work")
    void getUsername(){
        Assertions.assertEquals("Jimmy23", student.getUsername());
    }

    @Test
    @DisplayName("Setting Username should work")
    void setUsername(){
        student.setUsername("Jimothy", 25);
        Assertions.assertEquals("Jimothy25", student.getUsername());
    }



    @Test
    @DisplayName("getting age should work")
    void getAge(){
        Assertions.assertEquals(23, student.getAge());
    }

    @Test
    @DisplayName("setting age should work")
    void setAge(){
        student.setAge(24);
        Assertions.assertEquals(24, student.getAge());
    }



    @Test
    @DisplayName("Getting Name should work")
    void getName(){
        Assertions.assertEquals("Jimmy", student.getName());
    }

    @Test
    @DisplayName("Setting Name should work")
    void setName(){
        student.setName("Jimothy");
        Assertions.assertEquals("Jimothy", student.getName());
    }



    @Test
    @DisplayName("Getting DOB should work")
    void getDOB(){
        Assertions.assertEquals(DateTime.parse("1998-10-11"), student.getDOB());
    }

    @Test
    @DisplayName("Setting DOB should work")
    void setDOB(){
        student.setDOB(DateTime.parse("1956-04-11"));
        Assertions.assertEquals(DateTime.parse("1956-04-11"), student.getDOB());
    }



    @Test
    @DisplayName("Getting modules should work")
    void getModules(){
        Assertions.assertEquals(modules, student.getModules());
    }

    @Test
    @DisplayName("Setting modules should work")
    void setModules(){
        Module mod_4 = new Module("class 1", "c1");
        Module mod_5 = new Module("class 2", "c2");
        Module mod_6 = new Module("class 3", "c3");
        ArrayList<Module> modules_2 = new ArrayList<Module>();
        modules_2.add(mod_4);
        modules_2.add(mod_5);
        modules_2.add(mod_6);
        student.setModules(modules_2);
        Assertions.assertEquals(modules_2, student.getModules());
    }




    @Test
    @DisplayName("getting courses should work")
    void getCourses(){
        Assertions.assertEquals(courses, student.getCourses());
    }

    @Test
    @DisplayName("setting courses should work")
    void setCourses(){
        ArrayList<Course> courses_2 = new ArrayList<Course>();
        Course c_4 = new Course("course 4", DateTime.parse("1998-10-11"), DateTime.parse("1998-10-11"));
        Course c_5 = new Course("course 5", DateTime.parse("1998-10-11"), DateTime.parse("1998-10-11"));
        Course c_6 = new Course("course 6", DateTime.parse("1998-10-11"), DateTime.parse("1998-10-11"));
        courses_2.add(c_4);
        courses_2.add(c_5);
        courses_2.add(c_6);
        student.setCourses(courses_2);
        Assertions.assertEquals(courses_2, student.getCourses());
    }

}