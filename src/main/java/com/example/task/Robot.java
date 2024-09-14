package com.example.task;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Robot {
    private ImageView robotView;
    private final int stepSize = 5; // Number of pixels to move per step
    private double xPosition = 50;
    private double yPosition = 50;

    public Robot() {

        Image robotImage = new Image(getClass().getResource("/robot.png").toExternalForm());

        robotView = new ImageView(robotImage);
        robotView.setX(xPosition);
        robotView.setY(yPosition);
    }

    public ImageView getRobotImageView() {
        return robotView;
    }

    public void handleMovement(KeyEvent event, Image mazeImage) {
        switch (event.getCode()) {
            case UP:
                if (canMove(xPosition, yPosition - stepSize, mazeImage)) {
                    yPosition -= stepSize;
                }
                break;
            case DOWN:
                if (canMove(xPosition, yPosition + stepSize, mazeImage)) {
                    yPosition += stepSize;
                }
                break;
            case LEFT:
                if (canMove(xPosition - stepSize, yPosition, mazeImage)) {
                    xPosition -= stepSize;
                }
                break;
            case RIGHT:
                if (canMove(xPosition + stepSize, yPosition, mazeImage)) {
                    xPosition += stepSize;
                }
                break;
        }
        robotView.setX(xPosition);
        robotView.setY(yPosition);
    }

    private boolean canMove(double x, double y, Image mazeImage) {
        int xCoord = (int) x;
        int yCoord = (int) y;

        if (xCoord < 0 || yCoord < 0 || xCoord >= mazeImage.getWidth() || yCoord >= mazeImage.getHeight()) {
            return false;
        }

        Color pixelColor = mazeImage.getPixelReader().getColor(xCoord, yCoord);
        return !isWall(pixelColor);
    }

    private boolean isWall(Color pixelColor) {
        return pixelColor.equals(Color.BLACK);
    }

    public void startAutoMovement() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(100), event -> {
            if (canMove(xPosition + stepSize, yPosition, robotView.getImage())) {
                xPosition += stepSize;
                robotView.setX(xPosition);
            }
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}
