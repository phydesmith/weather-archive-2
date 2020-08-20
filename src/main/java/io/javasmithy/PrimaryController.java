package io.javasmithy;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class PrimaryController implements Initializable {

    @FXML
    ImageView forecastImageView;

    @FXML
    Label forecastHeader, forecastBody, temperature;

    @FXML
    TextField searchTextField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        forecastImageView.setImage(new Image(getClass().getResource("/images/placeholder.png").toExternalForm()));
    }

    @FXML
    private void setForecastHeaderText(String text) {
        forecastHeader.setText(text);
    }

    @FXML
    private void setForecastBody(String text) {
        forecastBody.setText(text);
    }

    @FXML
    private void setTemperature(String text) {
        temperature.setText(text);
    }

    @FXML
    private String getZipcode() {
        return this.searchTextField.getText();
    }

    @FXML
    public void search() {
        //send zipcode to weather api via getZipcode()
        System.out.println("ZIPCODE: " + getZipcode());
        String header = "";
        String body = "";
        String temperature = "";
        setWeather(header, body, temperature);
    }

    private void setWeather(String header, String body, String temperature) {
        setForecastHeaderText(header);
        setForecastBody(body);
        setTemperature(temperature);
    }
}
