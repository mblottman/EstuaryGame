package StJonesEstuary;


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
	
	private int xPos;
	private int yPos;
	private String message; 
	
	public ScreenItem (int xPos, int yPos){
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	/**
	 * Accessor method for xPos. This allows access to the attribute even though it is 
	 * a private field. 
	 * @return position of x
	 */
	public int getxPos() {
		return xPos;
	}
	
	/**
	 * Mutator method for xPos. This allows a user to change the attribute value even 
	 * though it is a private field. 
	 * @param xPos
	 */
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
	
	/**
	 * Accessor method for yPos. This allows access to the attribute even though it is 
	 * a private field. 
	 * @return  position of y 
	 */
	public int getyPos() {
		return yPos;
	}
	
	
	/**
	 * Mutator method for yPos. This allows a user to change the attribute value even 
	 * though it is a private field. 
	 * @param yPos
	 */
	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	
	/**
	 * Accessor method for the message that each animal will have. 
	 * @return
	 */
	public String getMessage() {
		return message;
	}




	
	

}
