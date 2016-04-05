package edu.cis232;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Game extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		Parent parent = FXMLLoader.load(Game.class.getResource("ttt.fxml"));
		
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		
		stage.setTitle("Tic, Tac, Toe!");		
		stage.show();		
	}
	
	public MoveResult makeMove(int row,int col){
		
		return MoveResult.InvalidMove;
	}

}
