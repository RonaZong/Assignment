package xz222bb_assign2.Yahtzee;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Yahtzee extends Application {
    private Dice[] dice = new Dice[5];

    private int count = 3;

    private ArrayList numbers = new ArrayList();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(5,5,5,5));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        Label title = new Label("Yahtzee");
        title.setFont(Font.font(30));

        dice[0] = new Dice(1);
        dice[1] = new Dice(2);
        dice[2] = new Dice(3);
        dice[3] = new Dice(4);
        dice[4] = new Dice(5);

        Image[] images = {new Image("xz222bb_assign2\\Yahtzee\\1.png"),new Image("xz222bb_assign2\\Yahtzee\\2.png"),new Image("xz222bb_assign2\\Yahtzee\\3.png"),
                new Image("xz222bb_assign2\\Yahtzee\\4.png"), new Image("xz222bb_assign2\\Yahtzee\\5.png"), new Image("xz222bb_assign2\\Yahtzee\\6.png")};

        ImageView[] dices = new ImageView[5];

        dices[0] = new ImageView(images[0]);
        dices[0].setFitWidth(100);
        dices[0].setFitHeight(100);
        dices[1] = new ImageView(images[1]);
        dices[1].setFitWidth(100);
        dices[1].setFitHeight(100);
        dices[2] = new ImageView(images[2]);
        dices[2].setFitWidth(100);
        dices[2].setFitHeight(100);
        dices[3] = new ImageView(images[3]);
        dices[3].setFitWidth(100);
        dices[3].setFitHeight(100);
        dices[4] = new ImageView(images[4]);
        dices[4].setFitWidth(100);
        dices[4].setFitHeight(100);

        // check boxes should be set to disabled when the program starts
       List<CheckBox> check = new ArrayList<CheckBox>();
        for (int i =0; i < 5; i++) {
            CheckBox check1 = new CheckBox();
            check1.setDisable(true);
            check.add(check1);
        }

        Button roll = new Button("Roll the dice!");
        Text reminder = new Text();
        reminder.setText("You have " + count +" rolls left.");

        roll.setOnAction(e -> {
            count--;
            if (count >= 0) {
                for (int j = 0; j < 5; j++) {
                    check.get(j).setDisable(false);
                    if (!check.get(j).isSelected()) {
                        dice[j].roll();
                        dices[j].setImage(images[dice[j].getValue() - 1]);
                    }
                    if (count == 0) {
                        numbers.add(dice[j].getValue());
                        for (CheckBox x: check) {
                            x.setDisable(true);
                        }
                    }
                }
                if (count == 0) {
                    reminder.setText(result());
                    System.out.println(numbers);
                }
                else
                    reminder.setText("You have " + count +" rolls left.");
            }
        });


        gridPane.add(title, 0, 0);

        gridPane.add(dices[0], 0, 1);
        gridPane.add(dices[1], 1, 1);
        gridPane.add(dices[2], 2, 1);
        gridPane.add(dices[3], 3, 1);
        gridPane.add(dices[4], 4, 1);

        gridPane.add(check.get(0), 0, 2);
        gridPane.add(check.get(1), 1, 2);
        gridPane.add(check.get(2), 2, 2);
        gridPane.add(check.get(3), 3, 2);
        gridPane.add(check.get(4), 4, 2);

        GridPane.setHalignment(check.get(0), HPos.CENTER);
        GridPane.setHalignment(check.get(1), HPos.CENTER);
        GridPane.setHalignment(check.get(2), HPos.CENTER);
        GridPane.setHalignment(check.get(3), HPos.CENTER);
        GridPane.setHalignment(check.get(4), HPos.CENTER);

        gridPane.add(roll, 0, 3);
        gridPane.add(reminder, 1, 3);

        Scene scene = new Scene(gridPane);
        stage.setTitle("Yahtzee");
        stage.setScene(scene);
        stage.show();
    }

    private String result() {
        Collections.sort(numbers);
//        Arrays.sort(numbers.toArray());

        int[] score = new int[6];
        score[0] = 0; // number of one
        score[1] = 0; // number of two
        score[2] = 0; // number of three
        score[3] = 0; // number of four
        score[4] = 0; // number of five
        score[5] = 0; // number of six

        for (int i = 0; i < 5; i++) {
            switch ((int)numbers.get(i)) {
                case 1: score[0]++; break;
                case 2: score[1]++; break;
                case 3: score[2]++; break;
                case 4: score[3]++; break;
                case 5: score[4]++; break;
                case 6: score[5]++; break;
            }
        }

        for (int i = 0; i < 6; i++) {
            if (score[i] == 5) {
                return "Yahtzee";
            }
            else if (score[i] == 4) {
                return "Four of a kind";
            }
            else if (score[i] == 3) {
                if ((numbers.get(0) == numbers.get(1) && numbers.get(3) == numbers.get(4))) {
                    return "Full House";
                }
                return "Three of a kind";
            }
            else if (score[i] == 2) {
                for (int n = 0; n <= 2; n++) {
                    if (score[n] != 0 && score[n + 1] != 0 && score[n + 2] != 0 && score[n + 3] != 0) {
                        return "Small Straight and Pair";
                    }
                }
                return "Pair";
            }
            else if (score[i] == 1) {
                for (int n = 0; n <= 1; n++) {
                    if (score[n] == 1 && score[n + 1] == 1 && score[n + 2] == 1
                            && score[n + 3] == 1 && score[n + 4] == 1) {
                        return "Large Straight";
                    }
                }
                for (int n = 0; n <= 2; n++) {
                    if (score[n] == 1 && score[n + 1] == 1 && score[n + 2] == 1 && score[n + 3] == 1) {
                        return "Small Straight";
                    }
                }
            }
        }

        return "No match";
    }

//    private int roll() {
//        return (int) (Math.random() * 5);
//    }
}
