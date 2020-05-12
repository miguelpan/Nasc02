package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entidades.Funcao;

public class FuncaoListaController implements Initializable {

	/*
	 * Referencia aos itens da tela FuncaoLista.
	 */
	@FXML
	private TableView<Funcao> tableviewDepartment;

	@FXML
	private TableColumn<Funcao, Integer> tableColumnId;// A primeira corresponde ao tipo da entidade e o segundo ao tipo da coluna.

	@FXML
	private TableColumn<Funcao, String> tableColumnNome;// A primeira corresponde ao tipo da entidade e o segundo ao tipo da coluna.

	@FXML
	private TableColumn<Funcao, Funcao> tableColumnEDITA;// A primeira corresponde ao tipo da entidade e o segundo ao tipo da coluna.

	@FXML
	private TableColumn<Funcao, Funcao> tableColumnAPABAR;// A primeira corresponde ao tipo da entidade e o segundo ao tipo da coluna.
	
	@FXML
	private Button btNovo;

	@FXML
	private void onBtNovoAction() {
		System.out.println("teste");
	}
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();// Metodo auxiliar pra iniciar um componente na tela
	}

	/**
	 * Comportamento das colunas na tabela
	 */
	private void initializeNodes() {
		/*
		 * Padrão o javaFX pra iniciar o comportamento das colunas
		 */
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));// Padrão do javaFX para iniciar o comportamento da coluna.
		tableColumnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));// Padrão do javaFX para iniciar o comportamento da coluna.	

		/**
		 * faz com que o tableview acompanhe o tamanho da vbox(se estique conforme ela
		 * estique)
		 */
		Stage stage = (Stage) Main.getMainScene().getWindow();// Referencia a sena
		tableviewDepartment.prefHeightProperty().bind(stage.heightProperty());// Comando para que o tableviewDepartment acompanhe o tamanho da janela.
	}
}
