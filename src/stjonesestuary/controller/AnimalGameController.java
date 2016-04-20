package stjonesestuary.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import stjonesestuary.model.screenitems.ScreenItem;
import stjonesestuary.view.gameviews.AnimalGameView;
import stjonesestuary.view.gameviews.MainGameView;
import stjonesestuary.view.gameviews.SeedlingGameView;

public class AnimalGameController implements MouseListener, MouseMotionListener {
	private MainGameView window;
	private AnimalGameView view;

	public AnimalGameController(MainGameView window){
		this.window = window;
	}
	public void run(){
		//new instance of timer
		//user timer to call onTick()
		//render
		ArrayList<ScreenItem> screenitems = new ArrayList<ScreenItem>();
		view = new AnimalGameView(window);
		view.render(screenitems);
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
	
	//call init on animalgame.java
	

}
