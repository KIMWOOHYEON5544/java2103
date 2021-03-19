package com.example.day05;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;
	
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money)	{
		this.money += money;
		passengerCount++;
	}
	
	
	public void showInfo() {
		System.out.println(busNumber + "번 버스 승객수 : " + passengerCount + ", 요금 합계 : " + money);
	}
	
	
	
}
