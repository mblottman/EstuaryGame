package StJonesEstuary;

import games.AnimalGame;
import games.RecycleGame;
import games.SeedlingGame;

public class StJonesMain {
	
	SeedlingGame sGame;
	RecycleGame rGame;
	AnimalGame aGame;
	
	/**
	 * If allDone is true, this means that all three games have been completed
	 */
	private boolean allDone = false;
	private boolean newGameClicked = false;
	private boolean endGameClicked = false;
	private boolean dispScrapbook = false;
	private boolean recycleGameClicked = false;
	private boolean animalGameClicked = false;
	private boolean seedlingGameClicked = false;
	
	
	public boolean isAllDone() {
		return allDone;
	}
	
	public void setAllDone(boolean allDone) {
		this.allDone = allDone;
	}
	
	public boolean isNewGameClicked() {
		return newGameClicked;
	}
	
	public void setNewGameClicked(boolean newGameClicked) {
		this.newGameClicked = newGameClicked;
	}
	
	public boolean isEndGameClicked() {
		return endGameClicked;
	}
	
	public void setEndGameClicked(boolean endGameClicked) {
		this.endGameClicked = endGameClicked;
	}
	
	public boolean isDispScrapbook() {
		return dispScrapbook;
	}

	public void setDispScrapbook(boolean dispScrapbook) {
		this.dispScrapbook = dispScrapbook;
	}

	public boolean isRecycleGameClicked() {
		return recycleGameClicked;
	}

	public void setRecycleGameClicked(boolean recycleGameClicked) {
		this.recycleGameClicked = recycleGameClicked;
	}

	public boolean isAnimalGameClicked() {
		return animalGameClicked;
	}

	public void setAnimalGameClicked(boolean animalGameClicked) {
		this.animalGameClicked = animalGameClicked;
	}

	public boolean isSeedlingGameClicked() {
		return seedlingGameClicked;
	}

	public void setSeedlingGameClicked(boolean seedlingGameClicked) {
		this.seedlingGameClicked = seedlingGameClicked;
	}
	
	
	
	


}
