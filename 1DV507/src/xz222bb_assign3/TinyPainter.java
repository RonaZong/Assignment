package xz222bb_assign3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TinyPainter extends Application {
    private Line line = new Line();
    private Rectangle dot = new Rectangle();
    private Rectangle rectangle = new Rectangle();
    private Circle circle = new Circle();
    private double startX, startY, endX, endY;

    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        pane.setPadding(new Insets(5, 5, 5, 5));

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(5, 5, 5, 5));
        hBox.setSpacing(5);

        ComboBox<String> shape = new ComboBox<>();
        shape.getItems().addAll("Line", "Dot", "Rectangle", "Circle");
        ComboBox<Integer> size = new ComboBox<>();
        size.getItems().addAll(1, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20,
                22, 24, 26, 28, 30, 32, 34, 36, 38, 40);
        ColorPicker colorPicker = new ColorPicker();

        hBox.getChildren().addAll(shape, size, colorPicker);

        pane.getChildren().add(hBox);

        pane.setOnMousePressed(e -> {
            startX = e.getX();
            startY = e.getY();

            try {
                if (shape.getSelectionModel().getSelectedItem().equals("Line")) {
                    line = new Line();
                    line.setStartX(startX);
                    line.setStartY(startY);
                    line.setStrokeWidth(size.getValue());
                    line.setStroke(colorPicker.getValue());
                }
                else if (shape.getSelectionModel().getSelectedItem().equals("Dot")) {
                    dot = new Rectangle(startX, startY, size.getValue(), size.getValue());
                    dot.setFill(colorPicker.getValue());
                    pane.getChildren().add(dot);
                }
                else if (shape.getSelectionModel().getSelectedItem().equals("Rectangle")) {
                    rectangle = new Rectangle();
                    rectangle.setX(startX);
                    rectangle.setY(startY);
                    rectangle.setFill(colorPicker.getValue());
                }
                else if (shape.getSelectionModel().getSelectedItem().equals("Circle")) {
                    circle = new Circle();
                    circle.setCenterX(startX);
                    circle.setCenterY(startY);
                    circle.setFill(colorPicker.getValue());
                }
            }
            catch (NullPointerException ignored) {
            }
        });

        pane.setOnMouseDragged(r -> {
            endX = r.getX();
            endY = r.getY();

            try {
                if (shape.getSelectionModel().getSelectedItem().equals("Line")) {
                    line.setEndX(endX);
                    line.setEndY(endY);
                    try {
                        pane.getChildren().add(line);
                    }
                    catch (IllegalArgumentException ignored) {
                    }
                }
                else if (shape.getSelectionModel().getSelectedItem().equals("Rectangle")) {
                    if (startX < endX) {
                        if (startY < endY) {
                        }
                        else {
                            rectangle.setY(endY);
                        }
                    }
                    else {
                        if (startY < endY) {
                            rectangle.setX(endX);
                        }
                        else {
                            rectangle.setX(endX);
                            rectangle.setY(endY);
                        }
                    }
                    rectangle.setWidth(Math.abs(endX - startX));
                    rectangle.setHeight(Math.abs(endY - startY));

                    try {
                        pane.getChildren().add(rectangle);
                    }
                    catch (IllegalArgumentException ignored) {
                    }
                }
                else if (shape.getSelectionModel().getSelectedItem().equals("Circle")) {
                    circle.setRadius(Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2)));
                    try {
                        pane.getChildren().add(circle);
                    }
                    catch (IllegalArgumentException ignored) {
                    }
                }
            }
            catch (NullPointerException ignored) {
            }
        });

        Scene scene = new Scene(pane, 500, 400);
        stage.setTitle("Tiny Painter");
        stage.setScene(scene);
        stage.show();
    }
}
