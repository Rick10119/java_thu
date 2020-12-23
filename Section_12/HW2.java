import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;

public class HW2 extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a HBox to hold the circle
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(30, 5, 30, 5));

        /**  add random style text */
        for (int i = 0; i < 5; i++) {
            Text text1 = new Text(30, 30, "Java");
            text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            text1.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
            text1.setRotate(90);
            hBox.getChildren().add(text1);
        }

        // Create a scene and place it in the stage
        Scene scene = new Scene(hBox);
        primaryStage.setTitle("HW2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * launch
     */
    public static void main(String[] args) {
        launch(args);
    }
}
