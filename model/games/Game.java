package games;

import java.util.ArrayList;

import screenItems.ScreenItem;

public abstract class Game {
	
	private boolean isDone = false;
	private ArrayList <ScreenItem> scrapbook;
	
	
	public Game(){
		init();
	}
	
	/**
	 * The init() method will be implemented in all of the subclasses for game.
	 * init() will draw and place the appropriate objects on the applicable screen.
	 * Each subclass will have a different implementation of init();
	 */
	public void init(){
		
	}
	
	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	public ArrayList<ScreenItem> getScrapbook() {
		return scrapbook;
	}

	public void setScrapbook(ArrayList<ScreenItem> scrapbook) {
		this.scrapbook = scrapbook;
	}
	
	
	/**
	 * Method definition. onTick() is the method that updates images to the user's screen 
	 * based on code logic. This will be a different implementation in each class. 
	 */
	
	public void onTick(){
		
	}



	

	

}
