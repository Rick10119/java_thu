import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HW5 extends Application {
    @Override
    public void start(Stage stage) {
        // create a the nodes
        Circle circle = new Circle(110, 110, 90, Color.WHITE);
        circle.setStroke(Color.BLACK);
        Button btPause = new Button("Pause");
        Button btResume = new Button("Resume");
        Button btReverse = new Button("Reverse");
        Arc[] a = new Arc[4];
        for (int i = 0; i < 4; i++) {
            a[i] = new Arc(110, 110, 82, 82, 90 * i, 30);
            a[i].setStroke(Color.RED);
            a[i].setFill(Color.RED);
            a[i].setType(ArcType.ROUND);
        }

        // create the (HBox) to contain the buttons
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(5);
        hbox.getChildren().addAll(btPause, btResume, btReverse);

        // animation
        Timeline timeline1 = new Timeline();
        timeline1.setCycleCount(Timeline.INDEFINITE);
        Timeline timeline2 = new Timeline();
        timeline2.setCycleCount(Timeline.INDEFINITE);
        Duration duration = Duration.millis(1000);
        KeyValue[] kv1 = new KeyValue[4];
        KeyFrame[] kf1 = new KeyFrame[4];
        KeyValue[] kv2 = new KeyValue[4];
        KeyFrame[] kf2 = new KeyFrame[4];
        for (int j = 0; j < 4; j++) {
            kv1[j] = new KeyValue(a[j].startAngleProperty(), 360 + a[j].getStartAngle());
            kf1[j] = new KeyFrame(duration, kv1);
            timeline1.getKeyFrames().add(kf1[j]);
            kv2[j] = new KeyValue(a[j].startAngleProperty(), -360 + a[j].getStartAngle());
            kf2[j] = new KeyFrame(duration, kv2);
            timeline2.getKeyFrames().add(kf2[j]);
        }
        btResume.setOnMouseClicked(e -> {
            timeline2.pause();
            timeline1.play();
        });
        btPause.setOnMouseClicked(e -> {
            timeline1.pause();
            timeline2.pause();
        });
        btReverse.setOnMouseClicked(e -> {
            timeline1.pause();
            timeline2.play();
        });


        Pane pane = new Pane();
        pane.getChildren().addAll(circle, a[0], a[1], a[2], a[3]);
        // BorderPane
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(hbox);
        Scene scene = new Scene(pane, 220, 220);
        stage.setTitle("HW5");
        stage.setScene(scene);
        stage.show();
    }

}