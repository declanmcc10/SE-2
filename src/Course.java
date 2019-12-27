import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Course {

private String courseCode;
private List<Student> students = new ArrayList<Student>();
private List<Module> modules = new ArrayList<Module>();
private Date startDate = new Date();
private Date endDate = new Date();

public Course(String courseCode, List<Student> students, List<Module> modules, Date start, Date end) {
this.courseCode = courseCode;
this.students = students;
this.modules = modules;
this.startDate = start;
this.endDate = end;
}

public void setCoureCode(String courseCode) {
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

public void setStartDate(Date newStartDate) {
this.startDate = newStartDate;
}
public Date getStartDate() {
return startDate;
}

public void setEndDate(Date newEndDate) {
this.endDate = newEndDate;
}
public Date getEndDate() {
return endDate;
}
}
