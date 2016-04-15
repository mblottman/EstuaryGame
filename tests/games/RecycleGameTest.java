package games;

import junit.framework.TestCase;
import stjonesestuary.model.games.RecycleGame;
import stjonesestuary.model.screenitems.recyclegamescreenitems.DiscardItems;


public class RecycleGameTest extends TestCase {

	public void testInit() {
		fail("Not yet implemented");
	}

	public void testOnTick() {
		fail("Not yet implemented");
	}

	public void testGetRecycleScore() {
		RecycleGame testgame = new RecycleGame();
		int score = testgame.getRecycleScore();
		assertEquals(score,testgame.getRecycleScore());
	}

	public void testSetRecycleScore() {
		RecycleGame testgame = new RecycleGame();
		int score = 5;
		testgame.setRecycleScore(score);
		assertEquals(score,testgame.getRecycleScore());
	}
	
	public void testgetDiscardItems() {
		RecycleGame testgame = new RecycleGame();
		DiscardItems it = testgame.getDiscardItems();
		assertEquals(it,testgame.getDiscardItems());
	}
	public void testsetDiscardItems() {
		RecycleGame testgame = new RecycleGame();
		DiscardItems it = new DiscardItems(5,4);
		testgame.setDiscardItems(it);
		assertEquals(it,testgame.getDiscardItems());
	}

	public void testLoadNewItem() {
		RecycleGame testgame = new RecycleGame();
		DiscardItems old = testgame.getDiscardItems();
		testgame.loadNewItem();
		assertEquals(90,testgame.arrow.getOrientation());
		assertFalse(old.equals(testgame.getDiscardItems()));
	}

}
