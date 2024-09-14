package com.example.task;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Image mazeImage = new Image(getClass().getResource("/maze.png").toExternalForm());
        ImageView mazeView = new ImageView(mazeImage);

        Robot robot = new Robot();

        Pane layout = new Pane();
        layout.getChildren().addAll(mazeView, robot.getRobotImageView());

        Scene scene = new Scene(layout, mazeImage.getWidth(), mazeImage.getHeight());

        scene.setOnKeyPressed(event -> robot.handleMovement(event, mazeImage));

        primaryStage.setTitle("Maze Game");
        primaryStage.setScene(scene);
        primaryStage.show();

        robot.startAutoMovement();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
