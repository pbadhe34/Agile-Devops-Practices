package test.com.company;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.server.Employee;

public class TestEmployee {
	
	private Employee emp;
	
	@Before
	public void setup()
	{
		emp = new Employee();
	}
	
	@Test
	public void verifyEmployeeInstance()
	{
		
		 assertNotNull(emp);
	}
	
	@Test
	public void verifyEmployeeGradeValues()
	{
		 emp.setGrade(1);
		 int empGrade = emp.getGrade();
		 
		 emp.setGrade(2);
		 empGrade = emp.getGrade();
		 assertEquals(2, empGrade);
	}

}
