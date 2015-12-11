package managers;

public class LevelManager {
	private int levelNumber;
	
	private static LevelManager instance = new LevelManager();
	
	private LevelManager(){
		this.levelNumber = 0;
	}
	
	public static LevelManager getInstance(){
		return instance;
	}
	
	public int getLevel(){
		return this.levelNumber;
	}
	
	public void setLevel(int newLevel){
		this.levelNumber = newLevel;
	}
	
	public void getEnemies(){
		
	}
}
