package stjonesestuary.view.gameviews;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AnimalGameView extends JPanel {
	private ActionListener action;
	private ViewManager viewmgr;
	protected BufferedImage backgroundImage;

	
	public AnimalGameView(ViewManager viewmgr){
		this.viewmgr = viewmgr;
		init();
	}
	
	private void init(){
		this.makeBackground();
		this.makeButtons();
		this.loadRes();
	}
	
	private void makeBackground(){
		JPanel temppane = this.getViewmgr().getContentPane();
		temppane.validate();
		temppane.repaint();
		this.getViewmgr().setContentPane(temppane);
	}
	
	private void makeButtons(){
		
	}
	
	private void loadRes(){
		try {
			this.setBackgroundImage(ImageIO.read(new File("imageBank/animalGame/animalgameBackground.png")));
		}
		catch (IOException ex) {
	           ex.printStackTrace(System.err);
	    }
	}
	
	@Override
	protected void paintComponent(Graphics g) {
	    super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, null);
        System.out.println("animal paintComponent got called!");
	}
		
	private ViewManager getViewmgr() {
		return viewmgr;
	}

	private void setViewmgr(ViewManager viewmgr) {
		this.viewmgr = viewmgr;
	}
	
	private ActionListener getAction() {
		return action;
	}

	private void setAction(ActionListener action) {
		this.action = action;
	}
	
	private BufferedImage getBackgroundImage() {
		return backgroundImage;
	}

	private void setBackgroundImage(BufferedImage backgroundImage) {
		this.backgroundImage = backgroundImage;
	}
	
	
	
	
	
	
	
	
	
	
	
//	private MainGameView window;
//
//	public AnimalGameView(MainGameView window){
//		this.window = window;
//	}
//	
//	public void render (){
//		renderBackground();
//		window.render();
//	}
//	
//	public void renderScreenItems(){
//		
//	}
//	
//	public void renderBackground(){
////		window.setLayout(new BorderLayout());
////	    window.setContentPane(new JLabel(new ImageIcon("imageBank/AnimalGame/mallard.png")));
////	    window.setLayout(new FlowLayout());
//	}
//	
//	public void renderDialogueBox(){
//		
//	}
}
