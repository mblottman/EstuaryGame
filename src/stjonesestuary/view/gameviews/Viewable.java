package stjonesestuary.view.gameviews;

import java.awt.Graphics2D;

public interface Viewable {
	
	public void render (Graphics2D g);
	
	public void renderScreenItems();
	
	public void renderBackground();
	
	public void renderDialogueBox();

}
