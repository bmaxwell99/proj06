
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
   
    
    public static void Main(String[] args){
         GenerateFractal genFract = new GenerateFractal();
         GUI gui = new GUI(genFract);
         Display display = new Display(genFract);
         genFract.attach(display);


         
        
    }
}
