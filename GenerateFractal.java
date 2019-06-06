import java.util.ArrayList;
import java.awt.Color;

/**
 * Write a description of class GenerateFractal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GenerateFractal implements Subject, Observer
{
    ArrayList<FractalElement> fractalData;
    ArrayList<Observer> observerList;
    
    int recDepth;
    int radiusRatio;
    Color cactusColor;
    Color pearColor;
    
    public GenerateFractal(){
        fractalData = new ArrayList<FractalElement>();
        observerList = new ArrayList<Observer>();
        
    }
    
    public void setData(int recDepth, int radiusRatio, Color cactusColor, Color pearColor){
        
    }
    
    public ArrayList<FractalElement> getData(){
        return fractalData;
    }
    
    public boolean attach(Observer obs){
        observerList.add(obs);
        return true;
    }
    
    public boolean detach(Observer obs){
        observerList.remove(obs);
        return true;
    }
    
    public boolean notifyAllObservers(){
        if(observerList.size() == 0){
            return false;
        }
        for( Observer element : observerList){
            element.update();
        }
        return true;
    }
    
    
     public void update(){
        
    }
    
    
   public int getRecDepth(){
       return recDepth;
    }
    
    public int getRadiusRatio(){
        return radiusRatio;
    }
    
    public Color getCactusColor(){
        return cactusColor;
    }
    
    public Color getPearColor(){
        return pearColor;
    }
    
    
}
