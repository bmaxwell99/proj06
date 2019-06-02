import java.awt.Color;

/**
 * Write a description of class FractalElement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FractalElement
{
    private int centerX;
    private int centerY;
    private Color cactusColor;
    private Color pearColor;

    /**
     * FractalElement Constructor
     *
     * @param centerX A parameter
     * @param centerY A parameter
     * @param cactusColor A parameter
     * @param pearColor A parameter
     */
    public FractalElement(int centerX, int centerY, Color cactusColor, Color pearColor){     
        this.centerX = centerX;
        this.centerY = centerY;
        this.cactusColor = cactusColor;
        this.pearColor = pearColor;
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

    public Color getCactusColor(){
        return cactusColor;
    }

    public Color getPearColor(){
        return pearColor;
    }

}
