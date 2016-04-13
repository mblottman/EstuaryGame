package screenItems.RecycleGameScreenItems;

import screenItems.ScreenItem;

public class Arrow extends ScreenItem {
	
	private static double orientation = 0;
	
	//we might not want orientation to be a double
	public Arrow(int xPos, int yPos, double orientation) {
		super(xPos, yPos);
		// TODO Auto-generated constructor stub
	}
	
	public double getOrientation() {
		return orientation;
	}

	public void setOrientation(double orientation) {
		this.orientation = orientation;
	}
	
	public void moveArrow(){
		
	}

	public int hashCode() {
		return 12;
	}


}
