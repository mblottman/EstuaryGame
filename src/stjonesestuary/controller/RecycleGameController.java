package stjonesestuary.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Timer;

import stjonesestuary.view.gameviews.MainGameView;
import stjonesestuary.view.gameviews.RecycleGameView;
import stjonesestuary.view.gameviews.SeedlingGameView;

public class RecycleGameController implements MouseListener, MouseMotionListener {
	private RecycleGameView view;
	
	private MainGameView window;
	
	public RecycleGameController(MainGameView window){
		this.window = window;
	}
	public void run(){
		//new instance of timer
		//user timer to call onTick()
		//render
		view = new RecycleGameView(window);
		this.view.render();
		view.renderScreenItems();
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
