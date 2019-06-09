import java.util.ArrayList;
import java.awt.Color;

/**
 * Write a description of class GenerateFractal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GenerateFractal implements Subject
{
    ArrayList<FractalElement> fractalData;
    ArrayList<Observer> observerList;

    int recDepth;
    int radiusRatio;
    Color cactusColor;
    Color pearColor;
    
    static final int DEFAULT_CIRCLE_RAIDUS = 200;
    static final int DEFAULT_CENTER_X = 300;
    static final int DEFAULT_CENTER_Y = 600;    

    public GenerateFractal(){
        fractalData = new ArrayList<FractalElement>();
        observerList = new ArrayList<Observer>();

    }
    
    public void setData(int recDepth, int radiusRatio, Color cactusColor, Color pearColor){
        this.recDepth = recDepth;
        this.radiusRatio = radiusRatio;
        this.cactusColor = cactusColor;
        this.pearColor = pearColor;
    }

    public ArrayList<FractalElement> getData(){
  
        return drawCircle(DEFAULT_CENTER_X, DEFAULT_CENTER_Y, Math.PI/2, recDepth, DEFAULT_CIRCLE_RAIDUS);
    }
    
    private ArrayList<FractalElement> drawCircle(int cX, int cY, double o, int rD, int r){
        if(rD != 1){
              fractalData.add(new Circle(cX, cY, r, cactusColor));
              System.out.println(radiusRatio / 100);
              drawCircle(cX - (int)((r * (radiusRatio / 100)) * Math.cos(o)), cY + (int)((r * (radiusRatio / 100)) * Math.sin(o)), o - Math.PI/4, rD -1, radiusRatio / 100);
              //drawCircle(cX * 2, cY * 2, o + Math.PI/4, rD -1, r * (radiusRatio / 100));
        }
        fractalData.add(new Circle(cX, cY, r, pearColor));
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
