package com.example.day06;

import java.util.Scanner;

public class ScoreTbl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner input = new Scanner(System.in);
			double ScoreTbl[][] = new double[5][5];
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					System.out.printf("%d번째 학생의 %d과목 성적 :" , i,j);
					ScoreTbl[i][j] = input.nextDouble();
					ScoreTbl[i][3] += ScoreTbl[i][j];
					ScoreTbl[3][j] += ScoreTbl[i][j];
					ScoreTbl[4][j] = ScoreTbl[3][j] / 3.0;
				}
				
				for(int i = 0; i < 5; i++) {
					for(int j = 0; j < 5; j++) {
						if(i<3 && j >=3) break;
						System.out.printf("%5.1f" , ScoreTbl[i][j]);
					}
					System.out.println();
				}
			}
	}

}
