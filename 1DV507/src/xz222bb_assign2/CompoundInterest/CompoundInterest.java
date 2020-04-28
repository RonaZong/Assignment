package xz222bb_assign2.CompoundInterest;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CompoundInterest extends Application {
    private Label title = new Label("Compound Interest");
    private TextField startAmount = new TextField();
    private TextField interest = new TextField();
    private TextField numberOfYears = new TextField();
    private Button calculate = new Button("Calculate");
    private Text totalAmount = new Text();

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);

        title.setFont(new Font(25));
        gridPane.add(title, 0, 0);
        gridPane.add(new Label("Start Amount:"), 0,1);
        gridPane.add(startAmount, 1, 1);
        gridPane.add(new Label("Interest:"), 0, 2);
        gridPane.add(interest, 1,2);
        gridPane.add(new Label("Number of years:"), 0, 3);
        gridPane.add(numberOfYears, 1, 3);
        gridPane.add(calculate,0, 4);

        gridPane.setAlignment(Pos.CENTER);
        startAmount.setAlignment(Pos.BOTTOM_LEFT);
        interest.setAlignment(Pos.BOTTOM_LEFT);
        numberOfYears.setAlignment(Pos.BOTTOM_LEFT);
        GridPane.setHalignment(calculate, HPos.LEFT);

        calculate.setOnAction(e -> calculate());

        gridPane.add(totalAmount, 0, 5);

        Scene scene = new Scene(gridPane, 400, 250);
        stage.setTitle("Compound Interest");
        stage.setScene(scene);
        stage.show();
    }

    private void calculate() {
        double amount = Double.parseDouble(startAmount.getText());
        double interestRate = Double.parseDouble(interest.getText());
        int year = Integer.parseInt(numberOfYears.getText());

        Compound compound = new Compound(amount, interestRate, year);

        totalAmount.setText("In total that will be " + compound.getTotalAmount());
    }
}
