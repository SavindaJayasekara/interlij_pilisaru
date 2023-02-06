package lk.ijse.homewindow.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class MenuWindowController {
    public AnchorPane mainAncorPane;
    public Button btnHome;
    public Button btnPile;
    public Button btnHealth;
    public Button btnSalary;
    public Button btnVehicle;
    public Button btnSales;
    public Button btnEmployee;
    public Button btnCompost;
    public Button btnInventory;
    public AnchorPane employeeAncorPane;
    public AnchorPane salseAncorPane;
    public AnchorPane vehicleAncorPane;
    public AnchorPane salaryAncorPane;
    public AnchorPane helthAncorPane;
    public ImageView btnGetInfo;
    public Button btnUpdate;

    public void btnHomeOnAction(ActionEvent actionEvent) {
    }

    public void btnPileOnAction(ActionEvent actionEvent) {
    }

    public void btnHelthOnAction(ActionEvent actionEvent) {
        helthAncorPane.setVisible(true);
    }

    public void btnSalaryOnAction(ActionEvent actionEvent) {
    }

    public void btnVehicleOnAction(ActionEvent actionEvent) {
    }

    public void btnSalesOnAction(ActionEvent actionEvent) {
    }

    public void btnEmployeeOnAction(ActionEvent actionEvent) {
    }

    public void btnCompostOnAction(ActionEvent actionEvent) {
    }

    public void btnInventoruOnAction(ActionEvent actionEvent) {
    }

    public void btnupdateOnAction(ActionEvent actionEvent) {
        helthAncorPane.setVisible(false);

    }
    public void btnGetinfiOnAction(ActionEvent actionEvent) {
        helthAncorPane.setVisible(false);
    }

    public void btnUpdateOnAction(MouseEvent mouseEvent) {

    }
}
