package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	public final static String LOVE_ALL = "love-all";
	public final static String FIFTEEN_LOVE = "fifteen-love";
	
	private String score;
	
	public TennisGame() {
		this.score=LOVE_ALL;
	}
	
	public String getScore() {
		return this.score;
	}

	public void serverScores() {
		this.score=FIFTEEN_LOVE;
	}


	
}
