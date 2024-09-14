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
        double robotWidth = robotView.getImage().getWidth();
        double robotHeight = robotView.getImage().getHeight();

        double xLeft = x;  // Left boundary of robot
        double xRight = x + robotWidth/1.5;  // While this is just the Right boundary of robot
        double yTop = y;  // Top boundary of robot
        double yBottom = y + robotHeight/1.5;  // This is just the bottom boundary of robot

        if (xLeft < 0 || yTop < 0 || xRight >= mazeImage.getWidth() || yBottom >= mazeImage.getHeight()) {
            return false;
        }

        // This is to Check if any corner of the robot hits the wall
        Color topLeft = mazeImage.getPixelReader().getColor((int) xLeft, (int) yTop);
        Color topRight = mazeImage.getPixelReader().getColor((int) xRight, (int) yTop);
        Color bottomLeft = mazeImage.getPixelReader().getColor((int) xLeft, (int) yBottom);
        Color bottomRight = mazeImage.getPixelReader().getColor((int) xRight, (int) yBottom);

        return !isWall(topLeft) && !isWall(topRight) && !isWall(bottomLeft) && !isWall(bottomRight);
    }


    private boolean isWall(Color pixelColor) {
        Color wallColor = Color.web("#005399");
        return pixelColor.equals(wallColor);    }

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
