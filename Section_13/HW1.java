import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;




public class HW1 extends Application {

    private Rectangle rectangle = new Rectangle(0, 0, 20, 60);
    private Button btRotate = new Button("Rotate");
    private StackPane gridPane = new StackPane();
    private double rotate=0;

    @Override
    public void start(Stage primaryStage) {

        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);

        // click Rotate button and rotate 15 degrees
        btRotate.setOnAction(e -> {
            rotate += 15;
            rectangle.setRotate(rotate);
        });

//        // add to the pane
//        gridPane.getChildren().add(rectangle);
//        gridPane.setHalignment(rectangle, HPos.CENTER);
//        gridPane.setValignment(rectangle, VPos.CENTER);
//
//        gridPane.getChildren().add(btRotate);
//        gridPane.setHalignment(btRotate, HPos.CENTER);
//        gridPane.setValignment(btRotate, VPos.BOTTOM);
////should have used borderbox

        // Create a scene and place it in the stage
        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("HW1"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
