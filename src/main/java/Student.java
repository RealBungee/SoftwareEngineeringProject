import java.util.Arrays;

public class Student {

    private String name, username;
    private int age, ID;
    private Module[] modules;
    private CourseProgram[] courses;
    private String DOB;

    public Student(String name, int age, int ID, Module[] modules, CourseProgram[] courses, String DOB){
        this.name = name;
        this.age = age;
        this.ID = ID;
        createUsername();
        this.modules = modules;
        this.courses = courses;
        this.DOB = DOB;
    }

    public Student(){}

    private void createUsername(){
        String tempName = name.replace(" ", "");
        String ageString = Integer.toString(age);
        username = tempName.concat(ageString);

    }

    public void setName(String name){
        this.name = name;
        createUsername();
    }
    public void setAge(int age){
        this.age = age;
        createUsername();
    }
    public void setID(int ID){ this.ID = ID; }
    public void setModules(Module[] modules){ this.modules = modules; }
    public void setCourses(CourseProgram[] courses){ this.courses = courses; }
    public void setDOB(String DOB){ this.DOB = DOB; }

    public String getName(){ return name; }
    public int getAge(){ return age; }
    public String getUsername(){ return username; }
    public int getID(){ return ID; }
    public String getDOB(){ return DOB; }
    public Module[] getModules(){ return modules; }
    public CourseProgram[] getCourses(){ return courses; }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("\nStudent name: ").append(name).append("\nStudent age: ").append(age).append("\nStudent username: ").append(username).append("\nStudent ID: ").append(ID);
        str.append("\nStudent DOB ").append(DOB).append("\nModules: ").append(Arrays.toString(modules)).append("\nCourses: ");
        for(CourseProgram c : courses){
            str.append(c.getCourseName());
            str.append("\n      ");
        }
        return str.toString();
    }
}
