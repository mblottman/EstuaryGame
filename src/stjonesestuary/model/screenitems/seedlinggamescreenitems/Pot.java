package stjonesestuary.model.screenitems.seedlinggamescreenitems;

import stjonesestuary.model.screenitems.ScreenItem;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Pot extends ScreenItem{
	private String potDescript = "blah im a pot";
	boolean isPotMove = false;


	public Pot(int xPos, int yPos) {
		super(xPos, yPos);
		// TODO Auto-generated constructor stub
	}

	public String getPotDescript() {
		return potDescript;
	}
	public void setPotDescript(String descript) {
		this.potDescript = descript;
	}

	public int hashCode() {
		return 21;
	}
	
	public void movePot(){
		//After the animation of seeding, set isPotMove = true.
		//Move the pot from original position to right and make it disappear.
		while(isPotMove) {
			for(int i = 0; i< 500;i++){
				setxPos(getxPos() + 1);
			}
		}
		isPotMove = false;
	}
	private BufferedImage createImage(){
		BufferedImage bufferedImage;
		try{
			bufferedImage = ImageIO.read(new File("pot.png"));
    		return bufferedImage;
		} catch(IOException e){
			e.printStackTrace();
		}
		return null;
	}
	
	public void animationPot(){
		BufferedImage potImg;
    	potImg = createImage();
    	for(int i = 250; i < 500; i++){
    		potImg = potImg.getSubimage(getxPos(), 0, potImg.getWidth(), potImg.getHeight());
    	}
	}
}
