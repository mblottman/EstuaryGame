package stjonesestuary.view.gameviews;

import java.awt.Graphics2D;

import java.awt.EventQueue;
import javax.swing.JFrame;


public abstract class Viewable extends JFrame{
	
	abstract public void render();
	
	abstract public void renderScreenItems();
	
	abstract public void renderBackground();
	
	abstract public void renderDialogueBox();

}
