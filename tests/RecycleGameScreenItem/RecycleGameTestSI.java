package RecycleGameScreenItem;

import screenItems.RecycleGameScreenItems.AppleCore;
import screenItems.RecycleGameScreenItems.Arrow;
import junit.framework.Assert;
import junit.framework.TestCase;
/**
 * test all the subclasses of RecycleGameScreenItem
 * @author wenyiyin
 *
 */
public class RecycleGameTestSI extends TestCase{
	public void testAppleCore(){
		AppleCore appleCore = new AppleCore(0, 0);
		//assertEquals(AppleCore.hashCode(),11);
	}
	public void testArrow(){
		Arrow  arrow = new Arrow(0, 0, 0);
		arrow.setOrientation(10.00);
		double value = arrow.getOrientation();
		Assert.assertEquals(value, 10.00);
		arrow.moveArrow();
	}
	public void testBananaPeel(){
		
	}
	public void testChipBag(){
		
	}
	public void testDiscardItems(){
		
	}
	public void testGlassBottle(){
		
	}
	public void testNewspaper(){
		
	}
	public void testTinCan(){
		
	}
	public void testTrashBin(){
		
	}
	public void testRecyclable(){
		
	}
	public void testTrash(){
		
	}
	public void testRecycleBin(){
		
	}
}
