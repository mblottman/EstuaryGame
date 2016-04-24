package stjonesestuary.model.games;

import java.util.ArrayList;
import java.util.*;

import stjonesestuary.model.screenitems.ScreenItem;
import stjonesestuary.model.screenitems.animalgamescreenitems.*;



public class AnimalGame extends Game{

	private List <ScreenItem> scrapbook;
	private ArrayList <Animal> ducks;
	private ArrayList <Animal> woodlandCreatures;
	private ArrayList <Animal> birdsOfPrey;
	private ArrayList <Animal> riverCreatures;
	private ArrayList<Integer> order;
	private int roundNum;
		
	
	public AnimalGame(){
		this.scrapbook = new ArrayList<ScreenItem>();
		this.roundNum = 0;
	}
	

	public void init(){
		this.chooseOrder();
		
		// initializing the "groups" of animals here so the AnimalGame constructor can stay simple
		ArrayList<Animal> duckList = new ArrayList<Animal>();
		duckList.add(new Mallard(1,1));
		duckList.add(new BlackDuck(1,1));
		duckList.add(new WoodDuck(1,1));
		
		ArrayList<Animal> woodlandList = new ArrayList<Animal>();
		woodlandList.add(new CottonTailRabbit(1,1));
		woodlandList.add(new WhiteTailedDeer(1,1));
		woodlandList.add(new Turkey(1,1));
		
		ArrayList<Animal> birdofpreyList = new ArrayList<Animal>();
		birdofpreyList.add(new BaldEagle(1,1));
		birdofpreyList.add(new Osprey(1,1));
		birdofpreyList.add(new RedTailedHawk(1,1));
		
		ArrayList<Animal> riverList = new ArrayList<Animal>();
		riverList.add(new Otter(1,1));
		riverList.add(new Muskrat(1,1));
		riverList.add(new Mink(1,1));
		
		this.setDucks(duckList);;
		this.setWoodlandCreatures(woodlandList);
		this.setBirdsOfPrey(birdofpreyList);
		this.setRiverCreatures(riverList);
	}


	public void chooseOrder(){
		ArrayList<Integer> order = new ArrayList<Integer>();
	    for (int i = 0; i < 4; i++) {
	    	order.add(i);
	    }
	    Collections.shuffle(order);
	    this.setOrder(order);
	}
	
	
	public List<Animal> getCurrGroup(){
		int currGroupNum = (this.getOrder()).get(this.getRoundNum());
		switch(currGroupNum){
			case 0:
				return this.getDucks();
			case 1:
				return this.getWoodlandCreatures();
			case 2:
				return this.getBirdsOfPrey();
			case 3:
				return this.getRiverCreatures();
		}
		
		throw new Error("oh noooooo. thrown from AnimalGame.getCurrGroup()");
	}
	
	public void round(){
		List<Animal> currGroup = this.getCurrGroup();

		//place curr group on screen
		
		for (Animal animal : currGroup){
			//show dialog box for animal
			//remove dialog box
			//tick here somehow and wait for a click
			while (animal.isFound() == false){
				//keep running and check with controller for isFound
				//whatever is doing the checking needs the ability to set isFound to true and stop this loop!
			}
			
			//if we have found it
			//light up that it was found, then delete animal pic
			animal.setFound(true);
			(this.getScrapbook()).add(animal);
			
			// now reloop to the next animal in the group
		}
		
		//once we have completed this group, up the roundNum
		this.setRoundNum( this.getRoundNum()+1 );
		
		
	}
	
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/*
	 * GETTERS AND SETTERS SECTION
	 */
	
	public ArrayList<Animal> getDucks() {
		return ducks;
	}

	public ArrayList<Animal> getWoodlandCreatures() {
		return woodlandCreatures;
	}

	public ArrayList<Animal> getBirdsOfPrey() {
		return birdsOfPrey;
	}

	public ArrayList<Animal> getRiverCreatures() {
		return riverCreatures;
	}
	
	public int getRoundNum() {
		return roundNum;
	}

	public void setRoundNum(int roundNum) {
		this.roundNum = roundNum;
	}

	public ArrayList<Integer> getOrder() {
		return order;
	}
	
	public void setDucks(ArrayList<Animal> ducks) {
		this.ducks = ducks;
	}

	public void setWoodlandCreatures(ArrayList<Animal> woodlandCreatures) {
		this.woodlandCreatures = woodlandCreatures;
	}

	public void setBirdsOfPrey(ArrayList<Animal> birdsOfPrey) {
		this.birdsOfPrey = birdsOfPrey;
	}

	public void setRiverCreatures(ArrayList<Animal> riverCreatures) {
		this.riverCreatures = riverCreatures;
	}

	public void setOrder(ArrayList<Integer> order) {
		this.order = order;
	}
	
	
	

}
