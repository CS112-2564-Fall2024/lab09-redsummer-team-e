package cs112.lab09.controllers;

import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CityController {

    private RevisedHistoricalEvent redSummerEvent;
    private String location;

    protected void initData(String location, RevisedHistoricalEvent redSummerEvent) {
        this.location = location;
        this.redSummerEvent = redSummerEvent;

       locationLabel.setText(this.location);
       dateLabel.setText(this.redSummerEvent.getEventDay().toString());
       descriptionLabel.setText(this.redSummerEvent.getDescription());
       revisedDescriptionLabel.setText(this.redSummerEvent.getRevisedDescription());
    }

//    @FXML
//    private ImageView eventImageView;
    @FXML
    private Button closeButton;
    @FXML
    private Label locationLabel;
    @FXML
    private Label dateLabel;
    @FXML
    private Label descriptionLabel;
    @FXML
    private Label revisedDescriptionLabel;

    @FXML
    protected void onCloseButtonClick(ActionEvent actionEvent) {
       Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
       stage.close();
    }
}

//    @FXML
//    Label locationLabel;
//
//    public void initData(Constants.Event eventIndex) {
//        String[] date = HISTORICAL_DATA[eventIndex.ordinal()];
//        RevisedHistoricalEvent event = new RevisedHistoricalEvent(data);
//        locationLabel.setText(event.getLocation());
//    }

