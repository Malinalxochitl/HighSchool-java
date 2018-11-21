import javax.swing.*;
import java.awt.*; //imports
import java.awt.event.*;
import java.util.*;
public class GUI extends JFrame implements ActionListener { //A GUI window with an event that occurs
    private JPanel panel = new JPanel();
    private JButton button1 = new JButton("Left");        //components of window
    private JButton button2 = new JButton("Right");
    private JLabel label = new JLabel("");
    public GUI(String title) { //constructor
        setSize(400,200); //size of the window
        setTitle(title); //window title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //lets it close
        setVisible(true); //makes window visible
        add(panel); //allows components to be added
        panel.add(button1); //adds a button
        panel.add(button2); //adds another button
        panel.add(label); //adds a label
        button1.addActionListener(this);
        button2.addActionListener(this); //all buttons lead to same action
    }
    public void actionPerformed(ActionEvent e) { //action
        if (e.getSource() == button1) { //if a button is pressed
            label.setText(button1.getText()); //changes the label's text
        }
        else if (e.getSource() == button2) {
            label.setText(button2.getText()); //changes the label's text
        }
    }
    public static void main(String args[]) { //main
        GUI gui = new GUI("Displaying buttons"); //calls GUI
    }
}