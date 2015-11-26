package com.converter;
/**
 * Created by Charles Jr on 26/11/2015.
 */

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage primaryStage;
    private AnchorPane rootLayout;

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }

    public MainApp() {}

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Currency Converter");

        initAccueil();
    }

    /**
     * Initialize la page d'accueil
     */
    public void initAccueil() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            Parent root = FXMLLoader.load(getClass().getResource("com.converter.view/Accueil.fxml"));
            //loader.setLocation(MainApp.class.getResource("com.converter.view/Accueil.fxml"));
            //rootLayout = loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
