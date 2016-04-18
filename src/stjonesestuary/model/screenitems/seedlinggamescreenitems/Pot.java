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
		BufferedImage potImage = null;
		/*File folder = new File("imageBank.SeedlingGame");
		File[] listOfFile = folder.listFiles();
		try{
			potImage = ImageIO.read(listOfFile[8]);
		} catch(IOException e){
			e.printStackTrace();
		}*/

		while(isPotMove) {
			for(int i = 250; i< 500;i++){
				potImage.getSubimage(getxPos()*i, 0, getxPos(), getyPos());
			}
		}
		isPotMove = false;
	}

	
}
