package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

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
		System.out.println("Funcao");
	}
	@FXML
	public void onMenuItemClientesAction() {
		System.out.println("Clientes");
	}
	@FXML
	public void onMenuItemSobreAction() {
		System.out.println("Sobre");
	}
	
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}

}
