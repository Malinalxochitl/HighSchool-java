import javax.swing.*;
import java.awt.*; //imports
import java.awt.event.*;
import java.util.*;
public class GUI extends JFrame implements ActionListener { //A GUI window with an event that occurs
    private JPanel panel = new JPanel();
    private JButton button1 = new JButton("pink");        //components of window
    private JButton button2 = new JButton("black");
    private JButton button3 = new JButton("green");
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
        if (e.getSource() == button1) {
            panel.setBackground(Color.pink); //changes background to pink
        }
        else if (e.getSource() == button2) {
            panel.setBackground(Color.black); //changes background to black
        }
        else if (e.getSource() == button3) {
            panel.setBackground(Color.green); //changes background to green
        }
    }
    public static void main(String args[]) { //main
        GUI gui = new GUI("Clicking buttons"); //calls GUI
    }
}