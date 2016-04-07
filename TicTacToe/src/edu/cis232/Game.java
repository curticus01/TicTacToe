package edu.cis232;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Game extends Application{
	
	public String player;
	public Board board = new Board();
	public static void main(String[] args) {
		launch(args);
	}
	public Game(){
		super();
		player = "X";
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
		if(board.checkValid(row, col)){
			board.setPlayer(player, row, col);
			if(board.checkWin()!=null){
				return MoveResult.PlayerWon;
			}
			if(board.isTie()==true){
				return MoveResult.TieGame;
			}
			return MoveResult.ValidMove;
		}
		return MoveResult.InvalidMove;
	}
	
	public String getCurrentPlayer(){
		return player;
	}
	public void switchCurrentPlayer(){
		if (player.equals("X")){
			player = "O";
		}
		else if (player.equals("O")){
			player = "X";
		}
	}
	public Board getBoard(){
		return board;
	}
	public void reset(){
		board.eraseBoard();
	}

}
