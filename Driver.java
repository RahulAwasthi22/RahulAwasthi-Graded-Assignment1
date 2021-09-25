package com.rahulawasthi.main;

import com.rahulawasthi.departments.*;

public class Driver {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			AdminDepartment ad = new  AdminDepartment();//Object created to access AdminDepartment class
			HrDepartment hd = new HrDepartment(); // Object created to access HrDepartment class
			TechDepartment td = new TechDepartment();//Object created to access TechDepartment class
			
		    ad.departmentName();
		    ad.getTodaysWork();
		    ad.getWorkDeadline();
		    ad.isTodayAHoliday();
		    System.out.println("");
		    
		    hd.departmentName();
		    hd.getTodaysWork();
		    hd.getWorkDeadline();
		    hd.isTodayAHoliday();
		    System.out.println("");
		    
		    td.departmentName();
		    td.getTodaysWork();
		    td.getWorkDeadline();
		    td.isTodayAHoliday();



		}

	}
