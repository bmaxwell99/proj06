import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.Color;
import java.util.ArrayList;



/**
 * Write a description of class Display here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Display implements Observer
{
    
    Subject subj;
    ArrayList<FractalElement> fractalData;
    
    static final int CANVAS_HEIGHT = 800;
    static final int CANVAS_WIDTH = 800;
    
    
    Display(Subject subj){
        this.subj = subj;
        
    }
    
    public void update(){
        fractalData = subj.getData();
        this.draw();
    }
    
    public void draw(){
        DrawingPanel panel = new DrawingPanel(CANVAS_WIDTH,CANVAS_HEIGHT);
        Graphics graphics = panel.getGraphics();
        for(FractalElement fe : fractalData){
            fe.draw(graphics);
        }
    }
    

}
