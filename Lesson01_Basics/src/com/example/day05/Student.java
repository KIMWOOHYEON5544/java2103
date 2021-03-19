package com.example.day05;

public class Student {
	//  member properties
	private int studentID;
	private String studentName;           //access modifier 접근 권한자
	private int grade;
	private String address;
		
	
	
	public  Student() {
         studentName = "무명씨";
         address = "대한민국 어디쯤...";
	}
	
	
	
	
	public Student(String studentName , String address) {
		this.studentName = studentName;
		this.address = address;
	}
	
	
	
	
	
	void showInfo(){           //데이터 리턴값을 설정하지 않을 때 void
	      System.out.println(studentName + " , " + address);
	}
//	
//	void setstudentName(String name) {
//		this.studentName = name;
//	}
//	public String getstudentName() {
//		return this.studentName;
//	}
//	
//	public void setstudentName(String name) {
//		studentName = name;
//		
//	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	public void printThis() {
		System.out.println("value of this : " + this);
	}
	
	
	
	
	

}
