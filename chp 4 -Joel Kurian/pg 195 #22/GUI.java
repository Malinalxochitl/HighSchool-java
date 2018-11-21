import javax.swing.*;
import java.awt.*; //imports
import java.awt.event.*;
import java.util.*;
public class GUI extends JFrame implements ActionListener { //A GUI window with an event that occurs
    private JPanel panel = new JPanel();
    private JButton button = new JButton("Small");        //components of window
    public GUI(String title) { //constructor
        setSize(300,200); //size of the window
        setTitle(title); //window title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //lets it close
        setVisible(true); //makes window visible
        add(panel); //allows components to be added
        panel.add(button); //adds a button
        button.addActionListener(this); //all buttons lead to same action
    }
    public void actionPerformed(ActionEvent e) { //action
        if (button.getText() == "Small") { //if it's small
            button.setText("Big"); //make s it big
            setSize(200,100);
        }
        else if (button.getText() == "Big") { //if its big
            button.setText("Small"); //make it small
            setSize(300,200);
        }
    }
    public static void main(String args[]) { //main
        GUI gui = new GUI("Changing size"); //calls GUI
    }
}