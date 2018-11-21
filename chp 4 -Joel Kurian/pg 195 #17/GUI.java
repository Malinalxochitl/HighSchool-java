import javax.swing.*;
import java.awt.*; //imports
import java.awt.event.*;
import java.util.*;
public class GUI extends JFrame implements ActionListener { //A GUI window with an event that occurs
    private JPanel panel = new JPanel();
    private JButton button = new JButton("The doctor is in");        //components of window
    int choice = 0; //instace variable
    public GUI(String title) { //constructor
        setSize(400,200); //size of the window
        setTitle(title); //window title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //lets it close
        setVisible(true); //makes window visible
        add(panel); //allows components to be added
        panel.add(button); //creates the window
        button.addActionListener(this); //button effect
    }
    public void actionPerformed(ActionEvent e) { //action
        if (e.getSource() == button) {
            if (choice == 0) { //checks for current statement
                button.setText("The doctor is out"); //changes text
                choice = 1; //changes counter
            }
            else {
                button.setText("The doctor is in"); //changes text
                choice = 0; //changes counter
            }
        }
    }
    public static void main(String args[]) { //main
        GUI gui = new GUI("What is the doctor?"); //calls GUI
    }
}