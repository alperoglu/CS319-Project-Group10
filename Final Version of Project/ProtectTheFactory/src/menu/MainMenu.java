package menu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;

import managers.GameManager;
import managers.Screen;



public class MainMenu extends JFrame{
	
	private static final int MENU_WIDTH = 700;
	private static final int MENU_HEIGHT = 400;
	
	private static MainMenu instance = new MainMenu();
	
	private JPanel entrancePanel, codePanel, selectLevelPanel, creditsPanel;
	private JButton startNew, credits, enterCode, selectLevel, level1, level2, level3;
	private JButton goBack;
	private JTextField codeField;
	private GameManager manager;
	private Screen screen;
	
	private MainMenu(){
		super("Protect the Factory");
		this.setLayout(new CardLayout());
		
		manager = new GameManager(this);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(MENU_WIDTH, MENU_HEIGHT);
		this.setVisible(true);
		this.setResizable(false);
		
		this.entrancePanel = new JPanel(new GridLayout(4, 1));
		this.entrancePanel.add(new JLabel("Welcome to Protect The Factory") );
		this.startNew = new JButton(new AbstractAction("Start new game"){
			@Override
			public void actionPerformed(ActionEvent e){
				manager.setLevel(1);
				creditsPanel.setVisible(false);
				selectLevelPanel.setVisible(false);
				codePanel.setVisible(false);
				entrancePanel.setVisible(false);
				screen.setVisible(true);
				
			}
		});
		this.credits = new JButton(new AbstractAction("Credits"){
			@Override
			public void actionPerformed(ActionEvent e){
				selectLevelPanel.setVisible(false);
				codePanel.setVisible(false);
				entrancePanel.setVisible(false);
				creditsPanel.setVisible(true);
			}
		});
		this.selectLevel = new JButton(new AbstractAction("Select a Level"){
			@Override
			public void actionPerformed(ActionEvent e){
				selectLevelPanel.setVisible(false);
				entrancePanel.setVisible(false);
				creditsPanel.setVisible(false);
				codePanel.setVisible(true);
			}
		});
		this.entrancePanel.add(startNew);
		this.entrancePanel.add(selectLevel);
		this.entrancePanel.add(credits);
		this.add(entrancePanel, "entrance");
		
		
		this.codePanel = new JPanel(new GridLayout(4,1));
		this.codePanel.add(new JLabel("Please enter your code"));
		this.codeField = new JTextField("enter your code here");
		this.codePanel.add(codeField);
		this.enterCode = new JButton(new AbstractAction("Enter"){
			@Override
			public void actionPerformed(ActionEvent e){
				
				entrancePanel.setVisible(false);
				creditsPanel.setVisible(false);
				codePanel.setVisible(false);
				selectLevelPanel.setVisible(true);
			}
		});
		this.codePanel.add(enterCode);
		this.goBack = new JButton(new AbstractAction("Back"){
			@Override
			public void actionPerformed(ActionEvent e){
				creditsPanel.setVisible(false);
				selectLevelPanel.setVisible(false);
				codePanel.setVisible(false);
				entrancePanel.setVisible(true);
			}
		});
		this.codePanel.add(goBack);
		this.add(codePanel, "code");
		
		this.selectLevelPanel = new JPanel(new GridLayout(5, 1));
		this.selectLevelPanel.add(new JLabel("Please select a level"));
		this.level1 = new JButton(new AbstractAction("Level I"){
			@Override
			public void actionPerformed(ActionEvent e){
				creditsPanel.setVisible(false);
				selectLevelPanel.setVisible(false);
				codePanel.setVisible(false);
				entrancePanel.setVisible(false);
				screen.setVisible(true);
			}
		});
		this.level2 = new JButton("Level II");
		this.level3 = new JButton("Level III");
		this.selectLevelPanel.add(level1);
		this.selectLevelPanel.add(level2);
		this.selectLevelPanel.add(level3);
		this.selectLevelPanel.add(goBack);
		this.add(selectLevelPanel);
		
		this.creditsPanel = new JPanel(new GridLayout(6, 1));
		this.creditsPanel.add(new JLabel("CREDITS:"));
		this.creditsPanel.add(new JLabel("\t\tAlper Eroðluy"));
		this.creditsPanel.add(new JLabel("\t\tTolga Ýlikli"));
		this.creditsPanel.add(new JLabel("\t\tKaan Yorgancýoðlu"));
		this.creditsPanel.add(new JLabel("\t\tAhmet Ay"));
		this.creditsPanel.add(goBack);
		this.add(creditsPanel, "credits");
		
		creditsPanel.setVisible(false);
		selectLevelPanel.setVisible(false);
		codePanel.setVisible(false);
		entrancePanel.setVisible(true);
		this.screen = manager.getScreen();
		screen.setMainMenu(this);
		this.add(screen);
		screen.setVisible(false);
	}
	
	public static MainMenu getInstance(){
		return instance;
	}
	
	public void returnMain(){
		creditsPanel.setVisible(false);
		selectLevelPanel.setVisible(false);
		codePanel.setVisible(false);
		screen.setVisible(false);
		entrancePanel.setVisible(true);
	}
}
