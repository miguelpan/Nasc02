package gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entidades.Funcao;
import model.services.FuncaoService;

public class FuncaoListaController implements Initializable {

	/*
	 * Dependencia da classe FuncaoService.
	 */
	private FuncaoService service;
	/*
	 * Referencia aos itens da tela FuncaoLista.
	 */
	@FXML
	private TableView<Funcao> tableviewFuncao;

	@FXML
	private TableColumn<Funcao, Integer> tableColumnId;// A primeira corresponde ao tipo da entidade e o segundo ao tipo
														// da coluna.

	@FXML
	private TableColumn<Funcao, String> tableColumnNome;// A primeira corresponde ao tipo da entidade e o segundo ao
														// tipo da coluna.

	@FXML
	private TableColumn<Funcao, Funcao> tableColumnEDITA;// A primeira corresponde ao tipo da entidade e o segundo ao
															// tipo da coluna.

	@FXML
	private TableColumn<Funcao, Funcao> tableColumnAPABAR;// A primeira corresponde ao tipo da entidade e o segundo ao
															// tipo da coluna.

	@FXML
	private Button btNovo;
	
	/*
	 * As funções serão carregadas na ObservableList
	 * e	 depois será passada para o tableviewFuncao.
	 */
	private ObservableList<Funcao> obsLista;

	@FXML
	private void onBtNovoAction() {
		System.out.println("teste");
	}

	/**
	 * Injetando a dependencia na classe.
	 * @param service
	 */
	public void setFuncaoService(FuncaoService service) {
		this.service = service;
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
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));// Padrão do javaFX para iniciar o
																			// comportamento da coluna.
		tableColumnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));// Padrão do javaFX para iniciar o
																				// comportamento da coluna.

		/**
		 * faz com que o tableview acompanhe o tamanho da vbox(se estique conforme ela
		 * estique)
		 */
		Stage stage = (Stage) Main.getMainScene().getWindow();// Referencia a sena
		tableviewFuncao.prefHeightProperty().bind(stage.heightProperty());// Comando para que o tableviewDepartment
																				// acompanhe o tamanho da janela.
	}

	/*
	 * Metodo responsavel por acessar o serviço e carregar as funcoes e jogar 
	 * elas no ObservableList.
	 */
	public void atualizarTableView() {
		if (service == null) {
			throw new IllegalStateException("serviço esta nulo");
		}
		List<Funcao> list = service.findAll();// Declara uma lista de funcao chamada 'list' recebendo o findALL
													// do FuncaoService
		obsLista = FXCollections.observableArrayList(list);// Instancia o obsList com o list
		tableviewFuncao.setItems(obsLista);// Passando o obsList para o tableviewDepartment

	}
}
