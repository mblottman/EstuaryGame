package stjonesestuary.model.screenitems.recyclegamescreenitems;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import stjonesestuary.model.screenitems.ScreenItem;

public class Arrow extends ScreenItem {
	
	private static double orientation = 0;
	private boolean movingLeft = false;	// determine if the arrow is currently moving left
	private boolean movingRight = true;	// determine if the arrow is currently moving right
    private final int LEFTEND = -90;
    private final int RIGHTEND = 90; 
    public int picNum = 0; // choosing the right image from sprite sheet
    public BufferedImage[] pics;

    
    
    // Need to be able to decide which 
    // buffer image method = loaded the correct sprite sheet image 
	
	//we might not want orientation to be a double
	public Arrow(int xPos, int yPos, double orientation) {
		super(xPos, yPos);
		this.orientation = orientation;
		// TODO Auto-generated constructor stub
	}
	
	public double getOrientation() {
		return orientation;
	}

	public void setOrientation(double orientation) {
		this.orientation = orientation;
	}
	
	public boolean getMovingLeft(){
		return movingLeft;
	}
	
	public void setMovingLeft(boolean movingLeft){
		this.movingLeft = movingLeft;
	}
	
	public boolean getMovingRight(){
		return movingRight;
	}
	
	public void setMovingRight(boolean movingRight){
		this.movingRight = movingRight;
	}
	
	public void moveArrow(){
		// moving the arrow should update every tick
		// should move 180 degrees without us having to move it
		// 
		// Let orientation 0 be completely vertical (a.k.a. 90 degrees)
		// Moving to the left decreases the 

		// for right now assume we only have 5 arrow movements inbetween bottom and top

		// if orientation == left end value (? = -90) and movingLeft == true
		if (orientation == LEFTEND && movingLeft == true){
			movingLeft = false;
			movingRight = true;
		}
		// if orientation == right end value (? = 90) and movingRight == true
		if (orientation == RIGHTEND && movingRight == true){
			movingLeft = true;
			movingRight = false;
		}
		// regardless of orientation movingLeft decreseases orientation and movingRight increases orientation
		if (movingLeft == true){	// moving left
			orientation -= 15;
		}
		else {  // moving right
			orientation += 15;
		}

	}

	
    //Read image from file and return
//    private BufferedImage createImage(String orientation){
//    	BufferedImage bufferedImage;
//    	try {
//    		/// import image
//    		bufferedImage = ImageIO.read(new File("arrow/arrow_" + orientation + ".png"));
//    		return bufferedImage;
//    	} catch (IOException e) {
//    		e.printStackTrace();
//    	}
//    	return null;
//    }
    
    // FIX THIS NOWWWWWWW
	

    //Constructor: get image, segment and store in array
//    public void ChangeArrow(){
//    	String[] arrayDirec = new String[] {"0", "15","30","45","60","75","90","-15","-30","-45","-60","-75","-90"};
//    	
//    	pics = new BufferedImage[13];
//    	for(int i = 0; i < 13 ; i++){
//    		BufferedImage img = createImage(arrayDirec[i]);   	    		
//	    	pics[i] = img.getSubimage(3*i, 0, 3, 3);
//    	}
//    	// TODO: Change this constructor so that at least eight orc animation pngs are loaded
//    }

	
	
	public int hashCode() {
		return 12;
	}




}
