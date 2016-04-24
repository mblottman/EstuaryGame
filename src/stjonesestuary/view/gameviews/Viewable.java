package stjonesestuary.view.gameviews;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

import stjonesestuary.model.screenitems.ScreenItem;


public abstract class Viewable extends JPanel{
	
	public void paintComponent(Graphics g){};
	
	abstract public void render(ArrayList<ScreenItem> si);
	
	abstract public void renderScreenItems(ArrayList<ScreenItem> si);
	
	abstract public void renderBackground();
	
	abstract public void renderDialogueBox();

}
