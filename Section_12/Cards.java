import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

public class Cards extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        /* Create array of ImageFiles */
        String[] str = new String[52];

        for (int i = 0; i < 52; i++) {
            str[i] = String.format("card/%1d.png", i + 1);
        }

        HBox pane = new HBox(5);
        pane.setAlignment(Pos.CENTER);

        pane.getChildren().add(new ImageView(str[(int) (Math.random() * 52)]));
        pane.getChildren().add(new ImageView(str[(int) (Math.random() * 52)]));
        pane.getChildren().add(new ImageView(str[(int) (Math.random() * 52)]));

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Cards"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}