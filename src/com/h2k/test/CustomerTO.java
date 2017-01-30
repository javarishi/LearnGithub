package com.h2k.test;


public class CustomerTO {

	// Numeric Data 
	byte byteVar = 99;
	short shortVar = 9999;
	int intVar = 999999999;
	long longVar = 9999999999l;
	
	// decimal data types
	float floatVar = 1232.21321f;
	double doubleVar =32434.234324;
	
	// character data
	char charData = 'N';
	
	// boolean Variables
	boolean boolVar = false;
	
	String firstName = "is not a premitive data type";
	
	String lastName;
	int zipCode;
	String ssnNumber;
	String address;
	long cellNumber;
	
	// Print Range for All the Variables
	public static void main(String[] args) {
		// Byte is a wrapper class , byte is a primitive
		System.out.println("Range of Byte ::" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
		System.out.println("Range of Short ::" + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
		System.out.println("Range of int ::" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
	}
	
}
