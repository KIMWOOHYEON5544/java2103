package com.example.day03;

public class Lesson4_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for(제어변수의 초기값 ; 조건(참인 동안 반복) ; 제어변수의 증감식)
//		int i , evensum = 0 , oddsum = 0;
//		for( i = 1; i <= 100; i++) {
//			if(i % 2 == 0) evensum += i;
//			else oddsum += i;
//		
//		}
//		System.out.printf("홀수합: %d, 짝수합: %d", oddsum , evensum);
//		
		
		//Nested For Loop   구구단 만들기
		for(int i = 2; i < 10; i=i+3) {
			for(int j =1; j < 10; j++) {
				System.out.printf("%d * %d = %d\t %d * %d = %d\t %d * %d = %d\n" , 
						i , j , i*j,
						i+1, j, (i+1)*j,
						i+2, j, (i+1)*j);
			}
			System.out.println();
			
			
			
			
			
			
			
			
		}
		
		
		
	}

}
