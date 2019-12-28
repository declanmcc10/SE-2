import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CourseTest {
	
	private Course course;
	private List<Course> courses = new ArrayList<Course>();
	private List<Student> students = new ArrayList<Student>();
	private List<Module> modules = new ArrayList<Module>();

	private Module moduleFake = new Module("Machine Learning", "CT4101", students, courses); 
	private Student studentFake = new Student("Declan McCormack", 20, 16343043, new Date(24-02-1999), courses, modules);
	
	@BeforeEach
	void setUp() throws Exception {
		modules.add(moduleFake);
		students.add(studentFake);
		
		course = new Course("4ECE", students, modules, "12-9-2016", "12-9-2019");
		
	}

	@AfterEach
	void tearDown() throws Exception {
		course = null;
		assertNull(course);
	}

	@Test
	void testCourse() {
		assertNotNull(course);
	}

	@Test
	void testSetCourseCode() {
		course.setCourseCode("4ECE");
		assertEquals(course.getCourseCode(), "4ECE");
	}

	@Test
	void testGetCourseCode() {
		assertEquals(course.getCourseCode(), "4ECE");
	}

	@Test
	void testAddStudent() {
		students.add(studentFake);
		assertEquals(studentFake, students.get(1));
	}

	@Test
	void testGetStudents() {
		assertEquals(course.getStudents(), students);
	}

	@Test
	void testAddModule() {
		modules.add(moduleFake);
		assertEquals(moduleFake, modules.get(1));
	}

	@Test
	void testGetModules() {
		assertEquals(course.getModules(), modules);
	}

	@Test
	void testSetStartDate() {
		course.setStartDate("01-9-2016");
		assertEquals(course.getStartDate(), "01-9-2016");
	}

	@Test
	void testGetStartDate() {
		assertEquals(course.getStartDate(), "12-9-2016");
		
	}

	@Test
	void testSetEndDate() {
		course.setStartDate("24-9-2020");
		assertEquals(course.getStartDate(), "24-9-2020");
	}

	@Test
	void testGetEndDate() {
		assertEquals(course.getEndDate(), "12-9-2019");
	}

}
