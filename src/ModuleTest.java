import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ModuleTest {
	
	private Module module;
	
	private List<Course> courses = new ArrayList<Course>();
	private List<Student> students = new ArrayList<Student>();
	private List<Module> modules = new ArrayList<Module>();

	private Student studentFake = new Student("Declan McCormack", 20, 16343043, new Date(24-02-1999), courses, modules);
	private Course courseFake = new Course("4ECE", students, modules, "24-09-2016", "30-5-2020");
	
	@BeforeEach
	void setUp() throws Exception {
		
		students.add(studentFake);
		courses.add(courseFake);
		module = new Module("Machine Learning", "CT4101", students, courses); 
	}

	@AfterEach
	void tearDown() throws Exception {
		module=null;
		assertNull(module);
	}

	@Test
	void testModule() {
		assertNotNull(module);
	}

	@Test
	void testGetModuleName() {
		assertEquals(module.getModuleName(), "Machine Learning");
	}

	@Test
	void testSetModuleName() {
		module.setModuleName("Telecomms");
		assertEquals(module.getModuleName(), "Telecomms");
	}

	@Test
	void testGetModuleId() {
		assertEquals(module.getModuleId(), "CT4101");
	}

	@Test
	void testSetModuleId() {
		module.setModuleId("testModuleId");
		assertEquals(module.getModuleId(), "testModuleId");
	}

	@Test
	void testGetCourses() {
		assertEquals(module.getCourses(), courses);
	}

	@Test
	void testGetStudents() {
		assertEquals(module.getStudents(), students);
	}

	@Test
	void testSetStudentList() {
		
	}

}
