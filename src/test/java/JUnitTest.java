import org.junit.Test;
import org.joda.time.DateTime;

public class JUnitTest {

    @Test
    public void testFunctionality(){
        Student[] students;
        students = createObjects();
        if(students[1] != null){
            System.out.println("Student, Courses and Modules objects successfully created");
        } else {
            System.out.println("Failed to creat Student, Course and Module objects");
        }
        if(students[0].getUsername().equals("NikolaBanek21")) {
            System.out.println("Create username function works!");
        } else {
            System.out.println("Create username function failed");
        }
        for (Student s : students){
            System.out.println(s);
        }
        System.out.println("Student getter methods successfully tested and working!");
    }

    private Student[] createObjects(){
        Student student1, student2, student3;
        CourseProgram course1, course2;
        Module maths, programming, english, statistics, psychology;

        course1 = new CourseProgram();
        course2 = new CourseProgram();
        CourseProgram[] ComputerScience = { course1 };
        CourseProgram[] ArtsPsychology = { course2 };
        CourseProgram[] ComputerScienceAndPsychology = { course1, course2};

        maths = new Module();
        programming = new Module();
        english = new Module();
        statistics = new Module();
        psychology = new Module();
        Module[] CompSciModules = { maths, programming, statistics };
        Module[] PsychologyModules = {english, statistics, psychology};
        Module[] CompSciAndPsychology = { maths, programming, statistics, english, psychology };

        student1 = new Student("Nikola Banek", 21, 1274145, CompSciModules, ComputerScience, "11/01/2000");
        student2 = new Student("Sean Conroy", 22, 1522313, PsychologyModules, ArtsPsychology, "06/04/1999");
        student3 = new Student("Steve Jobs", 34, 1101101, CompSciAndPsychology, ComputerScienceAndPsychology, "01/04/1987");

        Student[] computerScienceStudents = { student1, student3 };
        Student[] psychologyStudents = { student2 };
        Student[] computerScienceAndPsychologyStudents = { student1, student2, student3 };

        course1.setCourseName("Computer Science");
        course1.setStudents(computerScienceStudents);
        course1.setModules(CompSciModules);
        course1.setStartDate(new DateTime(2016,9,1,0,0));
        course1.setEndDate( new DateTime(2020, 5, 12, 0, 0));

        course2.setCourseName("Arts Psychology");
        course2.setStudents(psychologyStudents);
        course2.setModules(PsychologyModules);
        course2.setStartDate(new DateTime(2016, 9, 8, 0, 0));
        course2.setEndDate(new DateTime(2020, 5, 25, 0, 0));

        System.out.println("Course setter methods successfully tested and working!");

        maths.setModuleName("Mathematics");
        maths.setID(1234);
        maths.setStudents(computerScienceStudents);
        maths.setAssociatedCourses(ComputerScience);

        programming.setModuleName("C Programming");
        programming.setID(1235);
        programming.setStudents(computerScienceStudents);
        programming.setAssociatedCourses(ComputerScience);

        english.setModuleName("English Language");
        english.setID(2256);
        english.setStudents(psychologyStudents);
        english.setAssociatedCourses(ArtsPsychology);

        statistics.setModuleName("Statistical Science");
        statistics.setID(1236);
        statistics.setStudents(computerScienceAndPsychologyStudents);
        statistics.setAssociatedCourses(ComputerScienceAndPsychology);

        psychology.setModuleName("Human Psychology");
        psychology.setID(2257);
        psychology.setStudents(psychologyStudents);
        psychology.setAssociatedCourses(ArtsPsychology);

        System.out.println("Module setter methods successfully tested and working!");

        Student[] students = { student1,student2,student3 };

        return students;
    }
}
