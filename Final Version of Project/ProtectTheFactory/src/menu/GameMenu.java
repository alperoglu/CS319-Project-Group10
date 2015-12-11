package menu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractAction;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;

import managers.Screen;

public class GameMenu extends JPanel{
	
	private JButton resumeGame, restartGame, quitGame;
	private Screen screen;
	
	public GameMenu(Screen sc){
		super();
		setScreen(sc);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		resumeGame = new JButton(new AbstractAction("RESUME"){
			public void actionPerformed(ActionEvent e){
				sc.unPause();
			}

		});
		restartGame = new JButton("RESTART");
		quitGame = new JButton(new AbstractAction("QUIT"){
			public void actionPerformed(ActionEvent e){
				sc.quit();
			}

		});
		
		resumeGame.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		restartGame.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		quitGame.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		
		resumeGame.setMaximumSize(new Dimension(Integer.MAX_VALUE, resumeGame.getMinimumSize().height));
		restartGame.setMaximumSize(new Dimension(Integer.MAX_VALUE, restartGame.getMinimumSize().height));
		quitGame.setMaximumSize(new Dimension(Integer.MAX_VALUE, quitGame.getMinimumSize().height));
		
		Dimension minSize = new Dimension(5, 5);
		Dimension prefSize = new Dimension(5, 5);
		Dimension maxSize = new Dimension(Short.MAX_VALUE, 5);
		
		this.add(new Box.Filler(minSize, prefSize, maxSize));
		this.add(new Box.Filler(minSize, prefSize, maxSize));
		this.add(new Box.Filler(minSize, prefSize, maxSize));
		this.add(new Box.Filler(minSize, prefSize, maxSize));
		this.add(resumeGame);
		this.add(new Box.Filler(minSize, prefSize, maxSize));
		this.add(restartGame);
		this.add(new Box.Filler(minSize, prefSize, maxSize));
		this.add(quitGame);
		
	}
	public void setScreen(Screen s){
		screen = s;
	}
	
}