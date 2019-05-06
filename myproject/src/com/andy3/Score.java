package com.andy3;

public class Score {
	int score;

	public Score(String s) throws ScoreException {
		try {
			score=Integer.parseInt(s);
		} catch (NumberFormatException e) {
			System.out.println("½Ð¿é¤J¼Æ¦r");
			throw new ScoreException(score);
		}
	}

}
