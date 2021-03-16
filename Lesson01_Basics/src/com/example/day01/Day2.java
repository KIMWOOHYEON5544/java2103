package com.example.day01;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("korea"); System.out.println("it academy");
		 * 
		 * System.out.print("korea"); System.out.print("it academy\n");
		 * 
		 * System.out.printf("%d", 123);
		 */
		/*
		 * int intVar; intVar = 10; // not equeal to but assign to //
		 * System.out.printf("%d", intVar); //문자로 시작 숫자혼용 의미있게 중간에 대문자(camel notation)
		 * 
		 * int korScore = 100; System.out.println(Integer.MIN_VALUE );
		 * System.out.println(Integer.MAX_VALUE );
		 * 
		 * 
		 * System.out.println(Byte.MIN_VALUE ); System.out.println(Byte.MAX_VALUE );
		 * 
		 * 
		 * System.out.println(Short.MIN_VALUE ); System.out.println(Short.MAX_VALUE );
		 * 
		 * 
		 * System.out.println(Float.MIN_VALUE ); System.out.println(Float.MAX_VALUE );
		 * 
		 * 
		 * System.out.println(Double.MIN_VALUE ); System.out.println(Double.MAX_VALUE );
		 * 
		 * //상수형 데이터 선언 int num1 = 1234567890; long num2 = 1234567890L; double num3 =
		 * 3.141592; float num4 = 3.141592F;
		 * 
		 * 
		 * //논리형(부울형)데이터 boolean isMarried = true; System.out.println(isMarried);
		 * 
		 * //상수의 선언과 사용 final double PI = 3.14;
		 * 
		 * 
		 * int result; Float numF = 5.0F; int numT = 3; result = (int) (numF/numT);
		 * System.out.println(result);
		 */
//		
//		//증감연산자 구분
//		int value = 10;
//		int result = value++;
//		System.out.println(value);
//		System.out.println(result);
//		
//		
//		//관계연산자
//		System.out.println(!(10>5  && 10>9));

		
		//두 수의 비트연산
//		int a = 13;
//		int b = 5;
//		System.out.println(a & b);
//		System.out.println(a | b);
//		System.out.println(a ^ b);          //베타적 or

		
		//삼항연산자
		//결과변수 = 조건식 ? 참일때 값 : 거짓일 때 값 
		int result = 10 < 5 ? 100 : 0;
		System.out.println(result);
		
	}

}
