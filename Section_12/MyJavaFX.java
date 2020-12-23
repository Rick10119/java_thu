// Example for PPT page No.6

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class MyJavaFX extends Application {
    // Override the start method in the Application class
    @Override
    public void start(Stage primaryStage) {
        // Create a scene and place a button in the scene
        Button buttonOK = new Button("OK");
        Scene scene = new Scene(buttonOK, 250, 200);

        // Set the stage title
        primaryStage.setTitle("MyJavaFX");

        // Place the scene in the stage
        primaryStage.setScene(scene);

        // Display the stage
        primaryStage.show();
    }

    /**
     * The main method is only needed for the IDE with limited JavaFX suppport.
     * Not needed for running from the command line.
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
}