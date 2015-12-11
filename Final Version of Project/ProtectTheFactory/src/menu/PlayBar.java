package menu;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.AbstractAction;

import managers.*;


public class PlayBar extends JPanel{
	private Screen screen;
	private GridLayout layout;
	
	public PlayBar(Screen sc){
		super();
		this.setSize(650, 40);
		layout = new GridLayout(2, 4);
		this.setLayout(layout);
		this.screen = sc;
		
		this.add(new JButton(new AbstractAction("tower 1"){
			public void actionPerformed(ActionEvent e){
				screen.setSelection(1);
			}
		}));
		
		this.add(new JButton(new AbstractAction("tower 2"){
			public void actionPerformed(ActionEvent e){
				screen.setSelection(2);
			}
		}));
		
		this.add(new JButton(new AbstractAction("tower 3"){
			public void actionPerformed(ActionEvent e){
				screen.setSelection(3);
			}
		}));
			this.add(new JButton(new AbstractAction("pause"){
			public void actionPerformed(ActionEvent e){
				screen.pause();
			}
		}));
		this.add(new JButton(new AbstractAction("Workshop 1"){
			public void actionPerformed(ActionEvent e){
				screen.setSelection(4);
			}
		}));
		
		this.add(new JButton(new AbstractAction("workshop 2"){
			public void actionPerformed(ActionEvent e){
				screen.setSelection(5);
			}
		}));
		
		this.add(new JButton(new AbstractAction("workshop 3"){
			public void actionPerformed(ActionEvent e){
				screen.setSelection(6);
			}
		}));
		
	
	}
	
}
