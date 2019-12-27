import java.util.List;
import java.util.ArrayList;


public class Module {

	private String moduleName = "";
	private int moduleId;
	private List<Student> studentList = new ArrayList<Student>();
	private List<Course> courses = new ArrayList<Course>();
	
	public Module(String name, int moduleId, List<Student> studentList, List<Course> courses) {
		this.moduleName = name;
		this.moduleId = moduleId;
		this.studentList = studentList;
		this.courses = courses;
	}
	
	public String getModuleName() {
		return moduleName;
	}
	
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	public int getModueId() {
		return moduleId;
	}
	
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	
	public List<Course> getCourses() {
		return this.courses;
	}
	
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public List<Student> getStudents() {
		return this.studentList;
	}
	
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	
	
}
