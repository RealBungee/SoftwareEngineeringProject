import java.util.Date;

public class Student {

    private String name, username;
    private int age, ID;
    private Module[] modules;
    private CourseProgram[] courses;
    private Date DOB;

    public Student(String name, int age, int ID, Module[] modules, CourseProgram[] courses, Date DOB){
        this.name = name;
        this.age = age;
        getUsername();
        this.modules = modules;
        this.courses = courses;
        this.DOB = DOB;
    }

    public Student(){}

    public void getUsername(){
        String ageString = Integer.toString(age);
        username = name + ageString;
    }

    public void setName(String name){ this.name = name; }
    public void setAge(int age){ this.age = age; }
    public void setID(int ID){ this.ID = ID; }
    public void setModules(Module[] modules){ this.modules = modules; }
    public void setCourses(CourseProgram[] courses){ this.courses = courses; }
    public void setDOB(Date DOB){ this.DOB = DOB; }

    public String getName(){ return name; }
    public int getAge(){ return age; }
    public int getID(){ return ID; }
    public Module[] getModules(){ return modules; }
    public CourseProgram[] getCourses(){ return courses; }
}
