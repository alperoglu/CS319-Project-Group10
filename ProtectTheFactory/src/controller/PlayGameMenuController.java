package controller;

import view.AlertPane;
import view.PlayGameMenuView;

public class PlayGameMenuController {

	private PlayGameMenuView playGameMenuView;
	
	public PlayGameMenuController(PlayGameMenuView playGameMenuView) {
		this.playGameMenuView = playGameMenuView;
		
		playGameMenuView.getStartGameButton().setOnAction(e -> {
			
		});
		
		playGameMenuView.getChooseLevelButton().setOnAction(e -> {
			String code = AlertPane.input("Enter the code", null, "Please enter the code  ", "Confirm");
		});
	}
}
