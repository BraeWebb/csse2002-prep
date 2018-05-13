
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

/**
 * The Controller class for the GUI
 * <p>
 * Used to control the View depending on user input
 */
public class Controller {
    
    /* */
    private View view;
    
    /**
     * 
     */
    public Controller(View view) {
        this.view = view;
        view.addButtonHandler(new DrawHandler());
    }
    
    /**
     * 
     */
    private class DrawHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            
            /* Get the button which was just pressed */
            // TODO: code here
            Button pressedButton = (Button) event.getSource();
            
            /* the x and y coords which were entered */
            int xCoord, yCoord;
            
            /* Try to convert the given x and y coords to integers */
            /*
             * Get the input from X-Coord and Y-Coord input TextField
             * 
             * Try to convert them to integers, if you can't then set them to (0,0)
             * */
            try {
                xCoord = Integer.decode(view.getXCoord());
                yCoord = Integer.decode(view.getYCoord());
            } catch (NumberFormatException nfe) {
                xCoord = 0;
                yCoord = 0;
            }

            /* Draw the shape at the given x and y 
             * use view to draw the shape, view has methods which can do this
             */
            view.drawShape(pressedButton.getText(), xCoord, yCoord);
            
            /* Once the information from the text fields is used, clear them so that new ones can be used for next drawing*/
            /* use the view to do this, view has methods you can use */
            view.clearFields();
            
            /* Enter the information of the button which was just pressed */
            /* use the view to do this, view has methods you can use to achieve this */
            view.setPrevious(pressedButton.getText());
        }
        
    }
}
