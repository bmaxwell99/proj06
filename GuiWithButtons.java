import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuiWithButtons extends JFrame {

    private Toolkit toolkit;

    public GuiWithButtons() {
        setTitle("Buttons");
        setSize(300, 200);
        toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation((size.width - getWidth())/2, (size.height - getHeight())/2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        // Add a panel to the frame, request absolute positioning of widgets
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

        // Create a Beep button, set its position, say what to do when it's clicked
        JButton beep = new JButton("Beep");
        beep.setBounds(150, 60, 80, 30);    // params:  x, y, width, height
        beep.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent event) {
                    toolkit.beep();
                }

            });

        // Create the Close button 
        JButton close = new JButton("Close");
        close.setBounds(50, 60, 80, 30);
        close.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    System.exit(0);
                }
            });

        // Add both buttons to the panel
        panel.add(beep);
        panel.add(close);
        setVisible(true);
    }

    public static void main(String[] args) {
        GuiWithButtons buttons = new GuiWithButtons();
        //buttons.setVisible(true);
    }
}