package stjonesestuary.model.screenitems.seedlinggamescreenitems;

import stjonesestuary.model.screenitems.ScreenItem;

public class Pot extends ScreenItem{
	private String potDescript = "blah im a pot";

	public Pot(int xPos, int yPos) {
		super(xPos, yPos);
		// TODO Auto-generated constructor stub
	}

	public String getPotDescript() {
		return potDescript;
	}
	public void setPotDescript(String descript) {
		this.potDescript = descript;
	}

	public int hashCode() {
		return 21;
	}

	
}
