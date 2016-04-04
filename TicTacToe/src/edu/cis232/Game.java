package edu.cis232;

import javafx.application.Application;
import javafx.stage.Stage;

public class Game extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public MoveResult makeMove(int row,int col){
		return MoveResult.InvalidMove;
	}

}
