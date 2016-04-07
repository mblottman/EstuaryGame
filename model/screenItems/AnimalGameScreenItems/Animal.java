package screenItems.AnimalGameScreenItems;

import screenItems.ScreenItem;

public class Animal extends ScreenItem {
	
	private boolean isFound = false;
	
	public Animal(double xPos, double yPos) {
		super(xPos, yPos);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isFound() {
		return isFound;
	}

	public void setFound(boolean isFound) {
		this.isFound = isFound;
	}
	

}
