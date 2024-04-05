package com.learning.core.day2session1;

class NotEligibleException extends Exception {
	public NotEligibleException(String message) {
		super(message);
	}
}

class CricketRating {
	private String playerName;
	private float critic1;
	private float critic2;
	private float critic3;
	private float avgRating;
	private String coins;

	public CricketRating(String playerName, float critic1, float critic2) {
		this.playerName = playerName;
		this.critic1 = critic1;
		this.critic2 = critic2;
		calculateAverageRating(critic1, critic2);
		calculateCoins();
	}

	public CricketRating(String playerName, float critic1, float critic2, float critic3) {
		this.playerName = playerName;
		this.critic1 = critic1;
		this.critic2 = critic2;
		this.critic3 = critic3;
		calculateAverageRating(critic1, critic2, critic3);
		calculateCoins();
	}

	public void calculateAverageRating(float critic1, float critic2) {
		this.avgRating = (critic1 + critic2) / 2;
	}

	public void calculateAverageRating(float critic1, float critic2, float critic3) {
		this.avgRating = (critic1 + critic2 + critic3) / 3;
	}

	public String calculateCoins() {
		if (avgRating >= 7) {
			coins = "Gold";
		} else if (avgRating >= 5) {
			coins = "Silver";
		} else if (avgRating >= 2) {
			coins = "Copper";
		} else {
			coins = "NotEligible";
		}
		return coins;
	}

	public void display()  {
		System.out.println(playerName + " " + avgRating + " " + coins);
	}
}

public class D02P06b {
	public static void main(String[] args) throws NotEligibleException {
		CricketRating player1 = new CricketRating("Gill", 9.9f, 9.4f, 9.2f);
		player1.display();
		
		CricketRating player2 = new CricketRating("kl", 5.3f, 4.2f, 4.1f);
		player2.display();
	}
}
