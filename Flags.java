import ecs100.*;
import java.awt.Color;
/**
 * Write a description of class Flags here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Flags
{
    // instance variables 

    /**
     * Constructor for objects of class Flags
     */
    public Flags()
    {
        // initialise instance variables
        UI.initialise(); // bring up ecs100 canvas
        UI.addButton("flag time B-)", this::drawFlag);
        UI.addButton("bye bye~", UI::quit); 
    }

    public void drawFlag() {
        // draw thai flag 
        
        // for each stripe 
            // horizontal position (left) 
            // vertical position (top)
            // lenght (width) 
            // height 
            
        // for horizontal flags, the left position of all stripes is the same
        // with the vertical being under the previous stripe 
        // vertical flags is the opposite 
        
        UI.setColor(Color.red);
        UI.setLineWidth(2);
        UI.fillRect(0, 0, 200, 100);
        
        UI.setColor(Color.white);
        UI.setLineWidth(2);
        UI.fillRect(0, 100, 2000, 100);
        
        UI.setColor(Color.blue);
        UI.setLineWidth(2);
        UI.fillRect(0, 200, 2000, 200);
        
        UI.setColor(Color.white);
        UI.setLineWidth(2);
        UI.fillRect(0, 400, 2000, 100);
        
        UI.setColor(Color.red);
        UI.setLineWidth(2);
        UI.fillRect(0, 500, 2000, 100);
        
    }
}
