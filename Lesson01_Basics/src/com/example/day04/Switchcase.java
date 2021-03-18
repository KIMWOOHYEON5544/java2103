package com.example.day04;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//계산기 만들기
		
		
		int num1 = 9;
		int num2 = 4;
		int result = 0;
		char op = '-';
		switch(op) {
		case '+' : 
			result = num1 + num2;
			break;
		case '-' :
			result = num1 -num2;
			break;
		case '*' :
			result = num1 * num2;
			break;
		}
		
		System.out.printf("%d %c %d = %d",num1, op , num2 , result);
		
		
		
	}

}
