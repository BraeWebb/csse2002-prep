import java.util.concurrent.atomic.AtomicInteger;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Set the title of the window
        primaryStage.setTitle("Hello World");

        // Set application layout
        VBox stage = new VBox();
        stage.setPadding(new Insets(50));
        stage.setSpacing(50);
        stage.setAlignment(Pos.CENTER);

        // Create a button
        Button button = new Button();
        button.setText("Press Me");

        // Create a label
        Label label = new Label();
        label.setText("Button pressed 0 times");
        AtomicInteger pressed = new AtomicInteger(1);

        // Add button callback
        button.setOnAction((event) -> {
            int count = pressed.getAndIncrement();
            String times = count == 1 ? " time" : " times";
            label.setText("Button pressed " + count + times);
            label.autosize();
        });

        // Add widgets to the stage
        stage.getChildren().add(button);
        stage.getChildren().add(label);

        // Display the window
        primaryStage.setScene(new Scene(stage));
        primaryStage.show();
    }
}
