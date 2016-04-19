package stjonesestuary.view.gameviews;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import stjonesestuary.controller.SeedlingGameController;

public class SeedlingGameView extends Viewable{
	private MainGameView window;
	BufferedImage seedlingPot = null;

	
	//JLabel seelingPotLabel = new JLabel(new ImageIcon("imageBank/SeedlingGame/pot.PNG"));
	
	
	public SeedlingGameView(MainGameView window){
		this.window = window;
	}
	
	public void render (){
		renderBackground();
		//window.render();
		window.setVisible(true);
	}
	
	public void renderScreenItems(){
		BufferedImage seedlingPot = null;
		try {
			seedlingPot = ImageIO.read(new File ("imageBank/SeedlingGame/pot.png"));
			JLabel potLabel = new JLabel(new ImageIcon (seedlingPot));
			window.add(potLabel);
			window.setVisible(true);
		} catch (IOException e){ //| InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//JButton arrowButt = new JButton(arrowImage);
		System.out.println("pot printed");
	}
	
	public void renderBackground(){
		window.setLayout(new BorderLayout());
	    window.setContentPane(new JLabel(new ImageIcon("imageBank/SeedlingGame/seedlingGameBackground.png")));
	    window.setLayout(new FlowLayout());
	}
	
	public void renderDialogueBox(){
		
	}

}
