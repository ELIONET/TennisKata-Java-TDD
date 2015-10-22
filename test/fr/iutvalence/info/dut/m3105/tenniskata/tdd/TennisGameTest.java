package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void testIsInitialScoreLoveAll()
	{
		TennisGame game = new TennisGame();	
		Assert.assertEquals(game.getScore(),TennisGame.LOVE_ALL);
	}
	
	@Test
	public void testIsScoreFifteenLoveForServer()
	{
		TennisGame game = new TennisGame();
		game.serverScores();		
		Assert.assertEquals(game.getScore(),"fifteen-love");
	}
	

}
