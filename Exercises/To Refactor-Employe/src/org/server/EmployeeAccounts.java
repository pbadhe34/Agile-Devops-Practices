package org.server;

public class EmployeeAccounts {
	
	private static int manDays = 20;
	
	public static int getManDays() {
		return manDays;
	}	 

	private static int paidLeaves = 10;
	
	public static int getPaidLeaves() {
		return paidLeaves;
	}	

	public int calculateGradeSalary(Employee employee) {
		 
		int grade = employee.getGrade();
		if(grade==1)
			 return 10000;
		else			
		return 15000;
	}

	public int calculateEarnedSalary(Employee employee) {
		int grossSalry = calculateGradeSalary(employee);
		int wdays = employee.getwDays();
		System.out.println("The wdays are "+wdays);
		int salary = grossSalry;
		 
		if(wdays==manDays)
			return salary;
		else if(wdays > manDays)
		{
			//calculate extra earning
			int extraSal = (grossSalry/manDays) *  (wdays - manDays);
			int amount = grossSalry + extraSal;
			salary = amount;			
		}
		
		else if(wdays < manDays)
		{
			 if((manDays - wdays) > paidLeaves) //leaves more than paidLeaves,so deduct  
			 {
				 int withoutPayDays = paidLeaves - manDays - wdays;
				 int lessaSal = (grossSalry/manDays) *  wdays;
				// System.out.println("The withoutPaydays are "+withoutPayDays);
				  
				 salary = lessaSal;		
			 }
			 else
				 salary =  grossSalry;  //consumedLeaves  within range of paidLeaves
			
		}
		 return salary;		
	}

	public int calculateSalary(Employee employee) {
		int sal = calculateEarnedSalary(employee);
		return sal;
	}

}
