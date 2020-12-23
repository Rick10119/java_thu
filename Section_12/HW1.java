import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

/**
 * to display 3*3 o, x and
 */
public class HW1 extends Application {


    @Override // Override the start method
    public void start(Stage primaryStage) {
        // create a GridPane
        GridPane pane = new GridPane();

        // fill it in
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                addRandomImage(pane, i, j);
            }
        }

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("HW1"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

    }

    /**
     * to select an images randomly and fill it in
     */
    public static void addRandomImage(GridPane pane, int i, int j) {
        // set the length
        double length = 50;
        // random a number
        int randomNumber = (int) (Math.random() * 3);
        // select an image and fill in
        switch (randomNumber) {
            case 1:
                ImageView imageView1 = new ImageView("image/x.gif");
                imageView1.setFitHeight(length);
                imageView1.setFitWidth(length);
                pane.add(imageView1, i, j);
                break;
            case 2:
                ImageView imageView2 = new ImageView("image/o.gif");
                imageView2.setFitHeight(length);
                imageView2.setFitWidth(length);
                pane.add(imageView2, i, j);
                break;
            default:
                Rectangle shape1 = new Rectangle(0, 0, length, length);
                shape1.setStroke(Color.WHITE);
                shape1.setFill(Color.WHITE);
                pane.add(shape1, i, j);
        }
    }

    /**
     * launch
     */
    public static void main(String[] args) {
        launch(args);
    }
}
