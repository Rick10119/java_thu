import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.image.ImageView;


public class HW6 extends Application {

    private double length = 800;
    private double height = 600;
    private String baseName = "slides/slide";
    private String Name;
    private ImageView imageView;
    private int slideNumber = 0;
    private int count = 0;// time of press
    private Timeline animation;

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // the first image
        imageView = new ImageView("slides/slide0.jpg");
        imageView.setFitHeight(height);
        imageView.setFitWidth(length);

        // Create a handler for animation
        EventHandler<ActionEvent> eventHandler = e ->
        {
            // change a slide
            setSlide();
        };

        // Create an animation for a running clock
        animation = new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play(); // Start animation

        // handle when pressed
        imageView.setOnMousePressed(e -> {
            PauseOrPlay();
        });

        Pane pane = new Pane();
        pane.getChildren().add(imageView);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 800, 600);
        primaryStage.setTitle("HW6"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    // add 1 to the slideNumber
    private void setSlide() {
        if (slideNumber == 24) {
            slideNumber = 0;
        } else {
            slideNumber++;
        }
        String slideName = baseName + slideNumber + ".jpg";
        imageView.setImage((new ImageView(slideName)).getImage());
    }

    // to pause
    private void PauseOrPlay() {
        if (count % 2 == 0) {
            animation.pause();
        } else {
            animation.play();
        }
        count++;
    }

}
