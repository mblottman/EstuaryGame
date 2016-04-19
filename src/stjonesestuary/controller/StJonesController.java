package stjonesestuary.controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.Timer;

import stjonesestuary.view.gameviews.MainGameView;
import stjonesestuary.view.gameviews.RecycleGameView;

public class StJonesController  implements MouseListener, MouseMotionListener{
	Timer timer;
	
	
	public void run(){
		//will save current main game 
		
	}
	
	/**
	 * Will pull up the start up screen 
	 * @param args
	 * @throws InterruptedException 
	 */
	
//	public static void main(String[] args) throws InterruptedException{
//		Timer t = new Timer(20,null);
//		t.start();
//		//init main game
//		//wait for signal from main game to tell it what game to play
//		//run the specific game controller dependent on that
//		//wait for a new game
//		MainGameView window = new MainGameView();
//		window.render();
////		long tstart = System.currentTimeMillis();
////		long tend = System.currentTimeMillis();
////		while (tend - tstart < 100){
////			tend = System.currentTimeMillis();
////		}
////		window.render2();
//		
//		System.err.println("BLAH");
//	}
	
	public static void main(String[] args) throws InterruptedException{
	Timer t = new Timer(20,null);
	t.start();
	//init main game
	//wait for signal from main game to tell it what game to play
	//run the specific game controller dependent on that
	//wait for a new game
	MainGameView window = new MainGameView();
	RecycleGameView rgv = new RecycleGameView(window);
	window.render();
	while (window.rclicked == false){
		Thread.sleep(10);
	}
	
//	long tstart = System.currentTimeMillis();
//	long tend = System.currentTimeMillis();
//	while (tend - tstart < 100){
//		tend = System.currentTimeMillis();
//	}
	
	rgv.render();
	Thread.sleep(300);
	rgv.render2();
	Thread.sleep(300);
	rgv.render3();
	Thread.sleep(200);
	rgv.render4();
	Thread.sleep(300);
	rgv.render5();
	Thread.sleep(300);
	rgv.render6();
	Thread.sleep(300);
	rgv.render7();
	Thread.sleep(300);
	rgv.render8();
	Thread.sleep(300);
	rgv.render9();
	Thread.sleep(300);
	rgv.render0();
	Thread.sleep(300);
	rgv.render2();
	Thread.sleep(300);
	rgv.render3();
	Thread.sleep(200);
	rgv.render4();
	Thread.sleep(300);
	rgv.render5();
	Thread.sleep(300);
	rgv.render6();
	Thread.sleep(300);
	rgv.render7();
	Thread.sleep(300);
	rgv.render8();
	Thread.sleep(300);
	rgv.render9();
	Thread.sleep(300);
	rgv.render0();
	Thread.sleep(300);
	rgv.render2();
	Thread.sleep(300);
	rgv.render3();
	Thread.sleep(200);
	rgv.render4();
	Thread.sleep(300);
	rgv.render5();
	Thread.sleep(300);
	rgv.render6();
	Thread.sleep(300);
	rgv.render7();
	Thread.sleep(300);
	rgv.render8();
	Thread.sleep(300);
	rgv.render9();
	Thread.sleep(300);
	rgv.render0();
	Thread.sleep(300);
	rgv.render2();
	Thread.sleep(300);
	rgv.render3();
	Thread.sleep(200);
	rgv.render4();
	Thread.sleep(300);
	rgv.render5();
	Thread.sleep(300);
	rgv.render6();
	Thread.sleep(300);
	rgv.render7();
	Thread.sleep(300);
	rgv.render8();
	Thread.sleep(300);
	rgv.render9();
	Thread.sleep(300);
	rgv.render0();
	Thread.sleep(300);
	rgv.render2();
	Thread.sleep(300);
	rgv.render3();
	Thread.sleep(200);
	rgv.render4();
	Thread.sleep(300);
	rgv.render5();
	Thread.sleep(300);
	rgv.render6();
	Thread.sleep(300);
	rgv.render7();
	Thread.sleep(300);
	rgv.render8();
	Thread.sleep(300);
	rgv.render9();
	Thread.sleep(300);
	rgv.render0();
	Thread.sleep(300);
	rgv.render2();
	Thread.sleep(300);
	rgv.render3();
	Thread.sleep(200);
	rgv.render4();
	Thread.sleep(300);
	rgv.render5();
	Thread.sleep(300);
	rgv.render6();
	Thread.sleep(300);
	rgv.render7();
	Thread.sleep(300);
	rgv.render8();
	Thread.sleep(300);
	rgv.render9();
	Thread.sleep(300);
	rgv.render0();
	Thread.sleep(300);
	rgv.render2();
	Thread.sleep(300);
	rgv.render3();
	Thread.sleep(200);
	rgv.render4();
	Thread.sleep(300);
	rgv.render5();
	Thread.sleep(300);
	rgv.render6();
	Thread.sleep(300);
	rgv.render7();
	Thread.sleep(300);
	rgv.render8();
	Thread.sleep(300);
	rgv.render9();
	Thread.sleep(300);
	rgv.render0();
	Thread.sleep(300);
	rgv.render2();
	Thread.sleep(300);
	rgv.render3();
	Thread.sleep(200);
	rgv.render4();
	Thread.sleep(300);
	rgv.render5();
	Thread.sleep(300);
	rgv.render6();
	Thread.sleep(300);
	rgv.render7();
	Thread.sleep(300);
	rgv.render8();
	Thread.sleep(300);
	rgv.render9();
	Thread.sleep(300);
	rgv.render0();
	Thread.sleep(300);
	rgv.render2();
	Thread.sleep(300);
	rgv.render3();
	Thread.sleep(200);
	rgv.render4();
	Thread.sleep(300);
	rgv.render5();
	Thread.sleep(300);
	rgv.render6();
	Thread.sleep(300);
	rgv.render7();
	Thread.sleep(300);
	rgv.render8();
	Thread.sleep(300);
	rgv.render9();
	Thread.sleep(300);
	rgv.render0();
	Thread.sleep(300);
	rgv.render2();
	Thread.sleep(300);
	rgv.render3();
	Thread.sleep(200);
	rgv.render4();
	Thread.sleep(300);
	rgv.render5();
	Thread.sleep(300);
	rgv.render6();
	Thread.sleep(300);
	rgv.render7();
	Thread.sleep(300);
	rgv.render8();
	Thread.sleep(300);
	rgv.render9();
	Thread.sleep(300);
	rgv.render0();
	Thread.sleep(300);
	rgv.render2();
	Thread.sleep(300);
	rgv.render3();
	Thread.sleep(200);
	rgv.render4();
	Thread.sleep(300);
	rgv.render5();
	Thread.sleep(300);
	rgv.render6();
	Thread.sleep(300);
	rgv.render7();
	Thread.sleep(300);
	rgv.render8();
	Thread.sleep(300);
	rgv.render9();
	Thread.sleep(300);
	rgv.render0();
	Thread.sleep(300);
	rgv.render2();
	Thread.sleep(300);
	rgv.render3();
	Thread.sleep(200);
	rgv.render4();
	Thread.sleep(300);
	rgv.render5();
	Thread.sleep(300);
	rgv.render6();
	Thread.sleep(300);
	rgv.render7();
	Thread.sleep(300);
	rgv.render8();
	Thread.sleep(300);
	rgv.render9();
	
	System.err.println("BLAH");
}
	// Molly's main
//	public static void main(String[] args){
//		MainGameView mgv = new MainGameView();
//		mgv.render();
//		System.out.println(mgv.rButton.isEnabled());
//		if (mgv.rButton.isEnabled()){
//			RecycleGameView rgv = new RecycleGameView(mgv);
//			rgv.render();
//		}
//	}

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
