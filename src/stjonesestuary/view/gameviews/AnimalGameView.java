package stjonesestuary.view.gameviews;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AnimalGameView extends JPanel {
	private ActionListener action;
	private ViewManager viewmgr;
	
	public AnimalGameView(ViewManager viewmgr){
		this.viewmgr = viewmgr;
		init();
	}
	
	private void init(){
		this.makeButtons();
	}
	
	
	private void makeButtons(){
		
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
