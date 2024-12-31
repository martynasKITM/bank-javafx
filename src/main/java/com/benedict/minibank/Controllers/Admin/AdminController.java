package com.benedict.minibank.Controllers.Admin;
import com.benedict.minibank.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminController implements Initializable {

    public BorderPane admin_parent;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().addListener(( observableValue, oldVal, newVal) -> {
            // Add switch statements
            switch (newVal){
                case "Clients" -> admin_parent.setCenter(Model.getInstance().getViewFactory().getClientsView());
               // case "Deposit" -> admin_parent.setCenter(Model.getInstance().getViewFactory().getDepositView());
                default -> admin_parent.setCenter(Model.getInstance().getViewFactory().getCreateClientView());
            }
        });
    }
}
