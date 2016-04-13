package AnimalScreenItemTests;

import junit.framework.TestCase;
//import screenItems.AnimalGameScreenItems.Animal;
import screenItems.AnimalGameScreenItems.BaldEagle;
import screenItems.AnimalGameScreenItems.BlackDuck;
import screenItems.AnimalGameScreenItems.CottonTailRabbit;
import screenItems.AnimalGameScreenItems.Mallard;
import screenItems.AnimalGameScreenItems.Muskrat;
import screenItems.AnimalGameScreenItems.Osprey;
import screenItems.AnimalGameScreenItems.Otter;
import screenItems.AnimalGameScreenItems.RedTailedHawk;
import screenItems.AnimalGameScreenItems.WhiteTailedDeer;
import screenItems.AnimalGameScreenItems.WoodDuck;
/**
 * Tests all the screen items in the animal class 
 * @author Melissa
 *
 */

public class AnimalScreenItemTest extends TestCase {
	
	public void testBaldEagle(){
		//SCREEN ITEM XPOS NEEDS TO BE MADE AN INT NOT A DOUBLE!!!!!!!
		BaldEagle be = new BaldEagle(1.0,2.0);
//		assertEquals("BaldEagle:getXPos assert failed", 0.99999999999999999, be.getxPos());
		assertEquals("BaldEagle:getXPos assert failed", 1.0, be.getxPos());
		assertEquals("BaldEagle:getY assert failed", 2.0, be.getyPos());
		assertEquals("BaldEagle: hashCode assert failed", 1, be.hashCode());
	}
	
	
	public void testBlackDuck(){
		BlackDuck bd = new BlackDuck(3,4);
		assertEquals("BlackDuck: getXPos assert failed", 3, bd.getxPos());
		assertEquals("BlackDuck: getYPos assert failed", 4, bd.getyPos());
		assertEquals("BlackDuck: hashCode assert failed", 2, bd.hashCode());
	}
	
	public void testCottonTailRabbit(){
		CottonTailRabbit ct = new CottonTailRabbit(5,6);
		assertEquals("CottonTailRabbit: getXPos assert failed", 5, ct.getxPos());
		assertEquals("CottonTailRabbit: getyPos assert failed", 6, ct.getyPos());
		assertEquals("CottonTailRabbit: hashCode assert failed", 3, ct.hashCode());
	}
	
	public void testMallard(){
		Mallard m = new Mallard(7,8);
		assertEquals("Mallard: getxPos assert failed", 7, m.getxPos());
		assertEquals("Mallard: getyPos assert failed", 8, m.getyPos());
		assertEquals("Mallard: hashCode assert failed", 4, m.hashCode());
		
	}
	
	public void testMuskrat(){
		Muskrat mk = new Muskrat (9, 10);
		assertEquals("Muskrat: getxPos assert failed", 9, mk.getxPos());
		assertEquals("Muskrat: getyPos assert failed", 10, mk.getyPos());
		assertEquals("Muskrat: hashCode assert failed", 5, mk.hashCode());
		
	}
	
	public void testOsprey(){
		Osprey o = new Osprey (11,12);
		assertEquals("Osprey: getxPos assert failed", 11, o.getxPos());
		assertEquals("Osprey: getyPos assert failed", 12, o.getyPos());
		assertEquals("Osprey: hashCode assert failed", 6, o.hashCode());
	}
	
	public void testOtter(){
		Otter ot = new Otter(13, 14);
		assertEquals("Otters: getxPos assert failed", 13, ot.getxPos());
		assertEquals("Otters: getyPos assert failed", 14, ot.getyPos());
		assertEquals("Otter: hashCode assert failed", 7, ot.hashCode());
	}
	
	public void testRedTailedHawk(){
		RedTailedHawk rth = new RedTailedHawk(15,16);
		assertEquals("RedTailedHawk: getxPos assert failed", 15, rth.getxPos());
		assertEquals("RedTailedHawk: getyPos assert failed", 16, rth.getyPos());
		assertEquals("RedTailedHawk: hashCode assert failed",8, rth.hashCode());
	}
	
	public void testWhiteTailedHawk(){
		WhiteTailedDeer d = new WhiteTailedDeer(17, 18);
		assertEquals("WhiteTailedDeer: getxPos assert failed", 17, d.getxPos());
		assertEquals("WhiteTailedDeer: getyPos assert failed", 18, d.getyPos());
		assertEquals("WhiteTailedDeer: hashCode assert failed", 9, d.hashCode());
		
	}
	
	public void testWoodDuck(){
		WoodDuck wd = new WoodDuck(19,20);
		assertEquals("WoodDuck: getxPos assert failed", 19, wd.getxPos());
		assertEquals("WoodDuck: getyPos assert failed", 20, wd.getyPos());
		assertEquals("WoodDuck: hashCode assert failed",10, wd.hashCode());
	}
	

}

