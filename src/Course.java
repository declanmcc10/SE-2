import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Course {

private String courseCode;
private List<Student> students = new ArrayList<Student>();
private List<Module> modules = new ArrayList<Module>();
private String startDate;
private String endDate;

public Course(String courseCode, List<Student> students, List<Module> modules, String startDate, String endDate) {
this.courseCode = courseCode;
this.students = students;
this.modules = modules;
this.startDate = startDate;
this.endDate = endDate;
}

public void setCourseCode(String courseCode) {
this.courseCode = courseCode;
}

public String getCourseCode() {
return this.courseCode;
}

public void addStudent(Student newStudent) {
students.add(newStudent);
}
public List<Student> getStudents() {
return students;
}

public void addModule(Module newModule) {
modules.add(newModule);
}
public List<Module> getModules() {
return modules;
}

public void setStartDate(String newStartDate) {
this.startDate = newStartDate;
}
public String getStartDate() {
return startDate;
}

public void setEndDate(String newEndDate) {
this.endDate = newEndDate;
}
public String getEndDate() {
return endDate;
}
}
