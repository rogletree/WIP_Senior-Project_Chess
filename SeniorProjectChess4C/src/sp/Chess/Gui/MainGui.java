package sp.Chess.Gui;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainGui extends Application{

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
        //set window title
		stage.setTitle("Chess");
        
//////////set up Main panes and buttons
        VBox vbox = new VBox(); 
        Button gameBtn = new Button();
        gameBtn.setText("Chess");
        
        Button settingBtn = new Button();
        settingBtn.setText("Settings");

        vbox.getChildren().add(gameBtn); 
        vbox.getChildren().add(settingBtn); 
        vbox.setAlignment(Pos.CENTER);
        
//////////set up Game Pane
        //anchor pane to hold every thing for the game
        AnchorPane aPane = new AnchorPane();
        //move list to hold record of move should be on the right side
        ListView movesList =new  ListView();
        
        //these are just for testing
        movesList.getItems().add("Test turn");
        movesList.getItems().add("Test turn");
        movesList.getItems().add("Test turn");
        movesList.getItems().add("Test turn");
        
        
        AnchorPane.setTopAnchor(movesList, 20.0);
        AnchorPane.setRightAnchor(movesList, 0.0);
        aPane.getChildren().add(movesList);
        //label for showing whose turn it is
        Label turn = new Label("Current Turn");
        AnchorPane.setTopAnchor(turn, 0.0);
        AnchorPane.setRightAnchor(turn, 0.0);
        aPane.getChildren().add(turn);
        //image of board
        Image boardImg = new Image("file:Assists/ChessBoardAttempt1.png");
        ImageView board = new ImageView(boardImg);
        AnchorPane.setTopAnchor(board, 0.0);
        AnchorPane.setLeftAnchor(board, 0.0);

        aPane.getChildren().add(board);

        
////////Set Scene     
        Scene scene =new Scene(vbox,200,200);
        
//////////Set events for buttons
       
        gameBtn.setOnAction(e->{
        	updateMenu(scene, aPane, stage);
            
        });
        
        //Set events for buttons
        settingBtn.setOnAction(e->{
        	
        });
        
        //set scene, stage, and show
        
        stage.setScene(scene);
        stage.show();

	}

	//Update Board when move is made.
	private void updateBoard() {
		
	}
	
	//Transitions from menu to another screen like game screen.
	private void updateMenu(Scene scene, AnchorPane aPane, Stage stage) {
    	scene.setRoot(aPane);
        stage.setMinHeight(500);
        stage.setMinWidth(700);
        
	}
}
