
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Main Application class which starts the JavaFX application
 *
 */
public class MainApplication extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    /**
     * This is where the JavaFX windows starts and stage is passed as argument
     * 
     * @param stage
     *          The primary stage of the JavaFX application
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Canvas Example");
        
        View view = new View();
        
        /* Create a new controller 
         * Do this after all the code in View has been finished
         */
        Controller controller = new Controller(view);
        
        primaryStage.setScene(view.getScene());
        primaryStage.show();        
    }
}
