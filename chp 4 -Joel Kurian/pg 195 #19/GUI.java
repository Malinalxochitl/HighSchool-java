import javax.swing.*;
import java.awt.*; //imports
import java.awt.event.*;
import java.util.*;
public class GUI extends JFrame implements ActionListener { //A GUI window with an event that occurs
    private JPanel panel = new JPanel();
    private JButton button1 = new JButton("Me first!");        //components of window
    private JButton button2 = new JButton("Me second!");
    private JButton button3 = new JButton("Me third!");
    String temp;
    public GUI(String title) { //constructor
        setSize(400,200); //size of the window
        setTitle(title); //window title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //lets it close
        setVisible(true); //makes window visible
        add(panel); //allows components to be added
        panel.add(button1); //adds a button
        panel.add(button2); //adds another button
        panel.add(button3); //buttonssssss
        button1.addActionListener(this);
        button2.addActionListener(this); //all buttons lead to same action
        button3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) { //action
        temp = button1.getText(); //button1 text stored in temp holder
        button1.setText(button3.getText()); //button1 is set to button3's text
        button3.setText(button2.getText()); //button3 is set to button2's text
        button2.setText(temp); //button2 is set to the temp text
    }
    public static void main(String args[]) { //main
        GUI gui = new GUI("Clicking buttons"); //calls GUI
    }
}