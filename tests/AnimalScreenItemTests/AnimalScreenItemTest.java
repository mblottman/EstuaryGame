package AnimalScreenItemTests;

import junit.framework.TestCase;
import screenItems.AnimalGameScreenItems.Animal;
import screenItems.AnimalGameScreenItems.BaldEagle;
import screenItems.AnimalGameScreenItems.BlackDuck;
import screenItems.AnimalGameScreenItems.CottonTailRabbit;
import screenItems.AnimalGameScreenItems.Mallard;
import screenItems.AnimalGameScreenItems.Muskrat;
/**
 * Tests all the screen items in the animal class 
 * @author Melissa
 *
 */

public class AnimalScreenItemTest extends TestCase {
	
	public void testBaldEagleGetters(){
		BaldEagle be = new BaldEagle(1,2);
		assertEquals("BaldEagle:getXPos assert failed", 1, be.getxPos());
		assertEquals("BaldEagle:getY assert failed", 2, be.getyPos());
	}
	
	public void testBlackDuckGetters(){
		BlackDuck bd = new BlackDuck(3,4);
		assertEquals("BlackDuck: getXPos assert failed", 3, bd.getxPos());
		assertEquals("BlackDuck: getYPos assert failed", 4, bd.getyPos());
	}
	
	public void testCottonTailGetters(){
		CottonTailRabbit ct = new CottonTailRabbit(5,6);
		assertEquals("CottonTailRabbit: getXPos assert failed", 5, ct.getxPos());
		assertEquals("CottonTailRabbit: getyPos assert failed", 6, ct.getyPos());
	}
	
	public void testMallardGetters(){
		Mallard m = new Mallard(7,8);
		assertEquals("Mallard: getxPos assert failed", 7, m.getxPos());
		assertEquals("Mallard: getyPos assert failed", 8, m.getyPos());
		
	}
	
	public void testMuskratGetters(){
		Muskrat mk = new Muskrat (9, 10);
		assertEquals("Muskrat: getxPos assert failed", 9, mk.getxPos());
		assertEquals("Muskrat: getyPos assert failed", 10, mk.getyPos());
		
	}
	

}
