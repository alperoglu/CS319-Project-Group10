package managers;
import java.util.ArrayList;

import entity.*;

public class BehaviourManager {
	
	private static BehaviourManager instance = new BehaviourManager(); 
	private GameManager gamemanager;
	private int laneNumber;
	
	
	private BehaviourManager(){
		
		
	}
	public void setGameManager(GameManager manager){
		gamemanager = manager;
	}
	
	public boolean checkLaneAggro(int lane) throws Exception{
		
		ArrayList<Enemy> enemies = gamemanager.getEnemies(lane);
		ArrayList<Building> towers = gamemanager.getTowers(lane);
		
		if((towers.size() > 0) && (enemies.size() > 0))
			return true;
		return false;
	}
	
	public void updateHitPoints(){
		
	}
	
	public void handleAttacks()throws Exception{
		
		ArrayList<Enemy> e1 = gamemanager.getEnemies(0);
		ArrayList<Building> t1 = gamemanager.getTowers(0);
		ArrayList<Enemy> e2 = gamemanager.getEnemies(1);
		ArrayList<Building> t2 = gamemanager.getTowers(1);
		ArrayList<Enemy> e3 = gamemanager.getEnemies(2);
		ArrayList<Building> t3 = gamemanager.getTowers(2);
		ArrayList<Enemy> e4 = gamemanager.getEnemies(3);
		ArrayList<Building> t4 = gamemanager.getTowers(3);
		ArrayList<Enemy> e5 = gamemanager.getEnemies(4);
		ArrayList<Building> t5 = gamemanager.getTowers(4);
		
		while(checkLaneAggro(0) || checkLaneAggro(1) || checkLaneAggro(2) || checkLaneAggro(3) || checkLaneAggro(4)){/*
			if(checkLaneAggro(0)){
				if(e1.get(0).getHealthP()> 0)
					e1.get(0).setHealthP(e1.get(0).getHealthP()-t1.get(t1.size()-1));
				else 
					e1.remove(0);
			}
			if(checkLaneAggro(1)){
				if(e2.get(0).getHealthP() > 0)
					e2.get(0).setHealthP(e2.get(0).getHealthP()-t2.get(t2.size()-1));
				else 
					e2.remove(0);
			}
			if(checkLaneAggro(2)){
				if(e3.get(0).getHealthP() > 0)
					e3.get(0).setHealthP(e3.get(0).getHealthP()-t3.get(t3.size()-1));
				else 
					e3.remove(0);
			}
			if(checkLaneAggro(3)){
				if(e4.get(0).getHealthP() > 0)
					e4.get(0).setHealthP(e4.get(0).getHealthP()-t4.get(t4.size()-1));
				else 
					e4.remove(0);
			}
			if(checkLaneAggro(4)){
				if(e5.get(0).getHealthP() > 0)
					e5.get(0).setHealthP(e5.get(0).getHealthP()-t5.get(t5.size()-1));
				else
					e5.remove(0);
			}**/
		}
		
	}
	
	public static BehaviourManager getInstance(){
		return instance;
	}
}
