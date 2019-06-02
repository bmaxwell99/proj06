
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
    void getState();
}
