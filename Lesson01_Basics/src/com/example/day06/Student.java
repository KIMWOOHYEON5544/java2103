package com.example.day06;

public class Student {

	private static int serialNum = 1000;
	public int studentID;
	public static String studentName;
	public int grade;
	public String address;
	
	
	
	
	
	
	public Student() {
		serialNum++;
		this.studentID = serialNum;
	}
	
	
	
	
	
	
	public static String getStudentName() {
		return studentName;
	}
	public static void setStudentName(String studentName) {
		studentName = studentName;
	}




	
	
	


	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
	
	
	
	
	
	
	
}
