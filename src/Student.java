import java.util.Date;
import java.util.ArrayList;
import java.util.List;


public class Student {

	private String name;
	private String username;
	private int age;
	private int iD;
	private Date dob;
	private List<Course> courses = new ArrayList<Course>();
	private List<Module> modules = new ArrayList<Module>();
	
	
	public Student(String name, int age, int iD, Date dob, List<Course> courses, List<Module> modules) {
		this.name = name;
		this.age = age;
		this.iD = iD;
		this.dob = dob;
		this.courses = courses;
		this.modules = modules;
	}
	
	
	///Getters
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public int getID() {
		return iD;
	}
	
	public String getUsername() {
		return new String (name + iD);
	}

	public List<Course> getCourses() {
		return this.courses;
	}
	
	public List<Module> getModules() {
		return this.modules;
	}
	
	////Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(int iD) {
		this.iD = iD;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	public void addCourse(Course course) {
		this.courses.add(course);
	}
	
	public void addModules(Module module) {
		this.modules.add(module);
	}
	
}

