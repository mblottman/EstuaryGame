package stjonesestuary.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Timer;

import com.sun.java.swing.plaf.windows.resources.windows;

import stjonesestuary.view.gameviews.MainGameView;
import stjonesestuary.view.gameviews.SeedlingGameView;
import stjonesestuary.view.gameviews.Viewable;


public class SeedlingGameController implements MouseListener, MouseMotionListener {
	private SeedlingGameView view;
	private MainGameView window;
	
	public SeedlingGameController(MainGameView window){
		this.window = window;
	}
	public void run(){
		//new instance of timer
		//user timer to call onTick()
		//render
		view = new SeedlingGameView(window);
		view.render();
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
