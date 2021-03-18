package com.example.day04;

public class Lesson04_practiceFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int floor = 4;
//		switch(floor) {
//		case 1 : 
//			System.out.println("1층 약국입니다.");
//	        break;	
//		case 2 : 
//			System.out.println("2층 정형외과입니다.");	
//			break;	
//		case 3 : 
//			System.out.println("3층 피부과입니다.");	
//			break;	
//		case 4 : 
//			System.out.println("4층 치과입니다.");	
//			break;	
//		case 5 : 
//			System.out.println("5층 헬스장입니다.");	
//			break;	
		
		
		
		
		
		
		int floor = 3;
		String result = " ";
		switch(floor) {
		case 1 :
			result = "약국";
			break;
		case 2 :
			result = "정형외과";
			break;	
		case 3 :
			result = "피부과";
			break;		
		case 4 :
			result = "치과";
			break;		
		case 5 :
			result = "헬스장";
			break;		
		}
		System.out.println(floor + "층" + " " + result + "입니다.");
		
		
		
	}

}
