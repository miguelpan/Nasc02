package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerta;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable {
	/*
	 * Itens de controle de tela correspondentes aos itens da MainView.fxml.
	 */
	@FXML
	private MenuItem menuItemProduto;
	@FXML
	private MenuItem menuItemFuncionario;
	@FXML
	private MenuItem menuItemFuncao;
	@FXML
	private MenuItem menuItemClientes;
	@FXML
	private MenuItem menuItemSobre;
	/*
	 * Metodos para tratar os itens de menu/ Tratamento dos itens acima.
	 */
	@FXML
	public void onMenuItemProdutoAction() {
		System.out.println("Produto");
	}
	@FXML
	public void onMenuItemFuncionarioAction() {
		System.out.println("Funcionario");
	}
	@FXML
	public void onMenuItemFuncaoAction() {
		loadView("/gui/FuncaoLista.fxml");
	}
	@FXML
	public void onMenuItemClientesAction() {
		System.out.println("Clientes");
	}
	@FXML
	public void onMenuItemSobreAction() {
		loadView("/gui/Sobre.fxml");
	}
	
	/**
	 * Fun��o para abrir tela.
	 * Essa fun��o serve pra pegar o VBox da janela que foi passada como parametro e substituir na mainView principal.
	 * @param nomeDaView, responsavel por pegar a view que foi passada.
	 */
	private synchronized void loadView(String nomeDaView) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(nomeDaView));// Instanciando o FXMLLOADER para caregar a tela que foi passada como parametro.
			VBox newBox = loader.load();// Instanciando um obj do tipo VBox recebendo o conteudo do VBox da view que foi passada.
			
			Scene cenaPrincipal = Main.getMainScene();// Pegando referencia da cena principal.
			/*
			 * Criando uma variavel do tipo VBox e chamando ela de principalVbox, variavel essa referente ao VBoxda janela principal.
			 * 
			 */
			VBox principalVbox = (VBox) ((ScrollPane) cenaPrincipal.getRoot()).getContent();//Pegando referencia do VBox da janela principal.(aula206).
			
			Node menuPrincipal = principalVbox.getChildren().get(0);// Pegando o menu da janela principal e salvando na variavel, menuPrincipal.
			principalVbox.getChildren().clear();//Apagando o conteudo do children do MainView.fxml(janela principal).
			principalVbox.getChildren().add(menuPrincipal);//Passando o menuPrincipal para a janela principal.
			principalVbox.getChildren().addAll(newBox.getChildren());// Passando o conteudo do newBox para a janela principal.
			
		}catch (IOException e) {
			Alerta.showAlert("IO Exception", "Erro ao carregar a view 'Sobre'", e.getMessage(), AlertType.ERROR);//Mostrando um alerta caso ocorra error.	
		}
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}

}
