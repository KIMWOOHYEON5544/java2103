package com.example.day03;

public class Lesson2_ifElseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//score
		int score = 87;
		char grade = ' ';
		
		if(score >= 90) {
		     grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.printf("성적등급 : %c" , grade);
	}
	
	
	
	
	

}
