package stjonesestuary.view;

import java.awt.Graphics2D;
import stjonesestuary.controller.SeedlingGameController;


public class SeedlingGameView extends Viewable {
	
	public SeedlingGameView(){
		render();
	}
	
	public void render (){
		setTitle("Simple example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
	}
	
	public void renderScreenItems(){
		
	}
	
	public void renderBackground(){
		
	}
	
	public void renderDialogueBox(){
		
	}

}
