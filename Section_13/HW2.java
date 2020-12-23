import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HW2 extends Application {

    private TextField tfNumber1 = new TextField();
    private TextField tfNumber2 = new TextField();
    private TextField tfResult = new TextField();
    private Button btAdd = new Button("Add");
    private Button btSubtract = new Button("Subtract");
    private Button btMultiply = new Button("Multiply");
    private Button btDivide = new Button("Divide");
    private double Number1 = 0, Number2 = 0;


    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create UI
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Number 1:"), 0, 0);
        gridPane.add(tfNumber1, 1, 0);
        gridPane.add(new Label("Number 2:"), 2, 0);
        gridPane.add(tfNumber2, 3, 0);
        gridPane.add(new Label("Result:"), 4, 0);
        gridPane.add(tfResult, 5, 0);

        gridPane.add(btAdd, 0, 1);
        gridPane.add(btSubtract, 1, 1);
        gridPane.add(btMultiply, 2, 1);
        gridPane.add(btDivide, 3, 1);

        // Process events
        btAdd.setOnAction(e -> {
            getValue();
            tfResult.setText(String.format("%.2f", (Number1 + Number2)));
        });
        btSubtract.setOnAction(e -> {
            getValue();
            tfResult.setText(String.format("%.2f", (Number1 - Number2)));
        });
        btMultiply.setOnAction(e -> {
            getValue();
            tfResult.setText(String.format("%.2f", (Number1 * Number2)));
        });
        btDivide.setOnAction(e -> {
            getValue();
            tfResult.setText(String.format("%.2f", (Number1 / Number2)));
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(gridPane, 700, 100);
        primaryStage.setTitle("HW2"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage


    }

    private void getValue() {
        // Get values from text fields
        Number1 = Double.parseDouble(tfNumber1.getText());
        Number2 = Double.parseDouble(tfNumber2.getText());

    }
}
