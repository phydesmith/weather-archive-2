package io.javasmithy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader primaryLoader = new FXMLLoader(getClass().getResource("/fxml/primary-layout.fxml"));
            Parent layout = primaryLoader.load();
            stage.setScene(new Scene(layout, 512, 512));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
