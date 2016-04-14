package StJonesEstuary;

import java.util.ArrayList;

import screenItems.ScreenItem;
import screenItems.SeedlingGameScreenItems.Pot;
import screenItems.SeedlingGameScreenItems.Seed;

public class SeedlingGame extends Game {
	/**
	 * timer uses a countdown of ints since we are wild animals and don't care about timing accuracy
	 */
	public int ghettoTimer;
	private ArrayList <ScreenItem> scrapbook;
	private int seedScore = 0;
	private Pot pot;
	
	public SeedlingGame(){
		super();
	}
	
	public void init(){
		
	}
	
	public void onTick(){
		
	}
	public Pot getPot(){
		return pot;
	}
	public void setPot(Pot p){
		this.pot = p;
	}
	

	public ArrayList<ScreenItem> getScrapbook() {
		return scrapbook;
	}

	public void setScrapbook(ArrayList<ScreenItem> scrapbook) {
		this.scrapbook = scrapbook;
	}

	public int getSeedScore() {
		return seedScore;
	}

	public void setSeedScore(int seedScore) {
		this.seedScore = seedScore;
	}
	
	public boolean checkDescript(Seed seed, Pot pot){
		return false;
		
	}
	/**
	 * Destructor for the old pot
	 * New constructor for the new pot 
	 * @return
	 */
	
	public Pot switchPot(){
		return null;
		
	}

	

}
