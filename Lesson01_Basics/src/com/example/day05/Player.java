package com.example.day05;

public class Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		private PlayerLevel level;
		public Player() {
			level1 = new BeginnerLevel();
			level.showLevelMessage();
		}
		
		public PlayerLevel getLevel() {
			return level;
		}
		
		public void upgradeLevel(PlayerLevel level) {
			this.level = level;
			level.showLevelMessage();
		}
		
		public void play(int count) {
			level.go(count);
		}
		
		
	}

}
