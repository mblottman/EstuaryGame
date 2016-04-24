package stjonesestuary.view.gameviews;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RecycleGameView extends JPanel {
	
	private ActionListener action;
	private ViewManager viewmgr;
	
	public RecycleGameView(ViewManager viewmgr){
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
//	
//	public RecycleGameView(MainGameView window){
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
////	    window.setContentPane(new JLabel(new ImageIcon("imageBank/RecycleGame/applecore.png")));
////	    window.setLayout(new FlowLayout());
//	}
//
//	@Override
//	public void renderDialogueBox() {
//		// TODO Auto-generated method stub
//		
//	}


}
