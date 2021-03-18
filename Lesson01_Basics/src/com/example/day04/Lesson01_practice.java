package com.example.day04;

public class Lesson01_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//나이에 따라 다른 문장 출력하기
		
//		int age = 7;
//		if(age >= 8) {
//			System.out.println("학교에 다닙니다.");
//		}  else { 
//			System.out.println("학교에 다니지 않습니다.");   //이걸 왜 else와 같은 줄에 적으면 출력이 안되지?
//		}
		
		
		
		//입장요금 계산하기
		
//		int age = 29;
//		int charge;
//		
//		if(age < 8) {
//			charge = 1000;
//			System.out.println("미취학아동");
//		}
//		else if(age < 14) {
//			charge = 2000;
//			System.out.println("초등학생");
//		}
//		else if(age < 20) {
//			charge = 3000;
//			System.out.println("중,고등학생");
//		}
//		else {
//			charge = 4000;
//			System.out.println("성인");
//		}
//		System.out.println("입장료는" + charge + "원입니다.");
//		
//		
		
		
		//메달 수여하기
		
		int age = 1;
		int charge = 0;
		switch(age) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
			charge = 1000;
			break;
		case 8 : 
			charge = 2000;
			break;
		}
		
		System.out.println(charge);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
