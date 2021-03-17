package com.example.day03;

import java.util.Scanner;

public class C033_Switchcase연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//간단한 계산기 프로그램 만들기
		//연산자 : + - * /     ,     
		
		
		//필요변수 선언
		char operator;
		double number1, number2, result;
		result = 0;
		
		//입력개체 선언
		Scanner input = new Scanner(System.in);
			
		System.out.println("연산자를 입력하세요. +,-,*,/");
		operator = input.next().charAt(0);
		
		System.out.println("첫 번째 숫자를 입력하세요. : ");
		number1 = input.nextDouble();
		
		System.out.println("두 번째 숫자를 입력하세요. : ");
		number2 = input.nextDouble();
		
		
			
		switch(operator) {
		case '+' :
			result = number1 + number2;
			break;
		case '-' :
			result = number1 - number2;
			break;
		case '*' :
			result = number1 * number2;
			break;	
		case '/' :
			result = number1 / number2;
			break;	
		default : 
			System.out.println("허용하지 않는 연산자입니다.");
		}
		System.out.printf("%f %c %f = %f" , number1, operator , number2 , result);
	
		
		
		
	}

}
