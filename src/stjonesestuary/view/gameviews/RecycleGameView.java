package stjonesestuary.view.gameviews;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.omg.CORBA.TIMEOUT;

import stjonesestuary.controller.StJonesController;

import stjonesestuary.controller.RecycleGameController;

public class RecycleGameView extends Viewable {
	private MainGameView window;
	BufferedImage arrowImage = null;

	
	JLabel recycleArrowLabel = new JLabel(new ImageIcon("imageBank/ReycleGame/arrow.PNG"));
	//JFrame frame = new JFrame("imageBank/RecycleGame/recycleGameBackGround.png");
	//JPanel aPanel = new JPanel(new FlowLayout(-100));

	
	public RecycleGameView(MainGameView window){
		this.window = window;
	}
	
	public void render (){
		this.renderBackground();
		//window.setVisible(true);
		window.setVisible(true);
		//renderScreenItems();
		//rotateArrow(1);
		//window.setVisible(true);
	}
	
	public void render0(){
		this.renderBackground();
		window.setVisible(true);
		rotateArrow(0);
	}
	
	public void render2 (){
		this.renderBackground();
		//window.setVisible(true);
		window.setVisible(true);
		//renderScreenItems();
		rotateArrow(1);
		//window.setVisible(true);
	}
	
	public void render3 (){
		this.renderBackground();
		//window.setVisible(true);
		window.setVisible(true);
		//renderScreenItems();
		rotateArrow(2);
		//window.setVisible(true);
	}
	
	public void render4 (){
		this.renderBackground();
		//window.setVisible(true);
		window.setVisible(true);
		//renderScreenItems();
		rotateArrow(1);
		//window.setVisible(true);
	}
	
	public void render5 (){
		this.renderBackground();
		//window.setVisible(true);
		window.setVisible(true);
		//renderScreenItems();
		rotateArrow(0);
		//window.setVisible(true);
	}
	
	public void render6 (){
		this.renderBackground();
		//window.setVisible(true);
		window.setVisible(true);
		//renderScreenItems();
		rotateArrow(-1);
		//window.setVisible(true);
	}
	
	public void render7 (){
		this.renderBackground();
		//window.setVisible(true);
		window.setVisible(true);
		//renderScreenItems();
		rotateArrow(-2);
		//window.setVisible(true);
	}
	
	public void render8 (){
		this.renderBackground();
		//window.setVisible(true);
		window.setVisible(true);
		//renderScreenItems();
		rotateArrow(-1);
		//window.setVisible(true);
	}
	
	public void render9 (){
		this.renderBackground();
		//window.setVisible(true);
		window.setVisible(true);
		//renderScreenItems();
		rotateArrow(0);
		//window.setVisible(true);
	}
	
	public void renderScreenItems(){
		BufferedImage arrowImage = null;
		try {
			arrowImage = ImageIO.read(new File ("imageBank/RecycleGame/arrow.png"));
			JLabel arrowLabel = new JLabel(new ImageIcon (arrowImage));
			window.add(arrowLabel);
			window.setVisible(true);
			System.out.println(arrowLabel.getX());
			System.out.println(arrowLabel.getY());
		} catch (IOException e){ //| InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//JButton arrowButt = new JButton(arrowImage);
		System.out.println("arrow printed");
		

		//rotate(arrowImage);
	}
	
	public void rotateArrow(int degree){
		BufferedImage arrowImage = null;
				try {
					arrowImage = ImageIO.read(new File ("imageBank/RecycleGame/arrow.png"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		AffineTransform transform = new AffineTransform();
		transform.rotate(Math.toDegrees(degree), arrowImage.getWidth()/2, arrowImage.getHeight()/2);
		AffineTransformOp op = new AffineTransformOp(transform, AffineTransformOp.TYPE_BILINEAR);
		arrowImage = op.filter(arrowImage, null);
		JLabel arrowLabel = new JLabel(new ImageIcon (arrowImage));
		arrowLabel = new JLabel(new ImageIcon(arrowImage));
		window.add(arrowLabel);
		window.setVisible(true);
	}
	
	
	
	
	@Override
    public void repaint() {
        super.repaint();
    }
	

//	AffineTransform identity = new AffineTransform();
//
//
//	public void paint(Graphics g) {
//		Graphics2D g2d = (Graphics2D)g;
//		AffineTransform trans = new AffineTransform();
//		trans.setTransform(arrowImage);
//		trans.rotate( Math.toRadians(45) );
//		g2d.drawImage(arrowImage, trans, this);
//	}
//	
//	
//	
	
	
	
//	
	@Override
    public void paintComponent(Graphics g) {
        //super.paintComponent(g);
        //g.drawImage(arrowImage, 500, 500, null);
		Graphics2D g2d = (Graphics2D) g;
        int w2 = getWidth() / 2;
        int h2 = getHeight() / 2;
        g2d.rotate(-Math.PI / 2, w2, h2);
        super.paintComponent(g);
    }
	
//	public void paintComponent(Graphics g) {
//	    // Let UI Delegate paint first, which 
//	    // includes background filling since 
//	    // this component is opaque.
//
//	    super.paintComponent(g);       
//	    g.drawString("This is my custom Panel!",10,20);
//	    redSquare.paintSquare(g);
//	} 
	

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
	    window.setLayout(new FlowLayout());
	}

	@Override
	public void renderDialogueBox() {
		// TODO Auto-generated method stub
		
	}


}
