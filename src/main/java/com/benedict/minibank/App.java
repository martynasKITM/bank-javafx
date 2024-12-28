package com.benedict.minibank;

import com.benedict.minibank.Views.ViewsFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start( Stage stage) throws Exception{
        ViewsFactory viewsFactory = new ViewsFactory();
        viewsFactory.showLoginWindow();
    }
}
