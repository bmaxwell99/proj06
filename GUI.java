import javax.swing.JButton;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JColorChooser;
import javax.swing.JTextField;
import java.awt.Color;

/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GUI extends JFrame 
{
    private Subject subj;
    private JButton drawButton;

    int recDepth;
    int radiusRatio;
    Color cactusColor;
    Color pearColor;
    
    static final int REC_DEPTH_MIX = 2;
    static final int REC_DEPTH_MAX = 10;
    static final int RADIUS_RATIO_MIN = 40;
    static final int RADIUS_RATIO_MAX = 70;

    private Toolkit toolkit;

    public GUI(Subject subj){
        this.subj = subj;

        //arbitray values to test connections
        recDepth = 5;
        radiusRatio = 50;
        cactusColor = new Color(150, 150, 150);
        pearColor = new Color(50,50,50);

        setTitle("GUI");
        setSize(500, 300);
        toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation((size.width - getWidth())/2, (size.height - getHeight())/2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);

        JPanel panel = new JPanel();
        getContentPane().add(panel);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS ));

        //create the widgets
        JButton btnCactusColor = new JButton("Cactus Color...");
        JButton btnPearColor = new JButton("Pear Color...");
        JLabel lblRecDepth = new JLabel("Recursion Depth:");
        JSlider slidRecDepth = new JSlider(REC_DEPTH_MIX, REC_DEPTH_MAX);
        JTextField txtRecDepth = new JTextField(1);
        JLabel lblRadiusRatio = new JLabel("Radius Ratio:");
        JLabel lblDraw = new JLabel("When you're ready...");
        JSlider slidRadiusRatio = new JSlider(RADIUS_RATIO_MIN, RADIUS_RATIO_MAX);
        JTextField txtRadiusRatio = new JTextField(1);
        
        JButton btnDraw = new JButton("Draw?");

        //tool the widgets
        slidRecDepth.setPaintLabels(true);
        slidRecDepth.setPaintTicks(true);
        slidRecDepth.setMajorTickSpacing(1);
        slidRecDepth.setLabelTable(slidRecDepth.createStandardLabels(1));
        slidRecDepth.setOrientation(JSlider.HORIZONTAL);
        
        slidRadiusRatio.setPaintLabels(true);
        slidRadiusRatio.setPaintTicks(true);
        slidRadiusRatio.setMajorTickSpacing(5);
        slidRadiusRatio.setLabelTable(slidRadiusRatio.createStandardLabels(5));
        slidRadiusRatio.setOrientation(JSlider.HORIZONTAL);


        //add the widgets
        panel.add(lblRecDepth);
        panel.add(slidRecDepth);
        panel.add(lblRadiusRatio);
        panel.add(slidRadiusRatio);
        panel.add(btnCactusColor);
        panel.add(btnPearColor);

        panel.add(lblDraw);
        panel.add(btnDraw);

        btnCactusColor.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    JColorChooser clr = new JColorChooser();
                    cactusColor = clr.showDialog(panel, "Choose cactus color", new Color(0,0,0));
                    btnCactusColor.setBackground(cactusColor);
                }
            }

        );

        btnPearColor.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    JColorChooser clr = new JColorChooser();
                    pearColor = clr.showDialog(panel, "Choose pear color", new Color(0,0,0));
                    btnPearColor.setBackground(pearColor);

                }
            }
        );

        btnDraw.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event){
                    subj.setData(recDepth, radiusRatio, cactusColor, pearColor);
                    subj.notifyAllObservers();
                }
            }
        );

        slidRecDepth.addChangeListener(new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    recDepth = slidRecDepth.getValue();
                }
            }
        );

        slidRadiusRatio.addChangeListener(new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    radiusRatio = slidRadiusRatio.getValue();
                }
            }
        );

        
        setVisible(true);         
        
        
       
    }

}
