package xz222bb_assign2.Snowman;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Snowman extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();

        Circle sun = new Circle(800, 100, 50);
        sun.setFill(Color.YELLOW);

        Circle circle1 = new Circle(500, 310, 30);
        circle1.setFill(Color.WHITE);
        Circle circle2 = new Circle(500, 370, 40);
        circle2.setFill(Color.WHITE);
        Circle circle3 = new Circle(500, 450, 60);
        circle3.setFill(Color.WHITE);

        Circle button1 = new Circle(500, 355, 3);
        Circle button2 = new Circle(500, 370, 3);
        Circle button3 = new Circle(500, 385, 3);


        Circle leftEye = new Circle(490, 300, 3);
        leftEye.setFill(Color.BLACK);
        Circle rightEye = new Circle(510, 300, 3);
        rightEye.setFill(Color.BLACK);

        Line mouth = new Line(495, 320, 505, 320);
        mouth.setFill(Color.BLACK);

        Rectangle ground = new Rectangle(0, 500, 1000, 1000);
        ground.setFill(Color.WHITE);

        borderPane.getChildren().addAll(sun, circle1, circle2, circle3, leftEye, rightEye, mouth, button1, button2, button3, ground);

        Scene scene = new Scene(borderPane, 1000, 600, Color.rgb(50,204,255));
        stage.setTitle("Snowman");
        stage.setScene(scene);
        stage.show();
    }
}
