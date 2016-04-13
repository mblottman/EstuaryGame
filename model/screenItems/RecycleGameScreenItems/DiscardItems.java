package screenItems.RecycleGameScreenItems;

import java.awt.Graphics2D;

import screenItems.ScreenItem;

public class DiscardItems extends ScreenItem {
	
	private boolean isRecyclable;
	private boolean isThrown;
	private String name;

	public DiscardItems(int xPos, int yPos) {
		super(xPos, yPos);
	
		// got rid of name attribute
		// TODO Auto-generated constructor stub
	}
	
	public boolean getIsRecyclable() {
		return isRecyclable;
	}

	public void setRecyclable(boolean isRecyclable) {
		this.isRecyclable = isRecyclable;
	}
	
	public boolean getIsThrown(){
		return isThrown;
	}
	
	public void setThrown(boolean isThrown){
		this.isThrown = isThrown;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Will check if the bin is discarded in 
	 * hit trash
	 * hit recycle
	 * miss
	 * in transit
	 * will compare the positions of the trash bin and recycle bin 
	 * 
	 */
	public int checkBin(){
		return 0;
		
	}
	
	/**
	 * can handle trajectory for the discard item if we need
	 */
	
	public void updatePos(){
		
	}

	/**
	 * Method definition. render() is method for rendering images to the screen
	 */
	
	public void render(Graphics2D graphics){
		// need to add switch statements
		
	}
}
