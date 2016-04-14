package StJonesEstuary;

import screenItems.ScreenItem;

public class Animal extends ScreenItem {
	
	private boolean isFound = false;
	
	public Animal(int xPos, int yPos) {
		super(xPos, yPos);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isFound() {
		return isFound;
	}

	public void setFound(boolean isFound) {
		this.isFound = isFound;
	}
	
	public int hashCode() {
		return 0;
	}
	

}
