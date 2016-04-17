package stjonesestuary.view.gameviews;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import stjonesestuary.controller.AnimalGameController;

public class AnimalGameView extends Viewable {
	private MainGameView window;

	public AnimalGameView(MainGameView window){
		this.window = window;
	}
	
	public void render (){
		renderBackground();
		window.render();
	}
	
	public void renderScreenItems(){
		
	}
	
	public void renderBackground(){
//		window.setLayout(new BorderLayout());
//	    window.setContentPane(new JLabel(new ImageIcon("imageBank/AnimalGame/mallard.png")));
//	    window.setLayout(new FlowLayout());
	}
	
	public void renderDialogueBox(){
		
	}
}
