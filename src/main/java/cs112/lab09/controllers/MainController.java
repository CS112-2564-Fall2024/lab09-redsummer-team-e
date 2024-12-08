package cs112.lab09.controllers;

import cs112.lab09.RedSummer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

import static cs112.lab09.Constants.*;

public class MainController {
    @FXML
    Label titleLabel;

    @FXML
    Label subtitleLabel;

    @FXML
    Label descriptionLabel;

    @FXML
    ImageView imageView;

    @FXML
    private Button startButton;

    @FXML
    public void handleStartButton(ActionEvent actionEvent) throws IOException {
        Parent mapView = FXMLLoader.load(RedSummer.class.getResource("map-view.fxml"));
        Scene mapViewScene = new Scene(mapView);

        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        window.setScene(mapViewScene);

        window.show();
    }

    public void handleExitButton() {
        System.exit(0);
    }

    public void initialize() {
        titleLabel.setText(MAIN_TITLE);
        subtitleLabel.setText(MAIN_SUBTITLE);
        descriptionLabel.setText(MAIN_DESCRIPTION);
        imageView.setImage(new Image(REDSUMMER_IMAGE_PATH));
    }
}