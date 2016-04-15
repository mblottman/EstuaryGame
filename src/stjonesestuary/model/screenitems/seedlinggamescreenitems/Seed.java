package stjonesestuary.model.screenitems.seedlinggamescreenitems;

import stjonesestuary.model.screenitems.ScreenItem;

public class Seed extends ScreenItem{
	
	private String seedDescript;
	private boolean pickedUp = false;
	private boolean inDirt = false;

	public Seed(int xPos, int yPos) {
		super(xPos, yPos);
		// TODO Auto-generated constructor stub
	}

	public String getSeedDescript() {
		return seedDescript;
	}


	public boolean getIsPickedUp() {
		return pickedUp;
	}

	public void setPickedUp(boolean pickedUp) {
		this.pickedUp = pickedUp;
	}

	public boolean isInDirt() {
		return inDirt;
	}

	public void setInDirt(boolean inDirt) {
		this.inDirt = inDirt;
	}
	
	/**
	 * this will check if its in the dirt or naw
	 */
	public void check(){
		
	}
	
	
	/**
	 * will move the x y position back after the user picks up 
	 * this needs to reset pickedUp to false
	 */
	
	public void resetSeed(){
		
	}
	
	
	

}
