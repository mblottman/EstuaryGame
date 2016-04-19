package stjonesestuary.view.gameviews;

import java.awt.Graphics2D;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;


public abstract class Viewable extends JFrame{
	
	abstract public void render();
	
	abstract public void renderScreenItems();
	
	abstract public void renderBackground();
	
	abstract public void renderDialogueBox();

	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
