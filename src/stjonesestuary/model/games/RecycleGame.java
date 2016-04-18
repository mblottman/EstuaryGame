package stjonesestuary.model.games;

import java.util.ArrayList;

import stjonesestuary.model.screenitems.ScreenItem;
import stjonesestuary.model.screenitems.recyclegamescreenitems.Arrow;
import stjonesestuary.model.screenitems.recyclegamescreenitems.DiscardItems;
import stjonesestuary.model.screenitems.recyclegamescreenitems.RecycleBin;
import stjonesestuary.model.screenitems.recyclegamescreenitems.TrashBin;


public class RecycleGame extends Game {
	
	private ArrayList <ScreenItem> scrapbook;
	public int ghettoTimer;
	private int recycleScore;
	
	public Arrow arrow = new Arrow(0, 0, 0);
	RecycleBin recycleBin = new RecycleBin(0, 0);
	TrashBin trashBin = new TrashBin(0, 0);
	DiscardItems item = new DiscardItems(100,5); //arbitrary x and y

	
	public RecycleGame(){
		super();
	}
	
	
	public int getRecycleScore() {
		return recycleScore;
	}


	public void setRecycleScore(int recycleScore) {
		this.recycleScore = recycleScore;
	}
	
	public DiscardItems getDiscardItems(){
		return item;
	}
	
	public void setDiscardItems(DiscardItems di){
		this.item = di;
	}



	public void init(){
		Arrow a = new Arrow(0, 0, 0);
		
		
	}
	
	
	/**
	 * will load up a new item at the arrow 
	 * @return
	 */
	
	public DiscardItems loadNewItem(){
		return null;
		
	}
	
	public void onTick(){
		init();
		while (!isDone()){
			arrow.moveArrow();
		}
	}
	

}
