import javax.swing.*;
import java.awt.*;     //import all the things
import java.awt.event.*;
public class Frame extends JFrame implements ActionListener {
    private JPanel pane = new JPanel();
    private JButton button1 = new JButton("Kilometers"); //components
    private JButton button2 = new JButton("Miles");
    private JTextField field = new JTextField("Enter text here");
    public Frame() { //constructor
        setSize(400,200);
        setTitle("Kilo to Mile"); //size/title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //lets it close
        setVisible(true); //makes it visible
        add(pane); //pane - foundation
        pane.add(button1);
        pane.add(button2); //buttons
        pane.add(field); //text box
        button1.addActionListener(this); //button actions
        button2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) { //button clicks
        if (e.getSource() == button1) { //click to km
            String value = field.getText(); //retrieves value
            double base = Double.parseDouble(value); //makes double
            double km = base * 1.60934; //convert
            value = Double.toString(km); //makes string
            field.setText(value); //output
        }
        if (e.getSource() == button2) { //click to miles
            String value = field.getText(); //retrieves value
            double base = Double.parseDouble(value); //makes double
            double miles = base * 0.621371; //convert
            value = Double.toString(miles); //makes string
            field.setText(value); //output
        }
    }
    public static void main(String args[]) { //main
        Frame sf = new Frame(); //calls constructor
    }
}