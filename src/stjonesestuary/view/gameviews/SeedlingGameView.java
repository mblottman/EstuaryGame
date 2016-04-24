package stjonesestuary.view.gameviews;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SeedlingGameView extends JPanel{
	private ActionListener action;
	private ViewManager viewmgr;
	
	public SeedlingGameView(ViewManager viewmgr){
		this.viewmgr = viewmgr;
		init();
	}
	
	private void init(){
		this.makeButtons();
	}
	
	
	private void makeButtons(){
		
	}	
		
	private ViewManager getViewmgr() {
		return viewmgr;
	}

	private void setViewmgr(ViewManager viewmgr) {
		this.viewmgr = viewmgr;
	}
	
	private ActionListener getAction() {
		return action;
	}

	private void setAction(ActionListener action) {
		this.action = action;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	private MainGameView window;
//	public SeedlingGameView(MainGameView window){
//		this.window = window;
//	}
//	
//	public void render (){
//		renderBackground();
//		window.render();
//	}
//	
//	public void renderScreenItems(){
//		
//	}
//	
//	public void renderBackground(){
////		window.setLayout(new BorderLayout());
////	    window.setContentPane(new JLabel(new ImageIcon("imageBank/SeedlingGame/seed.png")));
////	    window.setLayout(new FlowLayout());
//	}
//	
//	public void renderDialogueBox(){
//		
//	}

}
