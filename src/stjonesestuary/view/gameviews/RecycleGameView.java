package stjonesestuary.view.gameviews;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import stjonesestuary.controller.RecycleGameController;

public class RecycleGameView extends Viewable {
	private MainGameView window;
	
	public RecycleGameView(MainGameView window){
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
//	    window.setContentPane(new JLabel(new ImageIcon("imageBank/RecycleGame/applecore.png")));
//	    window.setLayout(new FlowLayout());
	}

	@Override
	public void renderDialogueBox() {
		// TODO Auto-generated method stub
		
	}


}
