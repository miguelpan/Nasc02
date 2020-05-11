package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
/*
*Classe b�sica .
	*Um a aplica��o javaFX tem que ser uma classe que extend Application.
	*Essa classe prossui um m�todo abstrado que � o start (Metodo que � obrigado ser implementado.
	*Essa classe possui outros m�todos, como o inti e o stop
	 */

public class Main extends Application {

	/*
	 * Atributo para guardar a referencia da cena principal.
	 */
	private static Scene cenaPrincipal;

	@Override
	public void start(Stage primaryStage) {
		try {
			/*primaryStage � o palco.
			 *cenaPrincipal � a cena.
			 */
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));//Linha respons�vel por pegar o arquivoFXML referente a cena.
			ScrollPane scrollPane = loader.load();
			scrollPane.setFitToHeight(true);//Linha de codigo que permite que o scrollPane acompanhe o tamanho da janela.
			scrollPane.setFitToWidth(true);//Linha de codigo que permite que o scrollPane acompanhe o tamanho da janela.
			
			cenaPrincipal = new Scene(scrollPane);// Referenciando o atributo.
			primaryStage.setScene(cenaPrincipal);// Aqui � colocado a cena dentro do palco principal.
			primaryStage.setTitle("Projeto JDBC/FX");
			primaryStage.show();//Mostra na tela o conte�do do palco(primaryStage).
			primaryStage.setResizable(false);// faz com que a janela fique sem poder ser redimensionada.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Metodo para pegar o cenaPrincipal.
	 * @return cenaPrincipal.
	 */
	public static Scene getMainScene() {
		return cenaPrincipal;
	}
	/*
	 * Onde come�a a aplica��o.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
