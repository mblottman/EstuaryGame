package stjonesestuary.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.concurrent.TimeUnit;

import stjonesestuary.view.gameviews.MainGameView;

public class StJonesController  implements MouseListener, MouseMotionListener{
	
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
		MainGameView window = new MainGameView();
		window.renderBackground();
		window.render();
		SeedlingGameController seedcontrol = new SeedlingGameController(window);
		AnimalGameController animalcontrol = new AnimalGameController(window);
		RecycleGameController recyclecontrol = new RecycleGameController(window);
		//This is to show it runs
		TimeUnit.SECONDS.sleep(2);
		seedcontrol.run();
		TimeUnit.SECONDS.sleep(2);
		animalcontrol.run();
		TimeUnit.SECONDS.sleep(2);
		recyclecontrol.run();
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
