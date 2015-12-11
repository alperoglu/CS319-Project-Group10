package managers;

public class InputManager {
	
	private static InputManager instance = new InputManager();
	
	public void notifyInput(){
		
	}
	
	public static InputManager getInstance(){
		return instance;
	}
}