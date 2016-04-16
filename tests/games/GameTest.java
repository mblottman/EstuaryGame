package games;

import junit.framework.TestCase;
import java.util.ArrayList;
import stjonesestuary.model.games.Game;
import stjonesestuary.model.games.RecycleGame;
import stjonesestuary.model.screenitems.ScreenItem;

public class GameTest extends TestCase {

	public void testGame() {
		Game testgame = new RecycleGame();
	}


	public void testIsDone() {
		Game testgame = new RecycleGame();
		assertFalse(testgame.isDone());
	}

	public void testSetDone() {
		Game testgame = new RecycleGame();
		assertFalse(testgame.isDone());
		testgame.setDone(true);
		assertTrue(testgame.isDone());
	}

	public void testGetScrapbook() {
		Game testgame = new RecycleGame();
		ArrayList<ScreenItem> testlist = new ArrayList<ScreenItem>();
		testgame.setScrapbook(testlist);
		assertEquals(testlist,testgame.getScrapbook());
	}

	public void testSetScrapbook() {
		Game testgame = new RecycleGame();
		ArrayList<ScreenItem> testlist = new ArrayList<ScreenItem>();
		testgame.setScrapbook(testlist);
		assertEquals(testlist,testgame.getScrapbook());	}


}
