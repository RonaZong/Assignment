package xz222bb_assign3.SantaClaus;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SantaClaus extends Application {
    private int index;
    private int speed = 30;

    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();

        Image background = new Image("xz222bb_assign3\\SantaClaus\\png\\background.png");
        ImageView backgroundView = new ImageView(background);
        backgroundView.setFitWidth(1000);
        backgroundView.setFitHeight(500);

        Image santaStand = new Image("xz222bb_assign3\\\\SantaClaus\\\\png\\\\Idle (1).png");

        Image[] santaWalk = {new Image("xz222bb_assign3\\SantaClaus\\png\\Walk (1).png"), new Image("xz222bb_assign3\\SantaClaus\\png\\Walk (2).png"),
                new Image("xz222bb_assign3\\SantaClaus\\png\\Walk (3).png"), new Image("xz222bb_assign3\\SantaClaus\\png\\Walk (4).png"),
                new Image("xz222bb_assign3\\SantaClaus\\png\\Walk (5).png"), new Image("xz222bb_assign3\\SantaClaus\\png\\Walk (6).png"),
                new Image("xz222bb_assign3\\SantaClaus\\png\\Walk (7).png"), new Image("xz222bb_assign3\\SantaClaus\\png\\Walk (8).png"),
                new Image("xz222bb_assign3\\SantaClaus\\png\\Walk (9).png"), new Image("xz222bb_assign3\\SantaClaus\\png\\Walk (10).png"),
                new Image("xz222bb_assign3\\SantaClaus\\png\\Walk (11).png"), new Image("xz222bb_assign3\\SantaClaus\\png\\Walk (12).png"),
                new Image("xz222bb_assign3\\SantaClaus\\png\\Walk (13).png")};

        Image[] santaRun = {new Image("xz222bb_assign3\\SantaClaus\\png\\Run (1).png"), new Image("xz222bb_assign3\\SantaClaus\\png\\Run (2).png"),
                new Image("xz222bb_assign3\\SantaClaus\\png\\Run (3).png"), new Image("xz222bb_assign3\\SantaClaus\\png\\Run (4).png"),
                new Image("xz222bb_assign3\\SantaClaus\\png\\Run (5).png"), new Image("xz222bb_assign3\\SantaClaus\\png\\Run (6).png"),
                new Image("xz222bb_assign3\\SantaClaus\\png\\Run (7).png"), new Image("xz222bb_assign3\\SantaClaus\\png\\Run (8).png"),
                new Image("xz222bb_assign3\\SantaClaus\\png\\Run (9).png"), new Image("xz222bb_assign3\\SantaClaus\\png\\Run (10).png"),
                new Image("xz222bb_assign3\\SantaClaus\\png\\Run (11).png")};

        ImageView santaView = new ImageView(santaStand);
        santaView.setFitWidth(200);
        santaView.setFitHeight(150);
        santaView.setX(1);
        santaView.setY(230);

        KeyFrame keyFrame = new KeyFrame(Duration.millis(100), e -> {
            santaView.setX(santaView.getX() + speed);

            // walk or run mode
            if (speed > 0 && speed <= 20) {
                santaView.setImage(santaWalk[index++]);
            }
            else {
                santaView.setImage(santaRun[index++]);
            }

            // back and forth
            if (santaView.getX() <= 0 || santaView.getX() >= 1000 - 200) {
                speed = -speed;
                if (speed < 0) {
                    santaView.setScaleX(-1);
                }
                else {
                    santaView.setScaleX(1);
                }
            }

            if (index == 11) {
                index = 0;
            }
        });

        Timeline timeline = new Timeline(keyFrame);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        group.getChildren().addAll(backgroundView, santaView);

        Scene scene = new Scene(group, 1000, 500);
        stage.setTitle("Running Santa");
        stage.setScene(scene);
        stage.show();
    }
}
