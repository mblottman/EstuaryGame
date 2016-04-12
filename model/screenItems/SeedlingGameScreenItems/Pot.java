package screenItems.SeedlingGameScreenItems;

import screenItems.ScreenItem;

public class Pot extends ScreenItem{
	private final String potDescript = "blah im a pot";

	public Pot(double xPos, double yPos) {
		super(xPos, yPos);
		// TODO Auto-generated constructor stub
	}

	public String getPotDescript() {
		return potDescript;
	}

	public int hashCode() {
		return 21;
	}

	
}
