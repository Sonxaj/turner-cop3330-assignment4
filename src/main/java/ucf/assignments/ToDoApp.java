/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Jonas Turner
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;

public class ToDoApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        try {
            // normal way wasn't working, so used this instead
            URL url = Paths.get("./src/main/resources/ucf.assignments/ToDoApp.fxml").toUri().toURL();
            Parent root = FXMLLoader.load(url);

            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setTitle("ToDoApp");
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
