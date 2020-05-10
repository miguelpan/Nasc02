package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
/*
*Classe básica .
	*Um a aplicação javaFX tem que ser uma classe que extend Application.
	*Essa classe prossui um método abstrado que é o start (Metodo que é obrigado ser implementado.
	*Essa classe possui outros métodos, como o inti e o stop
	 */

public class Main extends Application {

	private static Scene mainScene;

	@Override
	public void start(Stage primaryStage) {
		try {
			/*primaryStage é o palco.
			 *mainScene é a cena.
			 */
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));//Linha responsável por pegar o arquivoFXML referente a cena.
			ScrollPane scrollPane = loader.load();
			scrollPane.setFitToHeight(true);
			scrollPane.setFitToWidth(true);
			
			mainScene = new Scene(scrollPane);
			primaryStage.setScene(mainScene);// Aqui é colocado a cena dentro do palco principal
			primaryStage.setTitle("Projeto JDBC/FX");
			primaryStage.show();//Mostra na tela o conteúdo do palco(primaryStage).
			primaryStage.setResizable(false);// faz com que a janela fique sem poder ser redimensionada.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Scene getMainScene() {
		return mainScene;
	}
	/*
	 * Onde começa a aplicação
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
