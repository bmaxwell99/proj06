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
    Canvas canvas;
    Graphics graphics;
    int canvasHeight;
    int canvasWidth;
    Subject subj;
    
    Display(Subject subj){
        canvas = new Canvas();
        this.subj = subj;
        
    }
    
    public void update(){
        
    }
    
    public void drawCircle(){
    }
    
    public void setCanvasHeight(int height){
        this.canvasHeight = height;
    }
    
    public void setCanvasWidth(int width){
        this.canvasWidth = width;
    }
    
}
