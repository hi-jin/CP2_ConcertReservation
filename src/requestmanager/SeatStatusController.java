package requestmanager;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleGroup;
import reservationmanager.ReservationAssistantController;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class SeatStatusController implements Initializable {

	@FXML ToggleGroup choiceSeat;
	@FXML Button btnReserveStart;
	@FXML Button btnReserveEnd;
	@FXML Button btnRRM;
	@FXML Button btnReserve;
	
	private int controllerType;
	@FXML AnchorPane seatPane;
	public SeatStatusController() {
	}
	
	public SeatStatusController(int controllerType) {
		this.controllerType = controllerType;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		if (this.controllerType == 0) {
			btnReserve.setDisable(true);
		}
	}
	
	@FXML public void moveToRRM() {
		StackPane root = (StackPane) seatPane.getScene().getRoot();
		root.getChildren().remove(seatPane);
	}
	
	@FXML public void moveToCharge() {
		choiceSeat.getToggles().forEach(toggle -> {
			Node node = (Node) toggle.getToggleGroup().getSelectedToggle();
			node.setDisable(true);
		});
	}

}
