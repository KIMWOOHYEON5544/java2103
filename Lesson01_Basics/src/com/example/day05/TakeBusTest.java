package com.example.day05;

public class TakeBusTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentBus choi = new StudentBus("최" , 10000);
		StudentBus kim = new StudentBus("김" , 5000);
		Bus bus100 = new Bus(100) ;
		
		choi.showInfo();
		bus100.showInfo();
		choi.takeBus(bus100);
		choi.showInfo();
		kim.takeBus(bus100);
		bus100.showInfo();
		
	}

}
