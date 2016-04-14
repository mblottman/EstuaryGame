package StJonesEstuary;

import java.util.ArrayList;

import screenItems.ScreenItem;
import screenItems.AnimalGameScreenItems.BlackDuck;
import screenItems.AnimalGameScreenItems.Mallard;
import screenItems.AnimalGameScreenItems.WoodDuck;

public class AnimalGame extends Game{

	private ArrayList <ScreenItem> scrapbook;
	//each type of duck, woodlandCreate, etc will be inside of these arraylists
	private ArrayList <ScreenItem> ducks = new ArrayList();
	private ArrayList <ScreenItem> woodlandCreatures = new ArrayList ();
	private ArrayList <ScreenItem> birdsOfPrey = new ArrayList ();
	private ArrayList <ScreenItem> riverCreatures = new ArrayList();
	
	

	public AnimalGame(){
		super();
	}
	
	public ArrayList<ScreenItem> getScrapbook() {
		return scrapbook;	}



	public ArrayList<ScreenItem> getDucks() {
		return ducks;
	}


	public ArrayList<ScreenItem> getWoodlandCreatures() {
		return woodlandCreatures;
	}

	public ArrayList<ScreenItem> getBirdsOfPrey() {
		return birdsOfPrey;
	}



	public ArrayList<ScreenItem> getRiverCreatures() {
		return riverCreatures;
	}
	
	public void init(){
		
	}
	

}
