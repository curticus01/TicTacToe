package edu.cis232;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Controller {
    @FXML
    private ImageView TL;

    @FXML
    private ImageView TM;

    @FXML
    private ImageView TR;

    @FXML
    private ImageView ML;

    @FXML
    private ImageView MM;

    @FXML
    private ImageView MR;

    @FXML
    private ImageView BL;

    @FXML
    private ImageView BM;

    @FXML
    private ImageView BR;

    @FXML
    private ImageView PlayerImg;

    @FXML
    private Label PlayerSelect;

    @FXML
    private Label output;

    Image X = new Image("http://static.saatchi.com/uploads/138737718027148/resize_then_crop_500_350.jpg");
    Image O = new Image("https://openclipart.org/image/2400px/svg_to_png/87463/Cyrillic-O.png");
    
    Game game = new Game();
    
    @FXML
    private Button reset;
    
    @FXML
    void makeMove(MouseEvent event) {
    	Object source = event.getSource();
    	if(source instanceof ImageView){
    		ImageView Image = (ImageView) source;
    		PlayerImg.setImage(currentImage());
    		//call game class makeMove
    		int row=0;
    		int col=0;
    		if(source==TL){
    			row = 0;
    			col = 0;
    		}
    		if(source==TM){
    			row = 0;
    			col = 1;
    		}
    		if(source==TR){
    			row = 0;
    			col = 2;
    		}
    		if(source==ML){
    			row = 1;
    			col = 0;
    		}
    		if(source==MM){
    			row = 1;
    			col = 1;
    		}
    		if(source==MR){
    			row = 1;
    			col = 2;
    		}
    		if(source==BL){
    			row = 2;
    			col = 0;
    		}
    		if(source==BM){
    			row = 2;
    			col = 1;
    		}
    		if(source==BR){
    			row = 2;
    			col = 2;
    		}
    		switch(game.makeMove(row, col)){
    		case InvalidMove:
    			output.setText("Invalid Move. Try Again.");
    			//Message
    			break;
    			
    		case PlayerWon:
    			output.setText(String.format("Player %s Won!", game.getCurrentPlayer()));
    			Image.setImage(currentImage());
    			break;
    		
    		case ValidMove:
    			Image.setImage(currentImage());
    			game.switchCurrentPlayer();
    			output.setText("");
    			break;
    			
    		case TieGame:
    			output.setText("Tie Game. Play Again.");
    			Image.setImage(currentImage());
    			break;
    		}
    	}
    	
    }
    public Image currentImage(){
		if(game.getCurrentPlayer()=="X"){
			return X;
		}
		else if(game.getCurrentPlayer()=="O"){
			return O;
		}
		return X;
	}
    @FXML
    void resetGame() {
    	game.reset();
    	TL.setImage(null);
    	TM.setImage(null);
    	TR.setImage(null);
    	ML.setImage(null);
    	MM.setImage(null);
    	MR.setImage(null);
    	BL.setImage(null);
    	BM.setImage(null);
    	BR.setImage(null);
    	output.setText("");
    	PlayerImg.setImage(null);
    }
}
