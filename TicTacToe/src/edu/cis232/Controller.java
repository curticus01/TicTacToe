package edu.cis232;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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

    Image X = new Image("X.jpg");
    
    @FXML
    void makeMove(ActionEvent event) {
    	Object source = event.getSource();
    	if(source instanceof ImageView){
    		ImageView Image = (ImageView) source;
    		Image.setImage(X);
    	}
    }
}
