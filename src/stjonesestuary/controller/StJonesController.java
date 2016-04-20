package stjonesestuary.controller;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import stjonesestuary.view.gameviews.MainGameView;

public class StJonesController  implements MouseListener, MouseMotionListener,ActionListener{
	protected JButton sButton, rButton, aButton;
	private RecycleGameController recyclecontrol;
	private SeedlingGameController seedlingcontrol;
	private AnimalGameController animalcontrol;
	private JFrame window;
	public void run(){
		//will save current main game 
		
	}
	
	/**
	 * Will pull up the start up screen 
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException{
		//init main game
		//wait for signal from main game to tell it what game to play
		//run the specific game controller dependent on that
		//wait for a new game		
		StJonesController game = new StJonesController();
		game.window = new MainGameView();
		game.recyclecontrol = new RecycleGameController(game.window);
		//game.seedlingcontrol = new SeedlingGameController(game.window);
		//game.animalcontrol = new AnimalGameController(game.window);
		//game.window.render();
		//game.window.render();
		game.renderButtons();//*/
		//game.recyclecontrol.run();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void renderButtons(){
		ImageIcon recycleButton = new ImageIcon("imageBank/RecycleGame/applecore.png");
		ImageIcon seedlingButton = new ImageIcon("imageBank/SeedlingGame/seed.png");
		ImageIcon animalButton = new ImageIcon("imageBank/AnimalGame/mallard.png");
		final StJonesController game = this;
		rButton = new JButton(recycleButton);
		sButton = new JButton(seedlingButton);
		aButton = new JButton(animalButton);
		game.window.setLayout(new FlowLayout());	  
		rButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Thread thread = new Thread() {
			        public void run() {
			        	game.recyclecontrol.run();			        }
			    };
			    thread.start();
			}
		}
		);
		sButton.addActionListener(this);
		aButton.addActionListener(this);
		
		sButton.setActionCommand("seedling");
		aButton.setActionCommand("animal");
		
		window.add(rButton);
		window.add(sButton);
		window.add(aButton);	
		window.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {}

}
