package managers;

import java.util.ArrayList;
import java.util.Timer;

import menu.GameMenu;
import menu.MainMenu;

import entity.*;

public class GameManager extends Thread{
	
	private Screen screen;
	private int gameTime;
	private int energy;
	private int spareParts;
	private int factoryHP;
	private int level;
	
	private BehaviourManager b;
	private SoundManager s;
	private InputManager i;
	private LevelManager l;
	
	private Timer timer;
	
	public GameManager(MainMenu frame){
		screen = new Screen(this);
		level = 1;
		
	}
	
	public void run(){
		
	}
	
	public void update(){
		
	}
	
	public void pause(){
		
	}
	
	public Screen getScreen(){
		return this.screen;
	}
	
	public ArrayList<Building> getTowers(int x) throws Exception{
		return screen.getTowers(x);
	}
	
	public ArrayList<Enemy> getEnemies(int x) {
		return new ArrayList<Enemy>();
	}

	public int getSpareParts() {
		return spareParts;
	}

	public void setSpareParts(int spareParts) {
		this.spareParts = spareParts;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getFactoryHP() {
		return factoryHP;
	}

	public void setFactoryHP(int factoryHP) {
		this.factoryHP = factoryHP;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}
}
