package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	public final static String LOVE_ALL = "love-all";
	public final static String FIFTEEN_LOVE = "fifteen-love";
	public final static String LOVE_FIFTEEN = "love-fifteen";
	public final static String FIFTEEN_ALL = "fifteen-all";
	
	private String score;
	
	public TennisGame() {
		this.score=LOVE_ALL;
	}
	
	public String getScore() {
		return this.score;
	}

	public void serverScores() {
		if(this.score==LOVE_ALL)
			this.score=FIFTEEN_LOVE;
		else
			this.score=FIFTEEN_ALL;
	}

	public void receiverScores() {
		if(this.score==LOVE_ALL)
			this.score=LOVE_FIFTEEN;
		else
			this.score=FIFTEEN_ALL;
	}


	
}
