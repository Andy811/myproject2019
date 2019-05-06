package com.andy3;

public class ScoreException extends Exception {
int score;
	public ScoreException(int score) {
	this.score = score;
	}
		
	@Override
	public String getMessage() {
		
		return super.getMessage();
	
	}
	
	
}
