package managers;

import java.awt.Graphics;

import entity.Building;

public class Tile {

	private Building building;
	
	public Tile(){
		
	}
	public Tile(Building b){
		this.building = b;
	}
	
	public boolean isEmpty(){
		return this.building == null;
	}
	
	public boolean clear(){
		if(this.isEmpty()){
			return false;
		}else{
			this.building = null;
			return true;
		}
	}
	 public Building getBuilding(){
		 return this.building;
	 }
	 public boolean build(Building b){
		boolean res = !this.isEmpty();
		if(res){
			this.building = b;
		}
		return res;
	 }
	 
	 public void drawTile(Graphics g, int x, int y){
		 if(this.isEmpty()){
			 g.drawRect(x, y, 40, 40);
		 }else{
			 building.draw(g, x, y);
		 }
	 }
}
