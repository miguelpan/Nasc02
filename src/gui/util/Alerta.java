package gui.util;

import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

/*
 * Classe utilitaria.
 */
public class Alerta {

	public static void showAlert(String title, String header, String content, AlertType type) {
		Alert alert = new Alert(type);// Instanciando o Alert
		alert.setTitle(title);// Titulo
		alert.setHeaderText(header);// Cabe�alho
		alert.setContentText(content);// Conteudo
		alert.show();// Mostrar alert
	}

	public static Optional<ButtonType> showConfirmation(String title, String content) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle(title);
		alert.setHeaderText(null);
		alert.setContentText(content);
		return alert.showAndWait();
	}
}