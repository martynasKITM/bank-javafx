package com.benedict.minibank.Controllers;

import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public ComboBox acc_selector;
    public Label payee_address_lbl;
    public TextField payee_address_fld;
    public Label password_lbl;
    public PasswordField password_fld;
    public Button login_btn;
    public Label error_lbl;

    public void initialize( URL url, ResourceBundle resourceBundle ){}
}
