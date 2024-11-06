package cs112.lab09.controllers;

import javafx.stage.Modality;

import java.io.IOException;

public class MapController {

    public void hgandleSFButton() throws IOException {
        handleOpenPopup(Event.SAN_FRANCISCO);
    }

    public void handleOpenPopup(Constants.Event eventIndex) {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);

        FMXLLoader fxmlloader = new FXMLLoader(RedSummer.class.getResources(CITY_VIEW_RESOURCE));
        Scene scnene = new Scene(FMXLLoader.load());
        stage.setScene(scene);
        stage.setTitle(CITY_VIEW_TITLE);
        CityController cityController = fxmlLoader.getController();
        cityController.initData(eventIndex);
        stage.show();

    }
}
