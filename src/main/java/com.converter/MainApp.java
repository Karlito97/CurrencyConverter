package com.converter;
/**
 * Created by Charles Jr on 26/11/2015.
 */

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import com.converter.view.AccueilController;

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
        this.primaryStage.getIcons().add(new Image("file:src/main/resources/images/icone.png"));
        initAccueil();
    }

    /**
     * Initialize la page d'accueil
     */
    public void initAccueil() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getClassLoader().getResource("com.converter.view/Accueil.fxml"));
            rootLayout = (AnchorPane)loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
