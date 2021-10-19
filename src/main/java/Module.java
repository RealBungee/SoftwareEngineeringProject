public class Module {
    private String moduleName;
    private int ID;
    private Student[] students;
    private CourseProgram[] associatedCourses;

    public Module(String moduleName, int ID, Student[] students, CourseProgram[] associatedCourses){
        this.moduleName = moduleName;
        this.ID = ID;
        this.students = students;
        this.associatedCourses = associatedCourses;
    }

    public Module(){}

    public void setModuleName(String moduleName){ this.moduleName = moduleName; }
    public void setID(int ID){ this.ID = ID; }
    public void setStudents(Student[] students){ this.students = students; }
    public void setAssociatedCourses(CourseProgram[] associatedCourses){ this.associatedCourses = associatedCourses; }

    public String getModuleName(){ return moduleName; }
    public int getID(){ return ID; }
    public Student[] getStudents(){ return students; }
    public CourseProgram[] getAssociatedCourses(){ return associatedCourses; }

    @Override
    public String toString(){
        String str = "";
        str += "\nModule name: " + moduleName +
                " Module ID: " + ID;
        return str;
    }
}
