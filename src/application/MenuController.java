package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import entities.Bot;
import entities.Card;
import entities.Deck;
import entities.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.fxml.FXML;
import javafx.scene.layout.HBox;

import javafx.scene.image.ImageView;


public class MenuController implements Initializable {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_MAGENTA = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLACK = "\u001B[30m";
	
	@FXML
	private Button exitButton;
	
	@FXML
	private AnchorPane scenePane;
	
    @FXML
    private ImageView imageView;
	
    @FXML
    private HBox imagesHBox;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchToMenu(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void switchToTruco(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Truco.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void switchToRegras(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Regras.fxml"));
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
	
	public void jogadorUm(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("JogoUm.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
		Deck deck = new Deck();
		deck.shuffle();
		
		Player jogador1 = new Player(deck, "Jogador 1");
		Bot bot1 = new Bot(deck, "Bot 1");
		Bot bot2 = new Bot(deck, "Bot 2");
		Bot bot3 = new Bot(deck, "Bot 3");

		System.out.println(ANSI_GREEN + "\n\tTime 1:" + ANSI_RESET + "\n\tJogador 1\n\tBot 2" + ANSI_RED
				+ "\n\n\tTime 2:" + ANSI_RESET + "\n\tBot 1\n\tBot 3");
		
		
	}
	
	
	public void jogadorDois(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("JogoDois.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
		Deck deck = new Deck();
		deck.shuffle();
		
		Player jogador1 = new Player(deck, "Jogador 1");
		Bot bot1 = new Bot(deck, "Bot 1");
		Player jogador2 = new Player(deck, "Jogador 2");
		Bot bot2 = new Bot(deck, "Bot 2");

		System.out.println(ANSI_GREEN + "\n\tTime 1:" + ANSI_RESET + "\n\tJogador 1\n\tJogador 2" + ANSI_RED
				+ "\n\n\tTime 2:" + ANSI_RESET + "\n\tBot 1\n\tBot 2");

		
	}
	
	
	public void JogarUm(ActionEvent event) {
		
		
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Card card = new Card("Paus","Dois");
		imageView.setImage(card.getImage());
	}
	

		
		
		
	
	

	

}
