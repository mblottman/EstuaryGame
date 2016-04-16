package games;

import java.util.ArrayList;

import junit.framework.TestCase;
import stjonesestuary.model.games.AnimalGame;
import stjonesestuary.model.screenitems.ScreenItem;


public class AnimalGameTest extends TestCase {

	public void testInit() {
		fail("Not yet implemented");
	}

	public void testGetScrapbook() {
		AnimalGame testgame = new AnimalGame();
		ArrayList<ScreenItem> testlist = testgame.getScrapbook();
		assertEquals(testlist,testgame.getScrapbook());
	}

	public void testGetDucks() {
		AnimalGame testgame = new AnimalGame();
		ArrayList <ScreenItem> testducks = testgame.getDucks();
		assertEquals(testducks,testgame.getDucks());
	}

	public void testGetWoodlandCreatures() {
		AnimalGame testgame = new AnimalGame();
		ArrayList <ScreenItem> testwood = testgame.getWoodlandCreatures();
		assertEquals(testwood,testgame.getWoodlandCreatures());
	}

	public void testGetBirdsOfPrey() {
		AnimalGame testgame = new AnimalGame();
		ArrayList <ScreenItem> testbirds = testgame.getBirdsOfPrey();
		assertEquals(testbirds,testgame.getBirdsOfPrey());
	}

	public void testGetRiverCreatures() {
		AnimalGame testgame = new AnimalGame();
		ArrayList <ScreenItem> testrivercreatures = testgame.getRiverCreatures();
		assertEquals(testrivercreatures,testgame.getRiverCreatures());
	}

}
