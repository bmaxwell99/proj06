import java.awt.Color;
import java.awt.Graphics;

/**
 * Write a description of interface FractalElement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface FractalElement
{
    /**
     * Method getCenterX
     *
     * @return The return value
     */
    public int getCenterX();
    public int getCenterY();
    public Color getColor();
    public void draw(Graphics graphics);
}
