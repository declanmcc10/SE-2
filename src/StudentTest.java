import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {
	
	private Student student;
	private List<Student> students = new ArrayList<Student>();
	private List<Course> courses = new ArrayList<Course>();
	private List<Module> modules = new ArrayList<Module>();
	
	private Course courseFake = new Course("4ECE", students, modules, new Date(24-9-2016), new Date(30-5-2020));
	private Module moduleFake = new Module("Machine Learning", "CT4101", students, courses); 

	@BeforeEach
	void setUp() throws Exception {
		courses.add(courseFake);
		modules.add(moduleFake);
		
		student = new Student("Declan McCormack", 20, 16343043, new Date(24-02-1999), courses, modules);
	}

	@AfterEach
	void tearDown() throws Exception {
		
		student = null;
		assertNull(student);
	}

	@Test
	void testStudent() {
		assertNotNull(student);
	}

	@Test
	void testGetAge() {
		assertEquals(student.getAge(), 20);
	}

	@Test
	void testGetName() {
		assertEquals (student.getName(), "Declan McCormack");
	}

	@Test
	void testGetDob() {
		assertEquals(student.getDob(), new Date(24-02-1999));
	}

	@Test
	void testGetID() {
		assertEquals(student.getID(), 16343043);
	}
	

	@Test
	void testGenUsername() {
		String userName = "Declan McCormack" + Integer.toString(16343043);
		assertEquals(student.genUsername(), userName);
	}

	@Test
	void testGetCourses() {
		assertEquals(student.getCourses(), courses);
	}

	@Test
	void testGetModules() {
		assertEquals(student.getModules(), modules);
	}

	@Test
	void testSetName() {
		student.setName("Geralt Rivia");
		assertEquals(student.getName(), "Geralt Rivia");
	}

	@Test
	void testSetId() {
		student.setId(987654);
		assertEquals(student.getID(), 987654);
	}

	@Test
	void testSetAge() {
		student.setAge(21);
		assertEquals(student.getAge(), 21);
	}

	@Test
	void testSetDob() {
		student.setDob(new Date(18-07-1998));
		assertEquals(student.getDob(), new Date(18-07-1998));
	}

	@Test
	void testAddCourse() {
		courses.add(courseFake);
		assertEquals(courseFake, courses.get(1));
	}

	@Test
	void testAddModules() {
		modules.add(moduleFake);
		assertEquals(moduleFake, modules.get(1));
	}

}
