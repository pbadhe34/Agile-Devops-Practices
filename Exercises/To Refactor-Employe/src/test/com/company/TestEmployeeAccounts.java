package test.com.company;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.server.Employee; 
import org.server.EmployeeAccounts;

public class TestEmployeeAccounts {

	
private EmployeeAccounts manager;
private Employee employee;
	
	@Before
	public void setup()
	{
		manager = new EmployeeAccounts();
		employee = new Employee();
	}
	
	@Test
	public void verifyEmployeeAccountsInstance()
	{ 
		 
		 assertNotNull(manager);
	}
	
	@Test
	public void verifyEmployeeGrade1Salary()
	{ 
		 employee.setGrade(1);
		 int  salary = manager.calculateGradeSalary(employee);

		 assertEquals(10000, salary);
		 
	}
	@Test
	public void verifyEmployeeGrade2Salary()
	{ 
		 employee.setGrade(2);
		 int  salary = manager.calculateGradeSalary(employee);

		 assertEquals(15000, salary);
		 
	}
	
	@Test
	public void verifyEmployeeEarnedSalaryForGrade1()
	{ 
		 employee.setGrade(1);
		 employee.setwDays(EmployeeAccounts.getManDays());
		 int  salary = manager.calculateEarnedSalary(employee);
		 assertEquals(10000, salary);
		 
	}
	@Test
	public void verifyEmployeeEarnedSalaryForGrade2()
	{ 
		 employee.setGrade(2);
		 employee.setwDays(EmployeeAccounts.getManDays());
		 int  salary = manager.calculateEarnedSalary(employee);
		 assertEquals(15000, salary);
		 
	}
	@Test
	public void verifyEmployeeExtraEarnedSalaryForGrade1()
	{ 
		 employee.setGrade(1);
		 employee.setwDays(EmployeeAccounts.getManDays() + 2);
		 int  salary = manager.calculateEarnedSalary(employee);
		 assertEquals(11000, salary);
		 
	}
	@Test
	public void verifyEmployeeExtraEarnedSalaryForGrade2()
	{ 
		 employee.setGrade(2);
		 employee.setwDays(EmployeeAccounts.getManDays() + 5);
		 int  salary = manager.calculateEarnedSalary(employee);
		 assertEquals(18750, salary);
		 
	}
	
	@Test
	public void verifyEmployeeLeaveEarnedSalaryForGrade1()
	{ 
		 employee.setGrade(1);
		 employee.setwDays(EmployeeAccounts.getManDays() - 5); //less days for work
		 int  salary = manager.calculateEarnedSalary(employee);
		 assertEquals(10000, salary);
		 
	}
	@Test
	public void verifyEmployeeLeaveEarnedSalaryForGrade2()
	{ 
		 employee.setGrade(2);
		 employee.setwDays(EmployeeAccounts.getManDays() - 5); //less days for work
		 int  salary = manager.calculateSalary(employee);
		 assertEquals(15000, salary);
		 
	}
	@Test
	public void verifyEmployeeWithoutPaySalaryForGrade1()
	{ 
		 employee.setGrade(1);
		 employee.setwDays(EmployeeAccounts.getManDays() - 15); //more days absent than paidLeaves
		 int  salary = manager.calculateSalary(employee);
		 assertEquals(2500, salary);
		 
	}
	@Test
	public void verifyEmployeeWithoutPaySalaryForGrade2()
	{ 
		 employee.setGrade(2);
		 employee.setwDays(EmployeeAccounts.getManDays() - 15); //more days absent than paidLeaves
		 int  salary = manager.calculateEarnedSalary(employee);
		 assertEquals(3750, salary);
		 
	}
	@Test
	public void verifyEmployeeSalaryForGrade1()
	{ 
		 employee.setGrade(1);
		 employee.setwDays(22); //more days absent than paidLeaves
		 int  salary = manager.calculateEarnedSalary(employee);
		 assertEquals(11000, salary);
		 
	}
	@Test
	public void verifyEmployeeSalaryForGrade2()
	{ 
		 employee.setGrade(1);
		 employee.setwDays(23); //more days absent than paidLeaves
		 int  salary = manager.calculateEarnedSalary(employee);
		 assertEquals(11500, salary);
		 
	}
	
}
