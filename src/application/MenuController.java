package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.fxml.FXML;

public class MenuController {
	
	@FXML
	private Button exitButton;
	
	@FXML
	private AnchorPane scenePane;
	
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchToMenu(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void switchToTruco(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Truco.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void switchToRegras(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Regras.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
		
	}
	
	public void exit(ActionEvent Event) {
		
		stage = (Stage) scenePane.getScene().getWindow();
		System.out.println("Saiu!");
		stage.close();
		
		
	}
	
	

}
