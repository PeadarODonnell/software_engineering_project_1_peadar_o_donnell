import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.joda.time.DateTime;
import org.junit.jupiter.api.*;
import org.springframework.util.Assert;

import java.util.ArrayList;

public class CourseTest {

    Course course;
    protected ArrayList<Student> students = new ArrayList<Student>();
    protected ArrayList<Module> modules = new ArrayList<Module>();

    @BeforeEach
    void setUp() {
        course = new Course("course 1", DateTime.parse("1998-10-11"), DateTime.parse("1998-10-11"));
        Student s_1 = new Student("Jimmy", 23, DateTime.parse("1998-10-11"), 1);
        Student s_2 = new Student("Johnny", 24, DateTime.parse("1997-10-11"), 2);
        Student s_3 = new Student("Jeff", 25, DateTime.parse("1996-10-11"), 3);
        students.add(s_1);
        students.add(s_2);
        students.add(s_3);
        course.setStudents(students);

        Module mod_1 = new Module("machine learning", "ML123");
        Module mod_2 = new Module("Artificial Intelligence", "AI123");
        Module mod_3 = new Module("Software Engineering", "SE123");
        modules.add(mod_1);
        modules.add(mod_2);
        modules.add(mod_3);
        course.setModules(modules);

    }



    @Test
    @DisplayName("Getting Name should work")
    void getName(){
        Assertions.assertEquals("course 1", course.getName());
    }

    @Test
    @DisplayName("setting name should work")
    void setName(){
        course.setName("course numero");
        Assertions.assertEquals("course numero", course.getName());
    }



    @Test
    @DisplayName("getting startdate should work")
    void getStartDate(){
        Assertions.assertEquals(DateTime.parse("1998-10-11"), course.getStartDate());
    }

    @Test
    @DisplayName("setting startDate should work")
    void setStartDate(){
        course.setStartDate(DateTime.parse("1996-10-11"));
        Assertions.assertEquals(DateTime.parse("1996-10-11"), course.getStartDate());
    }



    @Test
    @DisplayName("getting enddate should work")
    void getEndDate(){
        Assertions.assertEquals(DateTime.parse("1998-10-11"), course.getEndDate());
    }

    @Test
    @DisplayName("setting enddate should work")
    void setEndDate(){
        course.setEndDate(DateTime.parse("1996-10-11"));
        Assertions.assertEquals(DateTime.parse("1996-10-11"), course.getEndDate());
    }



    @Test
    @DisplayName("getting modules should work")
    void getModules(){
        Assertions.assertEquals(modules, course.getModules());
    }

    @Test
    @DisplayName("setting modules should work")
    void setModules(){
        Module mod_4 = new Module("class 1", "c1");
        Module mod_5 = new Module("class 2", "c2");
        Module mod_6 = new Module("class 3", "c3");
        ArrayList<Module> modules_2 = new ArrayList<Module>();
        modules_2.add(mod_4);
        modules_2.add(mod_5);
        modules_2.add(mod_6);
        course.setModules(modules_2);
        Assertions.assertEquals(modules_2, course.getModules());
    }



    @Test
    @DisplayName("getting students should work")
    void getStudents(){
        Assertions.assertEquals(students, course.getStudents());
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
        course.setStudents(students_2);

        Assertions.assertEquals(students_2, course.getStudents());
    }

}