package cs112.lab09.controllers;

import cs112.lab09.RedSummer;
import cs112.lab09.models.Date;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MapController {

//    Image sanFrancisco = new Image("/sanfrancisco.png");
//    String imageName = "sanfrancico.jpg";


    @FXML
    private Button sanFranciscoCAButton;


    @FXML
    protected void onSanFranciscoCAButtonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(RedSummer.class.getResource("CityView.fxml"));

        Parent eventViewParent = loader.load();

        CityController cityController = loader.getController();
        cityController.initData( "San Francisco, CA",
                new RevisedHistoricalEvent("/sanfrancisco.jpg" , "San Francisco, CA",
                        "a minor riot between Black and white soldiers occured in the Presidio in San Francisco",
                        new Date(5,15,1919),
                        "a minor riot between Black and white soldiers occured in the Presidio in San Francisco after a dispute",
                        "https://cdr.lib.unc.edu/downloads/1c18dm56n?locale=en")
        );

        Stage popupStage = new Stage();

        popupStage.initModality(Modality.APPLICATION_MODAL);

        popupStage.setScene(new Scene(eventViewParent));
        popupStage.show();
    }
}

//    public void hgandleSFButton() throws IOException {
//        handleOpenPopup(Event.SAN_FRANCISCO);
//    }
//
//    public void handleOpenPopup(Constants.Event eventIndex) {
//        Stage stage = new Stage();
//        stage.initModality(Modality.APPLICATION_MODAL);
//
//        FMXLLoader fxmlloader = new FXMLLoader(RedSummer.class.getResources(CITY_VIEW_RESOURCE));
//        Scene scnene = new Scene(FMXLLoader.load());
//        stage.setScene(scene);
//        stage.setTitle(CITY_VIEW_TITLE);
//        CityController cityController = fxmlLoader.getController();
//        cityController.initData(eventIndex);
//        stage.show();
//
//    }

