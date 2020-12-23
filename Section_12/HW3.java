import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

/**
 * to display 8*8, the chess
 */
public class HW3 extends Application {


    @Override // Override the start method
    public void start(Stage primaryStage) {
        // create a GridPane
        GridPane pane = new GridPane();

        // fill it in
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                addRectangle(pane, i, j);
            }
        }

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("HW3"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

    }

    /**
     * to select a color and fill it in
     */
    public static void addRectangle(GridPane pane, int i, int j) {
        // set the length
        double length = 20;
        // decide white or black
        int sequenceNumber = 1;
        if (i % 2 == 0 && j % 2 != 0 || j % 2 == 0 && i % 2 != 0) {
            sequenceNumber = 2;
        }
        // select an image and fill in
        switch (sequenceNumber) {
            case 1:
                Rectangle shape1 = new Rectangle(0, 0, length, length);
                shape1.setStroke(Color.WHITE);
                shape1.setFill(Color.WHITE);
                pane.add(shape1, i, j);
                break;
            case 2:
                Rectangle shape2 = new Rectangle(0, 0, length, length);
                shape2.setStroke(Color.BLACK);
                shape2.setFill(Color.BLACK);
                pane.add(shape2, i, j);
                break;
            default:
                Rectangle shape3 = new Rectangle(0, 0, length, length);
                shape3.setStroke(Color.RED);
                shape3.setFill(Color.RED);
                pane.add(shape3, i, j);
        }
    }

    /**
     * launch
     */
    public static void main(String[] args) {
        launch(args);
    }
}
