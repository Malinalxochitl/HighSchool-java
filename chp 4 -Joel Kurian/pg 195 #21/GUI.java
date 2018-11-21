import javax.swing.*;
import java.awt.*; //imports
import java.awt.event.*;
import java.util.*;
public class GUI extends JFrame implements ActionListener { //A GUI window with an event that occurs
    private JPanel panel = new JPanel();
    private JButton button1 = new JButton("Small");        //components of window
    private JButton button2 = new JButton("Big");
    public GUI(String title) { //constructor
        setSize(300,200); //size of the window
        setTitle(title); //window title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //lets it close
        setVisible(true); //makes window visible
        add(panel); //allows components to be added
        panel.add(button1); //adds a button
        panel.add(button2); //adds another button
        button1.addActionListener(this);
        button2.addActionListener(this); //all buttons lead to same action
    }
    public void actionPerformed(ActionEvent e) { //action
        if (e.getSource() == button1) { //if a button is pressed
            setSize(200,100); //makes it small
        }
        else if (e.getSource() == button2) {
            setSize(300,200); //makes it big
        }
    }
    public static void main(String args[]) { //main
        GUI gui = new GUI("Changing size"); //calls GUI
    }
}