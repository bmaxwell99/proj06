import javax.swing.JButton;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;


/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GUI extends JFrame implements Subject
{
   private Subject subj;
   private JButton drawButton;
   private ArrayList<Observer> observerList;
   
   private Toolkit toolkit;
   
   public GUI(Subject subj){
       this.subj = subj;
       this.observerList = new ArrayList<Observer>();
       
        setTitle("GUI");
        setSize(600, 500);
        toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation((size.width - getWidth())/2, (size.height - getHeight())/2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS ));
        

        //create the button
        
         JButton btnCactusColor = new JButton("Cactus Color...");
         JLabel lblRecDepth = new JLabel("Recursion Depth:");
         JSlider slidRecDepth = new JSlider(-360, 360);
         
        slidRecDepth.setMajorTickSpacing(90);
        slidRecDepth.setMinorTickSpacing(15);
        slidRecDepth.setOrientation(JSlider.HORIZONTAL);
        slidRecDepth.setPaintLabels(false);
        slidRecDepth.setPaintTicks(true);
        slidRecDepth.setMajorTickSpacing(90);
        slidRecDepth.setMinorTickSpacing(15);
        slidRecDepth.setOrientation(JSlider.HORIZONTAL);
        slidRecDepth.setPaintLabels(false);
        slidRecDepth.setPaintTicks(true);
         
        panel.add(lblRecDepth);
         panel.add(slidRecDepth);
         panel.add(btnCactusColor);        
         
         
         setVisible(true);         
         
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

    
}
