package managers;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.JPanel;

import entity.Building;

public class Grid extends JPanel{

	private final static int WIDTH = 5;
	private final static int HEIGHT = 5;
	private final static int TILE_WIDTH = 45;
	
	private Tile[] tiles;
	private Screen screen;
	
	public Grid(Screen sc){
		super();
		screen = sc;
		super.setSize(new Dimension(WIDTH*TILE_WIDTH, HEIGHT*TILE_WIDTH));
		//this.getGraphics().drawRect(0, 0, WIDTH*TILE_WIDTH, HEIGHT*TILE_WIDTH);		
		tiles = new Tile[WIDTH*HEIGHT];
		for(int i = 0; i < WIDTH*HEIGHT; i++){
			tiles[i] = new Tile();
		}
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				screen.gridClick(e.getX()/TILE_WIDTH + WIDTH*(e.getY()/TILE_WIDTH));
				
			}
		});
	}
	
	public Tile getTile(int x){
		return tiles[x];
		//TODO
	}
	
	public ArrayList<Building> getTowersOnLane(int lane) throws Exception{
		if(lane < HEIGHT){
			Building b;
			ArrayList<Building> result = new ArrayList<Building>();
			
			for(int i = lane*WIDTH; i < (lane+1)*WIDTH; i++){
				b = tiles[i].getBuilding();
				if(b != null && true/**check if building is of type tower*/)//TODO
					result.add(b);
			}
			
			return result;
		}else{
			throw new Exception("lane index out of bounds");
		}
	}
	
	public boolean buildBuilding(Tile t, Building b){
		return t.build(b);
	}
	
	public boolean removeBuilding(Tile t){
		return t.clear();
	}
	
	public void draw(Graphics g){
		for(int i = 0; i < WIDTH*HEIGHT; i++){
			tiles[i].drawTile(g, (i%WIDTH)*TILE_WIDTH,((int)i/WIDTH)*TILE_WIDTH);
		}

	}
}
