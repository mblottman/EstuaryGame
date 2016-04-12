package games;

import junit.framework.TestCase;
import screenItems.SeedlingGameScreenItems.*;

public class SeedlingGameTest extends TestCase {

	public void testInit() {
		fail("Not yet implemented");
	}

	public void testOnTick() {
		fail("Not yet implemented");
	}

	public void testGetSeedScore() {
		SeedlingGame testgame = new SeedlingGame();
		assertEquals(0,testgame.getSeedScore());
	}

	public void testSetSeedScore() {
		SeedlingGame testgame = new SeedlingGame();
		testgame.setSeedScore(5);
		assertEquals(5,testgame.getSeedScore());
	}

	public void testCheckDescript() {
		SeedlingGame testgame = new SeedlingGame();
		Seed seed = new Seed(0,0);
		seed.setseedDescript("bob");
		Pot pot = new Pot(0,0);
		pot.setPotDescript("charles");
		assertFalse(testgame.checkDescript(seed, pot));
		pot.setPotDescript("bob");
		assertTrue(testgame.checkDescript(seed, pot));
	}

	public void testSwitchPot() {
		SeedlingGame testgame = new SeedlingGame();
		Pot old = testgame.getPot();
		testgame.switchPot();
		assertFalse(testgame.getPot().equals(old));
	}

}
