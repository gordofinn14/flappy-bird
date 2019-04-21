package application;


/**
 * Player Class
 * 
 * Attributes: High Score, Current Score, Player Name
 * Methods: Getters, Setters, ImportScore, ExportScore
 * @author 14gfi
 *
 */

public class Player {
	private int highScore;
	private int currentScore;
	private String playerName;
	
	public Player(int high, int current) {
		highScore = high;
		currentScore = current;
	}

	public int getHighScore() {
		return highScore;
	}

	public void setHighScore(int highScore) {
		this.highScore = highScore;
	}

	public int getCurrentScore() {
		return currentScore;
	}

	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	
	/**
	 * Import high score from text file saved down, if none, high score = 0 (try catch block)
	 */
	public void importHighScore() {
		
	}
	
	/**
	 * If we have a new high score then we export to the scores text file 
	 */
	public void exportHighScore() {
		
	}
}
