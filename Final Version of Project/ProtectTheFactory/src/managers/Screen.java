package managers;

import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import menu.GameMenu;
import menu.MainMenu;
import menu.PlayBar;
import entity.*;

public class Screen extends JPanel{
	
	private Grid grid;
	private JPanel gamePanel;
	private JPanel pausePanel;
	private String stats;
	private GameMenu gamemenu;
	private PlayBar playbar;
	private GameManager manager;
	private int selection;
	private Graphics graph;
	private MainMenu mm;
	
	public Screen(GameManager gm){
		super(new CardLayout());
		manager = gm;
		
		grid = new Grid(this);
		CardLayout layout = (CardLayout) super.getLayout();
		selection = 0;
		
		stats = "level " + gm.getLevel() + " || spare parts: " + gm.getSpareParts() + " || energy: " + gm.getEnergy();
		
		gamePanel = new JPanel(new GridLayout(3, 1));
		gamePanel.add(new JLabel(stats));
		this.gamemenu =new GameMenu(this);
		this.playbar = new PlayBar(this);
		
		graph = this.getGraphics();
		//gamemenu.setScreen(this);
		gamePanel.add(playbar);
		gamePanel.add(grid);
		pausePanel = new JPanel();
		this.add(gamePanel, "game");
		this.add(gamemenu, "pause");
		
		gamePanel.setVisible(true);
		gamemenu.setVisible(false);
		
		
		
	}
	
	public void draw(Graphics g){
		grid.draw(g);
	}
	
	public ArrayList<Building> getTowers(int i) throws Exception{
		return grid.getTowersOnLane(i);
	}
	public void setSelection(int x){
		selection = x;
	}
	
	public void pause(){
		gamePanel.setVisible(false);
		gamemenu.setVisible(true);
	}
	
	public void unPause(){
		gamePanel.setVisible(true);
		gamemenu.setVisible(false);
	}
	
	public void gridClick(int tileNo){
		if(selection < 4 && 0 !=selection )
			grid.buildBuilding(grid.getTile(tileNo - 1 ), new Tower(selection));
		else if(selection < 7)
			grid.buildBuilding(grid.getTile(tileNo - 1 ), new Workshop(selection -3 ));
		
		System.out.println("build building: " + selection + " on tile " + tileNo);
		
		
	}
	
	public void setMainMenu(MainMenu mm){
		this.mm = mm;
	}
	
	public void quit(){
		mm.returnMain();
	}
}
