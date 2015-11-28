/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;

import controller.PlayGameMenuController;
import view.PlayGameMenuView;

/**
 *
 * @author AhmetAy
 */
public class EntranceController {

	private EntranceView entranceView;

	EntranceController(EntranceView entranceView) {
		this.entranceView = entranceView;

		entranceView.getPlayGameButton().setOnAction(e -> {
			PlayGameMenuView playGameMenuView = new PlayGameMenuView();
			PlayGameMenuController playGameMenuController = new PlayGameMenuController(playGameMenuView);
			MainClass.changeSceneRoot(playGameMenuView);
		});

		entranceView.getCreditsButton().setOnAction(e -> {

		});

		entranceView.getHelpButton().setOnAction(e -> {

		});
	}

}
