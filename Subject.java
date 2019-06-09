import java.awt.Color;
import java.util.ArrayList;

/**
 * Write a description of interface subject here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Subject
{
    boolean attach(Observer obs);
    boolean detach(Observer obs);
    boolean notifyAllObservers();
    public void setData(int recDepth, int radiusRatio, Color cactusColor, Color pearColor);
    ArrayList<FractalElement> getData();
}
