package SeedlingGameScreenItem;

import junit.framework.TestCase;
import screenItems.SeedlingGameScreenItems.*;

public class SeedlingGameTestSI extends TestCase {

	public void testDuneGrass(){
		DuneGrass dg = new DuneGrass(2,5);
		
		assertEquals(2,dg.getxPos());
		assertEquals(5,dg.getyPos());
		dg.setxPos(8);
		dg.setyPos(10);
		assertEquals(8,dg.getxPos());
		assertEquals(10,dg.getyPos());
		
		assertEquals("blah2", dg.getSeedDescript());
		
		assertFalse(dg.getIsPickedUp());
		dg.setPickedUp(true);
		assertTrue(dg.getIsPickedUp());
		
		assertEquals(24,dg.hashCode());
		
		assertFalse(dg.isInDirt());
		dg.setInDirt(true);
		assertTrue(dg.isInDirt());
		
		dg.check();
		dg.resetSeed();
	}

	public void testMilkweed(){
		Milkweed mw = new Milkweed(6,9);
		
		assertEquals(6,mw.getxPos());
		assertEquals(9,mw.getyPos());
		mw.setxPos(8);
		mw.setyPos(10);
		assertEquals(8,mw.getxPos());
		assertEquals(10,mw.getyPos());
		
		assertEquals("blah3", mw.getSeedDescript());
		
		assertFalse(mw.getIsPickedUp());
		mw.setPickedUp(true);
		assertTrue(mw.getIsPickedUp());
		
		assertEquals(20,mw.hashCode());
		
		assertFalse(mw.isInDirt());
		mw.setInDirt(true);
		assertTrue(mw.isInDirt());
		
		mw.check();
		mw.resetSeed();
	}

	public void testRedMaple(){
		RedMaple rm = new RedMaple(5,7);
		
		assertEquals(5,rm.getxPos());
		assertEquals(7,rm.getyPos());
		rm.setxPos(8);
		rm.setyPos(10);
		assertEquals(8,rm.getxPos());
		assertEquals(10,rm.getyPos());
		
		assertEquals("blah4", rm.getSeedDescript());
		
		assertFalse(rm.getIsPickedUp());
		rm.setPickedUp(true);
		assertTrue(rm.getIsPickedUp());
		
		assertEquals(22,rm.hashCode());
		
		assertFalse(rm.isInDirt());
		rm.setInDirt(true);
		assertTrue(rm.isInDirt());
		
		rm.check();
		rm.resetSeed();
	
	}
	
	public void testSilverMaple(){
		SilverMaple sm = new SilverMaple(10,13);
		
		assertEquals(10,sm.getxPos());
		assertEquals(13,sm.getyPos());
		sm.setxPos(8);
		sm.setyPos(10);
		assertEquals(8,sm.getxPos());
		assertEquals(10,sm.getyPos());
		
		
		assertEquals("blah", sm.getSeedDescript());
		
		assertFalse(sm.getIsPickedUp());
		sm.setPickedUp(true);
		assertTrue(sm.getIsPickedUp());
		
		assertEquals(23,sm.hashCode());
		
		assertFalse(sm.isInDirt());
		sm.setInDirt(true);
		assertTrue(sm.isInDirt());
		
		sm.check();
		sm.resetSeed();
	}
	
	public void testPot(){
		Pot pot = new Pot(3,9);
		
		assertEquals(3,pot.getxPos());
		assertEquals(9,pot.getyPos());
		pot.setxPos(0);
		pot.setyPos(20);
		assertEquals(0,pot.getxPos());
		assertEquals(20,pot.getyPos());
		
		assertEquals("blah im a pot", pot.getPotDescript());
		pot.setPotDescript("i changed my description but im still a pot!");
		assertEquals("i changed my description but im still a pot!", pot.getPotDescript());
		assertEquals(21,pot.hashCode());
	}

}
