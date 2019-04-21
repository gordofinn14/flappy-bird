package application;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class gameController extends Application{
	Stage gameStage;
	Group root;
	int StageX;
	int StageY;
	
	public gameController() {
		gameStage = new Stage();
		root = new Group();
		StageX = 600;
		StageY = 500;
	}
		
	@Override
	public void start(Stage stage) {
		gameStage.setTitle("Flappy Bird");
		Button startButton = new Button();
		startButton.setText("Play");
		startButton.setLayoutX(StageX/2-10);
		startButton.setLayoutY(StageY/2);
		startButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent event) {
				System.out.println("Transitioning to game play mode...");
				// playGame game = new playGame(StageX, StageY, gameStage);
				// gameStage.setScene(game.gamePlay());
			}
		});
		Label welcomeText = new Label();
		welcomeText.setText("Welcome to Flappy Bird!");
		Font Arial = new Font("Arial", 30);
		welcomeText.setFont(Arial);
		welcomeText.setTextFill(Color.PALEGOLDENROD);
		welcomeText.setLayoutX(StageX/5);
		welcomeText.setLayoutY(20);
		Group startScreen = new Group();
		startScreen.getChildren().addAll(welcomeText,startButton);
		Scene startScreenScene = new Scene(startScreen, StageX, StageY, Color.ALICEBLUE);
		gameStage.setScene(startScreenScene);
		gameStage.show();
	}

	
	public static void main(String[] args) {
		launch();
	}
	

}
