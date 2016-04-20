package stjonesestuary.view.gameviews;
import stjonesestuary.controller.RecycleGameController;
import stjonesestuary.controller.SeedlingGameController;
import stjonesestuary.model.games.RecycleGame;
import stjonesestuary.model.screenitems.ScreenItem;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class MainGameView extends JFrame implements MouseListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JButton sButton, rButton, aButton;

//    JLabel recycleGameLabel = new JLabel(new ImageIcon("imageBank/ReycleGame/applecore.PNG"));
//    JLabel seedlingGameLabel = new JLabel(new ImageIcon("imageBank/SeedlingGame/seed.PNG"));
//    JLabel animalGameLabel = new JLabel(new ImageIcon("imageBank/AnimalGame/mallard.PNG"));
    
	public MainGameView(){
		setTitle("EstuaryExplorer!");
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
	}
	
	public void render (){
		this.renderBackground();
        setVisible(true);
	}
	
	public void renderScreenItems(){

	}
	/**
	 * renderBackground() makes the background image the map of StJones.
	 * 
	 */
	

	public void renderBackground(){
		//setLayout(new BorderLayout());
	    //setContentPane(new JLabel(new ImageIcon("imageBank/StJonesMap.PNG")));
	    setLayout(new FlowLayout());	  
	}
	
	
	public void renderDialogueBox(){
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {		
		// TODO Auto-generated method stub

		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
