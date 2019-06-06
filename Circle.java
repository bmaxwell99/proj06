import java.awt.Color;
import java.awt.Graphics;

/**
 * Write a description of class FractalElement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle implements FractalElement
{
    private int centerX;
    private int centerY;
    private Color color;
    private int radius;

    /**
     * FractalElement Constructor
     *
     * @param centerX A parameter
     * @param centerY A parameter
     * @param cactusColor A parameter
     * @param pearColor A parameter
     */
    public Circle(int centerX, int centerY, int radius, Color color){     
        this.centerX = centerX;
        this.centerY = centerY;
        this.color = color;
        this.radius = radius;
    }

    /**
     * Method getCenterX
     *
     * @return The return value
     */
    public int getCenterX(){
        return centerX;
    }

    public int getCenterY(){
        return centerY;
    }

    public Color getColor(){
        return color;
    }
    
    public void draw(Graphics graphics){
    }

    public int getRadius(){
        return radius;
    }
}
