import java.util.concurrent.atomic.AtomicInteger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SimpleApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Set the title of the window
        primaryStage.setTitle("Hello World");

        // Set application layout
        BorderPane stage = new BorderPane();
        stage.setPadding(new Insets(50));
        stage.setPrefSize(500, 500);

        // Create buttons
        Button left = new Button("Left");
        Button right = new Button("Right");
        Button top = new Button("Top");
        Button bottom = new Button("Bottom");

        // Create a label
        Label label = new Label();
        label.setText("Button pressed 0 times\n--- Button Pressed");
        AtomicInteger pressed = new AtomicInteger(1);

        // Create a callback handler
        EventHandler<ActionEvent> handler = (event) -> {
            int count = pressed.getAndIncrement();
            String times = count == 1 ? " time" : " times";
            label.setText("Button pressed " + count + times + "\n"
                    + ((Button) event.getSource()).getText() + " Button pressed");
            label.autosize();
        };

        // Add button callbacks
        top.setOnAction(handler);
        left.setOnAction(handler);
        right.setOnAction(handler);
        bottom.setOnAction(handler);

        // Add widgets to the stage
        stage.setTop(top);
        BorderPane.setAlignment(top, Pos.CENTER);
        stage.setLeft(left);
        BorderPane.setAlignment(left, Pos.CENTER);
        stage.setRight(right);
        BorderPane.setAlignment(right, Pos.CENTER);
        stage.setBottom(bottom);
        BorderPane.setAlignment(bottom, Pos.CENTER);

        stage.setCenter(label);

        // Display the window
        primaryStage.setScene(new Scene(stage));
        primaryStage.show();
    }
}
