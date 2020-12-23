import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;


public class HW4 extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane and set its properties
        Pane pane = new Pane();
        Circle circle = new Circle(100, 100, 50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        pane.getChildren().add(circle);

        circle.setOnKeyPressed(e ->
        {
            switch (e.getCode()) {
                case DOWN:
                    circle.setCenterY(circle.getCenterY() + 10);
                    break;
                case UP:
                    circle.setCenterY(circle.getCenterY() - 10);
                    break;
                case LEFT:
                    circle.setCenterX(circle.getCenterX() - 10);
                    break;
                case RIGHT:
                    circle.setCenterX(circle.getCenterX() + 10);
                    break;
                default:
                    ;
            }
        });

        // Create a scene and place the pane in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("HW4"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        circle.requestFocus(); // circle is focused to receive key input
    }
}