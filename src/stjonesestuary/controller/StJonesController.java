package stjonesestuary.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class StJonesController  implements MouseListener, MouseMotionListener{
	
	public void run(){
		//will save current main game 
		
	}
	
	/**
	 * Will pull up the start up screen 
	 * @param args
	 */
	
	public static void main(String[] args){
		//init main game
		//wait for signal from main game to tell it what game to play
		//run the specific game controller dependent on that
		//wait for a new game
		SeedlingGameController testviewgame = new SeedlingGameController();
		testviewgame.run();
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

}
