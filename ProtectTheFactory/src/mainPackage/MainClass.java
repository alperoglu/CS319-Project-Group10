package mainPackage;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainClass extends Application {

	private  EntranceView entranceView;
	private  EntranceController entranceController;

	private static Stage primaryStage;
	private static Scene scene;
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		
		entranceView = new EntranceView();
		entranceController = new EntranceController(entranceView);

		scene = new Scene(entranceView, 960, 540);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Protect the Factory");
		primaryStage.setResizable(false);
		primaryStage.centerOnScreen();
		primaryStage.show();

		
		
		// CSS Connection
		scene.getStylesheets().add(getClass().getResource("main.css").toExternalForm());
	}
	
	public static void changeSceneRoot(Parent parent){
		scene.setRoot(parent);
		primaryStage.setScene(scene);
	}

}