import org.joda.time.DateTime;

import java.lang.reflect.Array;

public class CourseProgram {
    private String courseName;
    private Module[] modules;
    private Student[] studentsEnrolled;
    private DateTime startDate;
    private DateTime endDate;

    public CourseProgram(String courseName, Module[] modules, Student[] students, DateTime startDate, DateTime endDate){
        this.courseName = courseName;
        this.modules = modules;
        this.studentsEnrolled = students;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public CourseProgram(){}

    public void setCourseName(String courseName){ this.courseName = courseName; }
    public void setModules(Module[] modules){ this.modules = modules; }
    public void setStudents(Student[] students){ this.studentsEnrolled = students; }
    public void setStartDate(DateTime startDate){ this.startDate = startDate; }
    public void setEndDate(DateTime endDate){ this.endDate = endDate; }

    public String getCourseName(){ return  courseName; }
    public Module[] getModules(){ return  modules; }
    public Student[] getStudentsEnrolled(){ return studentsEnrolled; }
    public DateTime getStartDate(){ return startDate; }
    public DateTime getEndDate(){ return endDate; }

    @Override
    public String toString(){
        String str = "";
        str += "Course name: " + courseName +
                "\n         Start Date: " + startDate +
                "\n         End Date: " + endDate;
        return str;
    }
}
