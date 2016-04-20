package stjonesestuary.view.gameviews;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import stjonesestuary.controller.AnimalGameController;
import stjonesestuary.model.screenitems.ScreenItem;

public class AnimalGameView extends Viewable {
	private MainGameView window;

	public AnimalGameView(MainGameView window){
		this.window = window;
	}
	
	public void render (ArrayList<ScreenItem> si){
		renderBackground();
	}
	
	public void renderScreenItems(ArrayList<ScreenItem> si){
		
	}
	
	public void renderBackground(){
		window.setLayout(new BorderLayout());
	    window.setContentPane(new JLabel(new ImageIcon("imageBank/AnimalGame/animalgameBackground.png")));
	    window.setLayout(new FlowLayout());
	    window.setVisible(true);
	}
	
	public void renderDialogueBox(){
		
	}

}
