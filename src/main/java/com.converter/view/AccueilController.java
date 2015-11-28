package com.converter.view;

import com.converter.MainApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import sun.applet.Main;

import java.io.IOException;

/**
 * Created by Charles Jr on 26/11/2015.
 */
public class AccueilController {

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {

    }

    /**
     * Called when the user clicks the Convertir button.
     *
     */
    @FXML
    private void handleConvertir() {
        try {
        // Load root layout from fxml file.
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getClassLoader().getResource("com.converter.view/Converter.fxml"));
        AnchorPane page = (AnchorPane)loader.load();

        // Create the dialog Stage.
        Stage converterForm = new Stage();
        converterForm.setTitle("Currency Converter");
        Scene scene = new Scene(page);
        converterForm.setScene(scene);

        // Set the dialog into the controller.
        ConverterController controller = loader.getController();
        controller.setDialogStage(converterForm);

        // Show the dialog
        converterForm.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
