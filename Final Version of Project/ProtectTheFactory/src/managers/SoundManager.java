package managers;

public class SoundManager {
	
	private static SoundManager instance = new SoundManager();
	
	private SoundManager(){
		
	}
	
	public void setSound(int soundLevel){
		
	}
	
	public static SoundManager getInstance(){
		return instance;
	}
}