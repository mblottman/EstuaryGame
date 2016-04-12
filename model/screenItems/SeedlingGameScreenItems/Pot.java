package screenItems.SeedlingGameScreenItems;

import screenItems.ScreenItem;

public class Pot extends ScreenItem{
	private String potDescript = "blah im a pot";

	public Pot(double xPos, double yPos) {
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
