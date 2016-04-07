package games;

import java.util.ArrayList;

import screenItems.ScreenItem;
import screenItems.RecycleGameScreenItems.Arrow;
import screenItems.RecycleGameScreenItems.DiscardItems;
import screenItems.RecycleGameScreenItems.RecycleBin;
import screenItems.RecycleGameScreenItems.TrashBin;

public class RecycleGame extends Game {
	
	private ArrayList <ScreenItem> scrapbook;
	public int ghettoTimer;
	private int recycleScore;
	
	Arrow arrow = new Arrow(0, 0, 0);
	RecycleBin recycleBin = new RecycleBin(0, 0);
	TrashBin trashBin = new TrashBin(0, 0);

	
	public RecycleGame(){
		super();
	}
	
	
	
	public int getRecycleScore() {
		return recycleScore;
	}



	public void setRecycleScore(int recycleScore) {
		this.recycleScore = recycleScore;
	}



	public void init(){
		
	}
	
	
	/**
	 * will load up a new item at the arrow 
	 * @return
	 */
	
	public DiscardItems loadNewItem(){
		return null;
		
	}
	
	public void onTick(){
		
	}
	

}
