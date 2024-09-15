package com.example.task;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class Car {
    private final ImageView carView;
    private final ImageView carUpView;
    private final ImageView carDownView;
    private final int stepSize = 5; // Number of pixels to move per step
    private double xPosition = 50;
    private double yPosition = 50;



    public Car() {
        Image carImage = new Image(getClass().getResource("/car.png").toExternalForm());
        Image carUpImage = new Image(getClass().getResource("/car_up.png").toExternalForm());
        Image carDownImage = new Image(getClass().getResource("/car_down.png").toExternalForm());
        carView = new ImageView(carImage);
        carUpView = new ImageView(carUpImage);
        carDownView = new ImageView(carDownImage);
        carView.setX(xPosition);
        carView.setY(yPosition);

 carUpView.setX(xPosition);
        carUpView.setY(yPosition);

 carDownView.setX(xPosition);
        carDownView.setY(yPosition);

    }


    public ImageView getcarImageView() {
        return carView;
    } public ImageView getcarUpImageView() {
        return carUpView;
    } public ImageView getcarDownImageView() {
        return carDownView;
    }

    public void handleMovement(KeyEvent event, Image mazeImage) {
        //This is for when you want manual movement and stuff
        switch (event.getCode()) {
            case UP:
                if (canMove(xPosition, yPosition - stepSize, mazeImage)) {
                    yPosition -= stepSize;
                    carView.setRotate(270);
                }
                break;
            case DOWN:
                if (canMove(xPosition, yPosition + stepSize, mazeImage)) {
                    yPosition += stepSize;
                    carView.setRotate(90);
                }
                break;
            case LEFT:
                if (canMove(xPosition - stepSize, yPosition, mazeImage)) {
                    xPosition -= stepSize;
                    carView.setRotate(0);
                }
                break;
            case RIGHT:
                if (canMove(xPosition + stepSize, yPosition, mazeImage)) {
                    xPosition += stepSize;
                    carView.setRotate(0);
                }
                break;
        }
        carView.setX(xPosition);
        carView.setY(yPosition);
    }



    private boolean canMove(double x, double y, Image mazeImage) {
        double carWidth = carView.getImage().getWidth();
        double carHeight = carView.getImage().getHeight();

        double xLeft = x;  // Left boundary of the car
        double xRight = x + carWidth / 1.5;  // Right boundary
        double yTop = y;  // Top boundary
        double yBottom = y + carHeight / 1.5;  // Bottom boundary

        if (xLeft < 0 || yTop < 0 || xRight >= mazeImage.getWidth() || yBottom >= mazeImage.getHeight()) {
            return false;
        }

        // Checks corners of the car for walls
        Color topLeft = mazeImage.getPixelReader().getColor((int) xLeft, (int) yTop);
        Color topRight = mazeImage.getPixelReader().getColor((int) xRight, (int) yTop);
        Color bottomLeft = mazeImage.getPixelReader().getColor((int) xLeft, (int) yBottom);
        Color bottomRight = mazeImage.getPixelReader().getColor((int) xRight, (int) yBottom);

        return !isWall(topLeft) && !isWall(topRight) && !isWall(bottomLeft) && !isWall(bottomRight);
    }

    private boolean isWall(Color pixelColor) {
        Color wallColor = Color.web("#005399");
        return pixelColor.equals(wallColor);
    }





}
