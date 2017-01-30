package com.h2k.test;

import java.util.Date;

public class Student {
	// instance Variables
	int rollNumber;
	String fistName;
	String lastName;
	Date dateOfBirth;
	long cellNumberofParent;
	
	// Class Variables - all instances share this value
	static String schoolName = "Smyrna Public School";
	
	
	void testMethod(){
		// Local Variables
		String localVar = "Local Variable";
		System.out.println("Accessing :: " + localVar);
	}
	
	
	public static void main(String[] args) {
		Student firstStudent = new Student();
		firstStudent.rollNumber = 10;
		firstStudent.fistName = "Nick";
		firstStudent.lastName = "Paterson";
		
		System.out.println("First Student Name is " + firstStudent.fistName + "  " + firstStudent.lastName);
		System.out.println(" School Name for First Student " + firstStudent.schoolName);
		
		firstStudent.schoolName = "Mariatta Public School";
		// Class Variables or static variables should not be accessed with instance Names
		// Use Class Name instead
		
		
		System.out.println(" Again School Name for First Student " + Student.schoolName);
		
		Student secondStudent = new Student();
		System.out.println("Second Student Name is " + secondStudent.fistName + "  " + secondStudent.lastName);
		System.out.println(" School Name for Second Student " + secondStudent.schoolName);
		
		
		//System.out.println("Accessing Local Variable from Another method :: " + localVar );
		
		
	}
	
	
	
}
