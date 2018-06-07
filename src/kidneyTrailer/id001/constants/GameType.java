package kidneyTrailer.id001.constants;

public enum GameType {
	TwoD(2), ThreeD(3);
	
	int id;
	
	GameType(int id) {
		this.id = id;
	}
	
	public int getID() {
		return id;
	}
}
