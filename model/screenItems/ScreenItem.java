package screenItems;


/**
 * Abstract Class that provides basic attributes and methods of all the items on the screen.
 * The items on the screen include any POJOs in the main game screen as well as the the 3
 * sub-games.
 * @author Melissa
 *
 */
public abstract class ScreenItem {
	
	/**
	 *All items on the screen have an xPos and yPos which are meant to represent the items
	 *position on the screen (on a Cartesian plane). 
	 */
	
	private double xPos;
	private double yPos;
	private String message; 
	private String jpgName;
	
	public ScreenItem (double xPos, double yPos){
		this.xPos = xPos;
		this.yPos = yPos;

	}
	
	/**
	 * Accessor method for xPos. This allows access to the attribute even though it is 
	 * a private field. 
	 * @return position of x
	 */
	public double getxPos() {
		return xPos;
	}
	
	/**
	 * Mutator method for xPos. This allows a user to change the attribute value even 
	 * though it is a private field. 
	 * @param xPos
	 */
	public void setxPos(double xPos) {
		this.xPos = xPos;
	}
	
	/**
	 * Accessor method for yPos. This allows access to the attribute even though it is 
	 * a private field. 
	 * @return  position of y 
	 */
	public double getyPos() {
		return yPos;
	}
	
	
	/**
	 * Mutator method for yPos. This allows a user to change the attribute value even 
	 * though it is a private field. 
	 * @param yPos
	 */
	public void setyPos(double yPos) {
		this.yPos = yPos;
	}
	
	/**
	 * Accessor method for the message that each animal will have. 
	 * @return
	 */
	public String getMessage() {
		return message;
	}



	public String getJpgName() {
		return jpgName;
	}

	public void setJpgName(String jpgName) {
		this.jpgName = jpgName;
	}
	
	

	
	

}
