package edu.cis232;

import javafx.fxml.FXML;
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
    void makeMove(MouseEvent event) {
    	Object source = event.getSource();
    	if(source instanceof ImageView){
    		ImageView Image = (ImageView) source;
    		//call game class makeMove
    		int row=0;
    		int col=0;
    		if(source==TL){
    			row = 0;
    			col = 0;
    		}
    		game.makeMove(row, col);
    		Image.setImage(O);
    	}
    }
}
