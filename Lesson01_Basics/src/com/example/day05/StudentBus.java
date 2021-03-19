package com.example.day05;

public class StudentBus {
//property
	public String studentName;
	public int grae;
	public int money;
	
	//method
	//constructor
	

	public StudentBus(String studentName, int money) {
		super();
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 현재 잔액 : " + money);
	}
	
}
