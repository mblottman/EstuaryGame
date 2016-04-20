package stjonesestuary.view.gameviews;
import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import stjonesestuary.controller.StJonesController;
import stjonesestuary.model.screenitems.ScreenItem;
import stjonesestuary.model.screenitems.recyclegamescreenitems.Arrow;
import stjonesestuary.controller.RecycleGameController;
import javax.imageio.ImageIO;

public class RecycleGameView extends JPanel{
	private JFrame window;
	public BufferedImage arrowImage;
	public int x;

	
	//JLabel recycleArrowLabel = new JLabel(new ImageIcon("imageBank/ReycleGame/arrow.PNG"));
	//JFrame frame = new JFrame("imageBank/RecycleGame/recycleGameBackGround.png");
	//JPanel aPanel = new JPanel(new FlowLayout(-100));

	
	public RecycleGameView(JFrame window){
		this.window = window;
		x = 40;
		try {
			arrowImage = ImageIO.read(new File ("imageBank/RecycleGame/arrow_90.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void render (ArrayList<ScreenItem> si){
		//renderScreenItems(si);
		//window.setVisible(true);

	}
	
	public void renderScreenItems(ArrayList<ScreenItem> si){
		/*BufferedImage arrowImage = null;
		JLabel arrowLabel = null;
		Arrow arrow = (Arrow) si.get(0);
		try {
			arrowImage = ImageIO.read(new File ("imageBank/RecycleGame/arrow.png"));
			ImageIcon arrowicon = new ImageIcon(arrowImage);
			RotatedIcon ri = new RotatedIcon(arrowicon,arrow.getOrientation());
			arrowLabel = new JLabel(ri);
			window.add(arrowLabel);
			
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
	
//	
//	@Override
//    public void paintComponent(Graphics g) {
//        Graphics2D g2d = (Graphics2D) g;
//        int w2 = getWidth() / 2;
//        int h2 = getHeight() / 2;
//        g2d.rotate(-Math.PI / 2, w2, h2);
//        super.paintComponent(g);
//    }
	
	
	
	
	
//	public BufferedImage rotate (BufferedImage inputImage){
//		System.out.println("arrow rotate");
//		int width = inputImage.getWidth();
//		int height = inputImage.getHeight();
//		
//		BufferedImage returnImage = new BufferedImage (width, height,inputImage.getType());
//		
//		for (int x = 0; x < width; x++){
//			for (int y=0 ; y< height; y++){
//				returnImage.setRGB(width-x-1, height-y-1, inputImage.getRGB(x, y));
//			}
//		}
//		
//		return returnImage;
//	}
	
	
	public void renderBackground(){
		window.setLayout(new BorderLayout());
	    window.setContentPane(new JLabel(new ImageIcon("imageBank/RecycleGame/recycleGameBackGround.png")));
	    window.setVisible(true);
	}

	public void renderDialogueBox() {
		// TODO Auto-generated method stub
		
	}
	public void paintComponent(Graphics g) {
		//renderBackground();
		super.paintComponent(g);
        g.drawImage(arrowImage, 40, x, this);
	};


}
