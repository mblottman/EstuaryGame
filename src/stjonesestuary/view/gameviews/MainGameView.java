package stjonesestuary.view.gameviews;
import stjonesestuary.controller.SeedlingGameController;
import stjonesestuary.model.games.RecycleGame;

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


public class MainGameView extends Viewable implements MouseListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    JLabel recycleGameLabel = new JLabel(new ImageIcon("imageBank/ReycleGame/applecore.PNG"));
    JLabel seedlingGameLabel = new JLabel(new ImageIcon("imageBank/SeedlingGame/seed.PNG"));
    JLabel animalGameLabel = new JLabel(new ImageIcon("imageBank/AnimalGame/mallard.PNG"));
    
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
	/**
	 * renderButtons() puts the initial buttons to go to the subgames on the board.
	 * An ImageIcon is made using the appropriate icons in the image bank, a button is 
	 * made from these ImageIcons, and they are displayed on the screen. 
	 * ActionListeners are added to each button to listen to clicks. When a button is clicked
	 * it takes the user to the appropriate subgame.
	 */
	
	public void renderButtons(){
		ImageIcon recycleButton = new ImageIcon("imageBank/RecycleGame/applecore.png");
		ImageIcon seedlingButton = new ImageIcon("imageBank/SeedlingGame/seed.png");
		ImageIcon animalButton = new ImageIcon("imageBank/AnimalGame/mallard.png");
		
		JButton rButton = new JButton(recycleButton);
		JButton sButton = new JButton(seedlingButton);
		JButton aButton = new JButton(animalButton);
		
		add(rButton);
		add(sButton);
		add(aButton);
		
		rButton.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent r){
				renderBackground();
				//RecycleGame rg = new RecycleGame();
			    //renderBackground();
//				setLayout(new BorderLayout());
//				setContentPane(new JLabel(new ImageIcon("imageBank/RecycleGame/recycleGameBackGround.png")));
//				setLayout(new FlowLayout());
//				System.out.println("recycle background printed blah blah blah");
				renderScreenItems();
			}
			
		});
		
		sButton.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent s){
					setLayout(new BorderLayout());
					setContentPane(new JLabel(new ImageIcon("imageBank/SeedlingGame/seedlingGameBackground.png")));
					System.out.println("seedling background printed");
					setLayout(new FlowLayout());

			}
		});
		
		aButton.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent a){
					setLayout(new BorderLayout());
					setContentPane(new JLabel(new ImageIcon("imageBank/AnimalGame/animalgameBackground.png")));
					setLayout(new FlowLayout());
					System.out.println("animal abackground printed");
			}
		});

	}
	
	/**
	 * renderBackground() makes the background image the map of StJones.
	 * 
	 */
	

	public void renderBackground(){
		setLayout(new BorderLayout());
	    setContentPane(new JLabel(new ImageIcon("imageBank/StJonesMap.PNG")));
	    setLayout(new FlowLayout());
	    renderButtons();
	    

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
