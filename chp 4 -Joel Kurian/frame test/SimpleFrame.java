import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleFrame extends JFrame implements ActionListener {
    // instance variables
    private JPanel pane = new JPanel();
    private JLabel prompt = new JLabel("Press here for Go");
    private JButton goButton = new JButton("GO");
    private JTextField infield = new JTextField("Type Here");
        
    /**
     * Constructor for objects of class SimpleFrame
     *
     */
    public SimpleFrame(String title)
    {
        // set window size and stuff
        setSize(400,200);
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);  //Displays the JFrame - default is invisible
               
        add(pane);
        pane.add(prompt);
        pane.add(goButton);
        pane.add(infield);
        goButton.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == goButton) {
            goButton.setText("Stop");
        }
    }
    public static void main(String args[])
    {
        // create new instance of SimpleFrame entitled sf
        SimpleFrame sf = new SimpleFrame("Simple Frame");
    }
} 
