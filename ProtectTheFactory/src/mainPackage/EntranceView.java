/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;

import java.io.File;

import javafx.animation.Timeline;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 *
 * @author AhmetAy
 */
public class EntranceView extends Pane {

 
	private Button playGameButton;
    private Button creditsButton;
    private Button helpButton;

   private ImageView backgrounImage;

    public EntranceView() {

        playGameButton = new Button("    Play Game  ");
        playGameButton.getStyleClass().add("gameKinds");
        playGameButton.setLayoutX(300);
        playGameButton.setLayoutY(120);

        creditsButton = new Button("      Credits      ");
        creditsButton.getStyleClass().add("gameKinds");
        creditsButton.setLayoutX(300);
        creditsButton.setLayoutY(250);

        helpButton = new Button("         Help         ");
        helpButton.getStyleClass().add("gameKinds");
        helpButton.setLayoutX(300);
        helpButton.setLayoutY(380);


//        backgrounImage = new ImageView(new Image("background.jpeg"));
        
        
        getChildren().addAll( playGameButton, creditsButton, helpButton);
    }
    
    public Button getPlayGameButton() {
 		return playGameButton;
 	}

 	public void setPlayGameButton(Button playGameButton) {
 		this.playGameButton = playGameButton;
 	}

 	public Button getCreditsButton() {
 		return creditsButton;
 	}

 	public void setCreditsButton(Button creditsButton) {
 		this.creditsButton = creditsButton;
 	}

 	public Button getHelpButton() {
 		return helpButton;
 	}

 	public void setHelpButton(Button helpButton) {
 		this.helpButton = helpButton;
 	}

 	public ImageView getBackgrounImage() {
 		return backgrounImage;
 	}

 	public void setBackgrounImage(ImageView backgrounImage) {
 		this.backgrounImage = backgrounImage;
 	}


}
