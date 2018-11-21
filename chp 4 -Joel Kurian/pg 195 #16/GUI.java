import javax.swing.*;
import java.awt.*; //imports
import java.awt.event.*;
import java.util.*;
public class GUI extends JFrame implements ActionListener {
    private JPanel panel = new JPanel();
    private JLabel label = new JLabel("Enter a number");
    private JButton button = new JButton("Enter");        //components of window
    private JTextField textbox = new JTextField("enter here");
    public GUI() {
        setSize(400,200); //size of the window
        setTitle("Default Window"); //window title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //lets it close
        setVisible(true); //makes window visible
        add(panel);
        panel.add(label);
        panel.add(button); //creates the window
        panel.add(textbox);
        button.addActionListener(this); //button effect
    }
    public void actionPerformed(ActionEvent e) { //action
        if (e.getSource() == button) {
            System.out.println("The label is " + label.toString());
            System.out.println("The text field is " + textbox.toString()); //display
            System.out.println("The button is " + button.toString());
        }
    }
    public static void main(String args[]) { //main
        GUI gui = new GUI(); //calls GUI
    }
}