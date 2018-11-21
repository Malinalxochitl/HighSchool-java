import javax.swing.*;
import java.awt.*;     //import all the things
import java.awt.event.*;

public class SimpleFrame extends JFrame implements ActionListener { //extends JFrame is for the GUIs, ActionListener is for the button click ie. actionperformed methods
    private JPanel pane = new JPanel(); //this creates a panel ie. a text window, like a pop up
    private JLabel prompt = new JLabel("Press here for Go"); //creates a label which will say the string
    private JButton goButton = new JButton("GO"); //creates a button with some text on it. text is string
    private JTextField infield = new JTextField("Type Here"); //makes a text box with some default text in it
    public SimpleFrame(String title) { //the constructor
        setSize(400,200); //this sets the dimensions of the window
        setTitle(title); //<---title can be set manually.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //you need this in order for the person to press the x button and close the window, ending the program
        setVisible(true);  //put this here so the window will show up. always necessary
               
        add(pane); //makes it so you can add things to the pane (panel)
        pane.add(prompt); //adds the prompt (label) to the pane (panel)
        pane.add(goButton); //adds the button to the pane (panel)
        pane.add(infield); //adds the textbox to the pane (panel)
        goButton.addActionListener(this); //this is here to check for a button click
    }
    public void actionPerformed(ActionEvent e) { //this is for all action performed. in this case, a button click
        if (e.getSource() == goButton) { //if a button is pressed
            goButton.setText("Stop"); //changes the buttons text to stop
        }
    }
    public static void main(String args[]) { //main method
        SimpleFrame sf = new SimpleFrame("Simple Frame"); //simple frame object. The String is for the title of the window box, but you can just set it in the constructor manually.
    }
} 
