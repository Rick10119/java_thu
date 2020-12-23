import javafx.application.Application;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;


public class HW4 extends Application {
    // Override the start method in the Application class
    @Override
    public void start(Stage primaryStage) {
        // Create a pane and set its properties
        Pane pane = new Pane();

        // create ellipse and bind them
        Ellipse e1 = new Ellipse();
        Ellipse e2 = new Ellipse();
        Line l1 = new Line();
        Line l2 = new Line();

        e1.centerXProperty().bind(pane.widthProperty().divide(2));
        e1.centerYProperty().bind(pane.heightProperty().divide(5));
        e1.radiusXProperty().bind(pane.widthProperty().divide(3));
        e1.radiusYProperty().bind(pane.heightProperty().divide(14));
        e1.setStroke(Color.BLACK);
        e1.setFill(Color.WHITE);

        e2.centerXProperty().bind(pane.widthProperty().divide(2));
        e2.centerYProperty().bind(pane.heightProperty().divide(1.25));
        e2.radiusXProperty().bind(pane.widthProperty().divide(3));
        e2.radiusYProperty().bind(pane.heightProperty().divide(14));
        e2.setStroke(Color.BLACK);
        e2.setFill(Color.WHITE);

        l1.endXProperty().bind(pane.widthProperty().divide(6));
        l1.endYProperty().bind(e2.centerYProperty());
        l1.startXProperty().bind(pane.widthProperty().divide(6));
        l1.startYProperty().bind(e1.centerYProperty());

        l2.endXProperty().bind(pane.widthProperty().divide(1.2));
        l2.endYProperty().bind(e2.centerYProperty());
        l2.startXProperty().bind(pane.widthProperty().divide(1.2));
        l2.startYProperty().bind(e1.centerYProperty());


        pane.getChildren().add(e1);
        pane.getChildren().add(e2);
        pane.getChildren().add(l1);
        pane.getChildren().add(l2);

        // Create a scene and place it on the stage
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Changeable column");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main method is only needed for the IDE with limited JavaFX support.
     * Not needed for running from the command line.
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
}
