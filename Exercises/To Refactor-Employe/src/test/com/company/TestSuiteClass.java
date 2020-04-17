package test.com.company;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.framework.Test;
import junit.framework.TestSuite;

@RunWith(Suite.class) 

 
@SuiteClasses({test.com.company.TestEmployee.class,test.com.company.TestEmployeeAccounts.class}) 

public class TestSuiteClass {

	 
}
