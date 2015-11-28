package view;

import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;

public class AlertPane {

	public static boolean confirmation(String titleText, String headerText,
			String contentText, String okButtonText, String cancelButtonText) {

		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("     " + titleText);
		alert.setHeaderText(headerText);
		alert.setContentText(contentText);

		Button okButton = (Button) alert.getDialogPane().lookupButton(ButtonType.OK);
		okButton.setText(okButtonText);
		okButton.setDefaultButton(false);

		Button cancelButton = (Button) alert.getDialogPane()
				.lookupButton(ButtonType.CANCEL);
		cancelButton.setText(cancelButtonText);
		cancelButton.setDefaultButton(false);

		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK) {
			return true;
		} else {
			return false;
		}
	}

	public static void information(String titleText, String headerText,
			String contentText, String okButtonText) {

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("     " + titleText);
		alert.setHeaderText(headerText);
		alert.setContentText(contentText);

		Button okButton = (Button) alert.getDialogPane().lookupButton(ButtonType.OK);
		okButton.setDefaultButton(true);
		okButton.setText(okButtonText);

		alert.showAndWait();
	}

	public static String input(String titleText, String headerText, String contentText,
			String okButtonText) {

		TextInputDialog dialog = new TextInputDialog("");
		dialog.setTitle(titleText);
		dialog.setHeaderText(headerText);
		dialog.setContentText(contentText);

		Button okButton = (Button) dialog.getDialogPane().lookupButton(ButtonType.OK);
		okButton.setDefaultButton(true);
		okButton.setText(okButtonText);

		// Traditional way to get the response value.
		Optional<String> result = dialog.showAndWait();

		try {
			String input = result.get();
			return input;
		}
		// cancel a bas�l�rsa
		catch (Exception e) {
			return null;
		}
	}
}
