package stjonesestuary.view.gameviews;
import java.awt.Graphics2D;

import stjonesestuary.controller.SeedlingGameController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGameView extends Viewable{
	
	public MainGameView(){
		setTitle("EstuaryExplorer!");
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void render (){
        setVisible(true);
	}
	
	public void renderScreenItems(){
		
	}
	
	public void renderBackground(){
		setLayout(new BorderLayout());
	    setContentPane(new JLabel(new ImageIcon("imageBank/StJonesMap.PNG")));
	    setLayout(new FlowLayout());
	}
	
	public void renderDialogueBox(){
		
	}

}
