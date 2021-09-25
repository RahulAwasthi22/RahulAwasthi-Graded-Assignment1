package com.rahulawasthi.departments;

public class HrDepartment extends SuperDepartment { 
	//Class AdminDepartment Inherits SuperDepartment
     public void departmentName () { System.out.println("   Welcome to Hr Department");}
	 public void getTodaysWork() { System.out.println("   Fill today's timesheet and Mark your attendance");}
	 public void getWorkDeadline() {System.out.println("   Complete by EOD");}
	 public void doActivity() {System.out.println("   team Lunch");}
}
