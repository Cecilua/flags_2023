import ecs100.*;
import java.awt.Color;
/**
 * Draws 3 striped flags
 *
 * @author CC
 * @version 06/03/23
 */
public class Flags
{
    /**
     * Constructor for objects of class Flags
     */
    public Flags()
    {
        // initialise instance variables
        UI.initialise(); // bring up ecs100 canvas
        UI.addButton("flag time B-)", this::drawFlags);
        UI.addButton("bye bye~", UI::quit); 
    }

    /**
     * draw vertical 3 stripe flag 
     * here the stripes will be the same size 
     */
    public void doDrawThreeStripesY(double left, double top, double width, double height, Color color1, Color color2, Color color3) {
        // linewidth is a constant 
        final int LINEWIDTH = 2;
        
        // vertical stripe 1 
        UI.setColor(color1);
        UI.setLineWidth(LINEWIDTH);
        UI.fillRect(left, top, width, height);
        
        left += width; 
        
        // vertical stripe 2 
        UI.setColor(color2);
        UI.setLineWidth(LINEWIDTH);
        UI.fillRect(left, 200, width, height);
        
        left += width;
        
        // vertical stripe 3 
        UI.setColor(color3);
        UI.setLineWidth(LINEWIDTH);
        UI.fillRect(left, top, width, height);
        
    } 
    
    /**
     * draw horizontal 3 stripe flag 
     * here all stripes are the same size
     */
    public void doDrawThreeStripesX(double left, double top, double width, double height, Color color1, Color color2, Color color3) {
        // linewidth is a constant 
        final int LINEWIDTH = 2;
        
        // horizontal stripe 1 
        UI.setColor(color1);
        UI.setLineWidth(LINEWIDTH);
        UI.fillRect(left, top, width, height);
        
        top += height; 
        
        // horizontal stripe 2 
        UI.setColor(color2);
        UI.setLineWidth(LINEWIDTH);
        UI.fillRect(left, top, width, height);
        
        top += height;
        
        // horizontal stripe 3 
        UI.setColor(color3);
        UI.setLineWidth(LINEWIDTH);
        UI.fillRect(left, top, width, height);

    }
    
    /**
     * run the draw three stripe functions to actually draw some flags 
     */
    public void drawFlags(){
        // france
        doDrawThreeStripesY(0, 200, 100, 150, Color.blue, Color.white, Color.red);
        
        // romania 
        doDrawThreeStripesY(350, 200, 100, 150, Color.blue, Color.yellow, Color.red);
        
        //germany 
        doDrawThreeStripesX(0, 0, 300, 50, Color.black, Color.red, Color.yellow);
        
        // austria
        doDrawThreeStripesX(350, 0, 300, 50, Color.red, Color.white, Color.red);
        
    } 
}
