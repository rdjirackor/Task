package com.example.task;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Image mazeImage = new Image(getClass().getResource("/maze.png").toExternalForm());
        ImageView mazeView = new ImageView(mazeImage);

//        int[][] grid = new int[width][height];
//        for (int y = 0; y < height; y++) {
//            for (int x = 0; x < width; x++) {
//                Color color = mazeImage.getPixelReader().getColor(x, y);
//                if (isWall(color)) {
//                    grid[x][y] = 0;
//                } else {
//                    grid[x][y] = 1;
//                }
//            }
//        }
//This initializes the droid bot
        Robot robot = new Robot();
        Car car = new Car();
        ArrayList<double[]> positions = new ArrayList<>();
        //These are all the positions the bot needs to reach before completing that maze thing
        positions.add(new double[]{50.0, 55.0});
        positions.add(new double[]{50.0, 60.0});
        positions.add(new double[]{50.0, 65.0});
        positions.add(new double[]{50.0, 70.0});
        positions.add(new double[]{50.0, 75.0});
        positions.add(new double[]{50.0, 80.0});
        positions.add(new double[]{50.0, 85.0});
        positions.add(new double[]{50.0, 90.0});
        positions.add(new double[]{50.0, 95.0});
        positions.add(new double[]{50.0, 100.0});
        positions.add(new double[]{50.0, 105.0});
        positions.add(new double[]{50.0, 110.0});
        positions.add(new double[]{50.0, 115.0});
        positions.add(new double[]{50.0, 120.0});
        positions.add(new double[]{50.0, 125.0});
        positions.add(new double[]{50.0, 130.0});
        positions.add(new double[]{50.0, 135.0});
        positions.add(new double[]{50.0, 140.0});
        positions.add(new double[]{50.0, 145.0});
        positions.add(new double[]{50.0, 150.0});
        positions.add(new double[]{55.0, 150.0});
        positions.add(new double[]{60.0, 150.0});
        positions.add(new double[]{65.0, 150.0});
        positions.add(new double[]{70.0, 150.0});
        positions.add(new double[]{75.0, 150.0});
        positions.add(new double[]{80.0, 150.0});
        positions.add(new double[]{85.0, 150.0});
        positions.add(new double[]{90.0, 150.0});
        positions.add(new double[]{95.0, 150.0});
        positions.add(new double[]{100.0, 150.0});
        positions.add(new double[]{105.0, 150.0});
        positions.add(new double[]{110.0, 150.0});
        positions.add(new double[]{115.0, 150.0});
        positions.add(new double[]{120.0, 150.0});
        positions.add(new double[]{125.0, 150.0});
        positions.add(new double[]{130.0, 150.0});
        positions.add(new double[]{135.0, 150.0});
        positions.add(new double[]{140.0, 150.0});
        positions.add(new double[]{145.0, 150.0});
        positions.add(new double[]{150.0, 150.0});
        positions.add(new double[]{155.0, 150.0});
        positions.add(new double[]{160.0, 150.0});
        positions.add(new double[]{165.0, 150.0});
        positions.add(new double[]{170.0, 150.0});
        positions.add(new double[]{175.0, 150.0});
        positions.add(new double[]{180.0, 150.0});
        positions.add(new double[]{185.0, 150.0});
        positions.add(new double[]{190.0, 150.0});
        positions.add(new double[]{195.0, 150.0});
        positions.add(new double[]{200.0, 150.0});
        positions.add(new double[]{205.0, 150.0});
        positions.add(new double[]{210.0, 150.0});
        positions.add(new double[]{215.0, 150.0});
        positions.add(new double[]{220.0, 150.0});
        positions.add(new double[]{225.0, 150.0});
        positions.add(new double[]{230.0, 150.0});
        positions.add(new double[]{235.0, 150.0});
        positions.add(new double[]{240.0, 150.0});
        positions.add(new double[]{245.0, 150.0});
        positions.add(new double[]{250.0, 150.0});
        positions.add(new double[]{255.0, 150.0});
        positions.add(new double[]{260.0, 150.0});
        positions.add(new double[]{265.0, 150.0});
        positions.add(new double[]{270.0, 150.0});
        positions.add(new double[]{270.0, 145.0});
        positions.add(new double[]{270.0, 140.0});
        positions.add(new double[]{270.0, 135.0});
        positions.add(new double[]{270.0, 130.0});
        positions.add(new double[]{270.0, 125.0});
        positions.add(new double[]{270.0, 120.0});
        positions.add(new double[]{270.0, 115.0});
        positions.add(new double[]{270.0, 110.0});
        positions.add(new double[]{270.0, 105.0});
        positions.add(new double[]{270.0, 100.0});
        positions.add(new double[]{270.0, 95.0});
        positions.add(new double[]{275.0, 95.0});
        positions.add(new double[]{280.0, 95.0});
        positions.add(new double[]{285.0, 95.0});
        positions.add(new double[]{290.0, 95.0});
        positions.add(new double[]{295.0, 95.0});
        positions.add(new double[]{300.0, 95.0});
        positions.add(new double[]{305.0, 95.0});
        positions.add(new double[]{310.0, 95.0});
        positions.add(new double[]{315.0, 95.0});
        positions.add(new double[]{320.0, 95.0});
        positions.add(new double[]{320.0, 100.0});
        positions.add(new double[]{320.0, 105.0});
        positions.add(new double[]{320.0, 110.0});
        positions.add(new double[]{320.0, 115.0});
        positions.add(new double[]{320.0, 120.0});
        positions.add(new double[]{320.0, 125.0});
        positions.add(new double[]{320.0, 130.0});
        positions.add(new double[]{320.0, 135.0});
        positions.add(new double[]{320.0, 140.0});
        positions.add(new double[]{320.0, 145.0});
        positions.add(new double[]{320.0, 150.0});
        positions.add(new double[]{320.0, 155.0});
        positions.add(new double[]{320.0, 160.0});
        positions.add(new double[]{320.0, 165.0});
        positions.add(new double[]{320.0, 170.0});
        positions.add(new double[]{320.0, 175.0});
        positions.add(new double[]{320.0, 180.0});
        positions.add(new double[]{320.0, 185.0});
        positions.add(new double[]{320.0, 190.0});
        positions.add(new double[]{320.0, 195.0});
        positions.add(new double[]{320.0, 200.0});
        positions.add(new double[]{320.0, 205.0});
        positions.add(new double[]{320.0, 210.0});
        positions.add(new double[]{320.0, 215.0});
        positions.add(new double[]{320.0, 220.0});
        positions.add(new double[]{320.0, 225.0});
        positions.add(new double[]{320.0, 230.0});
        positions.add(new double[]{320.0, 235.0});
        positions.add(new double[]{320.0, 240.0});
        positions.add(new double[]{320.0, 245.0});
        positions.add(new double[]{320.0, 250.0});
        positions.add(new double[]{320.0, 255.0});
        positions.add(new double[]{320.0, 260.0});
        positions.add(new double[]{320.0, 265.0});
        positions.add(new double[]{320.0, 270.0});
        positions.add(new double[]{320.0, 275.0});
        positions.add(new double[]{320.0, 280.0});
        positions.add(new double[]{320.0, 285.0});
        positions.add(new double[]{320.0, 290.0});
        positions.add(new double[]{320.0, 295.0});
        positions.add(new double[]{320.0, 300.0});
        positions.add(new double[]{320.0, 305.0});
        positions.add(new double[]{320.0, 310.0});
        positions.add(new double[]{320.0, 315.0});
        positions.add(new double[]{320.0, 320.0});
        positions.add(new double[]{320.0, 325.0});
        positions.add(new double[]{325.0, 325.0});
        positions.add(new double[]{330.0, 325.0});
        positions.add(new double[]{335.0, 325.0});
        positions.add(new double[]{340.0, 325.0});
        positions.add(new double[]{345.0, 325.0});
        positions.add(new double[]{350.0, 325.0});
        positions.add(new double[]{355.0, 325.0});
        positions.add(new double[]{360.0, 325.0});
        positions.add(new double[]{365.0, 325.0});
        positions.add(new double[]{370.0, 325.0});
        positions.add(new double[]{375.0, 325.0});
        positions.add(new double[]{380.0, 325.0});
        positions.add(new double[]{385.0, 325.0});
        positions.add(new double[]{385.0, 315.0});
        positions.add(new double[]{385.0, 310.0});
        positions.add(new double[]{385.0, 305.0});
        positions.add(new double[]{385.0, 300.0});
        positions.add(new double[]{385.0, 295.0});
        positions.add(new double[]{385.0, 290.0});
        positions.add(new double[]{385.0, 285.0});
        positions.add(new double[]{385.0, 280.0});
        positions.add(new double[]{385.0, 275.0});
        positions.add(new double[]{385.0, 270.0});
        positions.add(new double[]{385.0, 265.0});
        positions.add(new double[]{385.0, 260.0});
        positions.add(new double[]{385.0, 255.0});
        positions.add(new double[]{385.0, 250.0});
        positions.add(new double[]{385.0, 245.0});
        positions.add(new double[]{385.0, 240.0});
        positions.add(new double[]{385.0, 235.0});
        positions.add(new double[]{385.0, 230.0});
        positions.add(new double[]{385.0, 225.0});
        positions.add(new double[]{385.0, 220.0});
        positions.add(new double[]{385.0, 215.0});
        positions.add(new double[]{385.0, 210.0});
        positions.add(new double[]{385.0, 205.0});
        positions.add(new double[]{390.0, 205.0});
        positions.add(new double[]{395.0, 205.0});
        positions.add(new double[]{400.0, 205.0});
        positions.add(new double[]{405.0, 205.0});
        positions.add(new double[]{410.0, 205.0});
        positions.add(new double[]{415.0, 205.0});
        positions.add(new double[]{420.0, 205.0});
        positions.add(new double[]{425.0, 205.0});
        positions.add(new double[]{430.0, 205.0});
        positions.add(new double[]{435.0, 205.0});
        positions.add(new double[]{440.0, 205.0});
        positions.add(new double[]{445.0, 205.0});
        positions.add(new double[]{450.0, 205.0});
        positions.add(new double[]{455.0, 205.0});
        positions.add(new double[]{460.0, 205.0});
        positions.add(new double[]{465.0, 205.0});
        positions.add(new double[]{470.0, 205.0});
        positions.add(new double[]{475.0, 205.0});
        positions.add(new double[]{480.0, 205.0});
        positions.add(new double[]{485.0, 205.0});
        positions.add(new double[]{490.0, 205.0});
        positions.add(new double[]{495.0, 205.0});
        positions.add(new double[]{500.0, 205.0});
        positions.add(new double[]{505.0, 205.0});
        positions.add(new double[]{505.0, 200.0});
        positions.add(new double[]{505.0, 195.0});
        positions.add(new double[]{505.0, 190.0});
        positions.add(new double[]{505.0, 185.0});
        positions.add(new double[]{505.0, 180.0});
        positions.add(new double[]{505.0, 175.0});
        positions.add(new double[]{505.0, 170.0});
        positions.add(new double[]{505.0, 165.0});
        positions.add(new double[]{505.0, 160.0});
        positions.add(new double[]{505.0, 155.0});
        positions.add(new double[]{505.0, 150.0});
        positions.add(new double[]{505.0, 145.0});
        positions.add(new double[]{505.0, 140.0});
        positions.add(new double[]{505.0, 135.0});
        positions.add(new double[]{505.0, 130.0});
        positions.add(new double[]{505.0, 125.0});
        positions.add(new double[]{505.0, 120.0});
        positions.add(new double[]{505.0, 115.0});
        positions.add(new double[]{505.0, 110.0});
        positions.add(new double[]{505.0, 105.0});
        positions.add(new double[]{505.0, 100.0});
        positions.add(new double[]{510.0, 100.0});
        positions.add(new double[]{515.0, 100.0});
        positions.add(new double[]{520.0, 100.0});
        positions.add(new double[]{525.0, 100.0});
        positions.add(new double[]{530.0, 100.0});
        positions.add(new double[]{535.0, 100.0});
        positions.add(new double[]{540.0, 100.0});
        positions.add(new double[]{545.0, 100.0});
        positions.add(new double[]{550.0, 100.0});
        positions.add(new double[]{555.0, 100.0});
        positions.add(new double[]{555.0, 105.0});
        positions.add(new double[]{555.0, 110.0});
        positions.add(new double[]{555.0, 115.0});
        positions.add(new double[]{555.0, 120.0});
        positions.add(new double[]{555.0, 125.0});
        positions.add(new double[]{555.0, 130.0});
        positions.add(new double[]{555.0, 135.0});
        positions.add(new double[]{555.0, 140.0});
        positions.add(new double[]{555.0, 145.0});
        positions.add(new double[]{555.0, 150.0});
        positions.add(new double[]{555.0, 155.0});
        positions.add(new double[]{555.0, 160.0});
        positions.add(new double[]{555.0, 165.0});
        positions.add(new double[]{555.0, 170.0});
        positions.add(new double[]{555.0, 175.0});
        positions.add(new double[]{555.0, 180.0});
        positions.add(new double[]{555.0, 185.0});
        positions.add(new double[]{555.0, 190.0});
        positions.add(new double[]{555.0, 195.0});
        positions.add(new double[]{555.0, 200.0});
        positions.add(new double[]{555.0, 205.0});
        positions.add(new double[]{555.0, 210.0});
        positions.add(new double[]{555.0, 215.0});
        positions.add(new double[]{555.0, 220.0});
        positions.add(new double[]{555.0, 225.0});
        positions.add(new double[]{555.0, 230.0});
        positions.add(new double[]{555.0, 235.0});
        positions.add(new double[]{555.0, 240.0});
        positions.add(new double[]{555.0, 245.0});
        positions.add(new double[]{560.0, 245.0});
        positions.add(new double[]{565.0, 245.0});
        positions.add(new double[]{570.0, 245.0});
        positions.add(new double[]{575.0, 245.0});
        positions.add(new double[]{580.0, 245.0});
        positions.add(new double[]{585.0, 245.0});
        positions.add(new double[]{590.0, 245.0});
        positions.add(new double[]{590.0, 245.0});












        // Move the robot to the end position using the A* algorithm

        // Just Sets up the scene and the stage
        Timeline timeline = new Timeline();


        Button startButton = new Button("Start Maze 1 (Animation");

        Button startmanualButton = new Button("Start Maze 1 (Manual)");

        Button startButtonCar = new Button("Car (Auto)");

        Button startmanualButtonCar = new Button("Car (Manual)");




        startmanualButton.setOnAction(e->{
            Pane mazeLayout = new Pane();
            mazeLayout.getChildren().addAll(mazeView, robot.getRobotImageView());

            Scene mazeScene = new Scene(mazeLayout, mazeImage.getWidth(), mazeImage.getHeight());
            mazeScene.setOnKeyPressed(event -> robot.handleMovement(event, mazeImage));
            timeline.play(); // Start the timeline when switching to the maze scene
            primaryStage.setScene(mazeScene); // Switch to the maze scene

        });

        startButton.setOnAction(e -> {
            Pane mazeLayout = new Pane();
            mazeLayout.getChildren().addAll(mazeView, robot.getRobotImageView());

            Scene mazeScene = new Scene(mazeLayout, mazeImage.getWidth(), mazeImage.getHeight());

            int delay = 0;

            for (double[] position : positions) {
                KeyFrame keyFrame = new KeyFrame(Duration.millis(delay), event -> {
                    robot.getRobotImageView().setX(position[0]);
                    robot.getRobotImageView().setY(position[1]);
                });
                timeline.getKeyFrames().add(keyFrame);
                delay += 500; //Also added a    Delay of 500 milliseconds between moves
            }
            mazeScene.setOnKeyPressed(event -> robot.handleMovement(event, mazeImage));
            timeline.play(); // Start the timeline when switching to the maze scene
            primaryStage.setScene(mazeScene); // Switch to the maze scene



        });
        startButtonCar.setOnAction(e -> {
            Pane mazeLayout = new Pane();
            mazeLayout.getChildren().addAll(mazeView, car.getcarImageView());

            Scene mazeScene = new Scene(mazeLayout, mazeImage.getWidth(), mazeImage.getHeight());

            int delay = 0;

            for (double[] position : positions) {
                KeyFrame keyFrame = new KeyFrame(Duration.millis(delay), event -> {
                    car.getcarImageView().setX(position[0]);
                    car.getcarImageView().setY(position[1]);
                });
                timeline.getKeyFrames().add(keyFrame);
                delay += 500; //Also added a    Delay of 500 milliseconds between moves
            }
            mazeScene.setOnKeyPressed(event -> car.handleMovement(event, mazeImage));
            timeline.play(); // Start the timeline when switching to the maze scene
            primaryStage.setScene(mazeScene); // Switch to the maze scene



        });
        startmanualButtonCar.setOnAction(e -> {
            Pane mazeLayout = new Pane();
            mazeLayout.getChildren().addAll(mazeView, car.getcarImageView());

            Scene mazeScene = new Scene(mazeLayout, mazeImage.getWidth(), mazeImage.getHeight());
            mazeScene.setOnKeyPressed(event -> car.handleMovement(event, mazeImage));
            timeline.play(); // Start the timeline when switching to the maze scene
            primaryStage.setScene(mazeScene); // Switch to the maze scene

        });
        GridPane welcomeLayout = new GridPane();
        welcomeLayout.setVgap(10);
        welcomeLayout.setHgap(10);

        GridPane.setConstraints(startButton,0,0);
        GridPane.setConstraints(startmanualButton,1,0);
        GridPane.setConstraints(startButtonCar,0,1);
        GridPane.setConstraints(startmanualButtonCar,1,1);

welcomeLayout.setAlignment(Pos.CENTER);
        welcomeLayout.getChildren().add(startButton);
        welcomeLayout.getChildren().add(startmanualButton);
        welcomeLayout.getChildren().add(startButtonCar);
        welcomeLayout.getChildren().add(startmanualButtonCar);


        Scene welcomeScene = new Scene(welcomeLayout, 300, 200);

        primaryStage.setTitle("Maze Game");
        primaryStage.setScene(welcomeScene);
        primaryStage.show();


     //   mazeScene.setOnKeyPressed(event -> robot.handleMovement(event, mazeImage));

//        primaryStage.setTitle("Maze Game");
//        primaryStage.setScene(mazeScene);
//        primaryStage.show();



        timeline.play();



    }

//    private boolean isWall(Color pixelColor) {
//        Color wallColor = Color.web("#005399"); // I detected the Blue wall color, to help mapping walls so bot knows to avoid them
//        return pixelColor.equals(wallColor);
//    }

    public static void main(String[] args) {
        launch(args);




    }
}
