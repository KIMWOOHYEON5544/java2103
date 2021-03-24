package com.example.day05;

public class BeginnerLevel extends PlayerLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@Override
		public void run() {
			System.out.println("천천히 달립니다.");
		}
		@Override
		public void jump() {
			System.out.println("점프 불가능");
		}
		
		@Override
		public void turn() {
			System.out.println("턴 불가능");
		}
		
		@Override
		public void showLevelMessage() {
			System.out.println("===초보자 레벨입니다.===");
	}

}