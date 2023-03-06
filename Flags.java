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
        UI.addButton("flag time B-)", this::drawFlags);
        UI.addButton("bye bye~", UI::quit); 
    }

    /**
     * draw 3 stripe flag 
     * here the stripes will be the same size 
     */
    public void doDrawThreeStripeFlagY(double left, double top, double width, double height) {
        // test
        final int LINEWIDTH = 2;
        
        // draw vertical flag
        //  stripe 1 
        UI.setColor(Color.red);
        UI.setLineWidth(LINEWIDTH);
        UI.fillRect(left, top, width, height);
        
        left += width;  
        
        //  stripe 2 
        UI.setColor(Color.white);
        UI.setLineWidth(LINEWIDTH);
        UI.fillRect(left, top, width, height);
        
        left += width;
        
        // stripe 3 
        UI.setColor(Color.blue);
        UI.setLineWidth(LINEWIDTH);
        UI.fillRect(left, top, width, height);
        
        } 
    
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
        UI.fillRect(left, 200, width, height);
        
        top += height;
        
        // horizontal stripe 3 
        UI.setColor(color3);
        UI.setLineWidth(LINEWIDTH);
        UI.fillRect(left, top, width, height);

        }
    
    public void drawFlag() {
        int left = 0;
        int top = 0;
        int width = 2000;
        int height = 100; 
        
        UI.setColor(Color.red);
        UI.setLineWidth(2);
        UI.fillRect(left, top, width, height);
        
        top += height;
        
        UI.setColor(Color.white);
        UI.setLineWidth(2);
        UI.fillRect(left, top, width, height);
        
        top += height;
        
        UI.setColor(Color.blue);
        UI.setLineWidth(2);
        UI.fillRect(left, top, width, height);
        
        top += height;
        
        UI.setColor(Color.white);
        UI.setLineWidth(2);
        UI.fillRect(left, top, width, height);
        
        top += height;
        
        UI.setColor(Color.red);
        UI.setLineWidth(2);
        UI.fillRect(left, top, width, height);
        
    }
    
    public void drawFlags(){
        //doDrawThreeStripeFlagY(0, 100, 200, 100);
        doDrawThreeStripesX(0, 0, 2000, 200, Color.red, Color.white, Color.blue);
        
        //drawFlag();
    } 
}
