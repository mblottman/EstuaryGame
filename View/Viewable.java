package StJonesEstuary;

import java.awt.Graphics2D;
import java.awt.EventQueue;
import javax.swing.JFrame;

public abstract class Viewable extends JFrame{
	
	public void render (Graphics2D g){};
	
	public void renderScreenItems(){};
	
	public void renderBackground(){};
	
	public void renderDialogueBox(){};

}
