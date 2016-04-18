package stjonesestuary.view.gameviews;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import stjonesestuary.controller.StJonesController;

import stjonesestuary.controller.RecycleGameController;

public class RecycleGameView extends Viewable {
	private MainGameView window;
	
	
	JLabel recycleArrowLabel = new JLabel(new ImageIcon("imageBank/ReycleGame/arrow.PNG"));
	//JFrame frame = new JFrame("imageBank/RecycleGame/recycleGameBackGround.png");
	JPanel aPanel = new JPanel(new FlowLayout(-100));

	
	public RecycleGameView(MainGameView window){
		this.window = window;
	}
	
	public void render (){
		renderBackground();
		//renderScreenItems();
		window.render();
	}
	
	public void renderScreenItems(){
		BufferedImage arrowImage = null;
		try {
			arrowImage = ImageIO.read(new File ("imageBank/RecycleGame/arrow.png"));
			JLabel arrowLabel = new JLabel(new ImageIcon (arrowImage));
			//window.add(arrowLabel);
//			Dimension size = arrowLabel.getPreferredSize();
//			arrowLabel.setBounds(100, 100, size.width, size.height);
		    aPanel.add(arrowLabel);
		    window.getContentPane().add(aPanel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//JButton arrowButt = new JButton(arrowImage);
		System.out.println("arrow printed");
		

		rotate(arrowImage);
	}
	
	
	
	public BufferedImage rotate (BufferedImage inputImage){
		System.out.println("arrow rotate");
		int width = inputImage.getWidth();
		int height = inputImage.getHeight();
		
		BufferedImage returnImage = new BufferedImage (width, height,inputImage.getType());
		
		for (int x = 0; x < width; x++){
			for (int y=0 ; y< height; y++){
				returnImage.setRGB(width-x-1, height-y-1, inputImage.getRGB(x, y));
			}
		}
		
		return returnImage;
	}
	
	
	public void renderBackground(){
		window.setLayout(new BorderLayout());
	    window.setContentPane(new JLabel(new ImageIcon("imageBank/RecycleGame/recycleGameBackGround.png")));
	    window.setLayout(new FlowLayout());
		renderScreenItems();
//		setLayout(new BorderLayout());
//		setContentPane(new JLabel(new ImageIcon("imageBank/RecycleGame/recycleGameBackGround.png")));
//		setLayout(new FlowLayout());
//		System.out.println("recycle background printed blah blah blah");
	}

	@Override
	public void renderDialogueBox() {
		// TODO Auto-generated method stub
		
	}


}
