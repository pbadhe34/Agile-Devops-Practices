package org.server;

public class Employee {
   private int grade;
   private String id;
   private int wDays;
   public int getwDays() {
	return wDays;
}

public void setwDays(int wDays) {
	this.wDays = wDays;
}

public int getExtraHrs() {
	return extraHrs;
}

public void setExtraHrs(int extraHrs) {
	this.extraHrs = extraHrs;
}

public int getPaidLeaves() {
	return paidLeaves;
}

public void setPaidLeaves(int paidLeaves) {
	this.paidLeaves = paidLeaves;
}

public int getConsumedLeaves() {
	return consumedLeaves;
}

public void setConsumedLeaves(int consumedLeaves) {
	this.consumedLeaves = consumedLeaves;
}

private int extraHrs;
   private int paidLeaves;
   private int consumedLeaves;
   
   

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public int getGrade() {
	return grade;
}

public void setGrade(int grade) {
	this.grade = grade;
}
   
}
