import javax.swing.*;
import java.awt.*;     //imports
import java.awt.event.*;
public class Pally extends JFrame implements ActionListener { //frame and action extension
    private JPanel pane = new JPanel(); //panel
    private JLabel prompt = new JLabel("Enter a string to check for a palindrome"); //display prompt
    private JButton goButton = new JButton("GO"); //button
    private JTextField infield = new JTextField("Type Here"); //text box
    private JLabel finale = new JLabel(); //display for result
    public Pally() { //information for the GUI
        setSize(400,200); //sizee
        setTitle("Palindrome"); //title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closing operation
        setVisible(true); //makes the GUI visible
        add(pane); //pane foundation
        pane.add(prompt); //adds the components to the pane
        pane.add(goButton);
        pane.add(infield);
        pane.add(finale);
        goButton.addActionListener(this); //button method
    }
    public void actionPerformed(ActionEvent e) { //button method
        String a = infield.getText(); //string
        int min = 0; //min index
        int max = (a.length() - 1); //max index
        boolean blech = true; //default result
        for (;min <= max;min++, max--) { //checks each character
            if (a.charAt(min) != a.charAt(max)) { //if the character isn't the same
                blech = false; //changes the result
            }
        }
        if (blech == true) { //display depending on the result
            finale.setText("It's a palindrome");
        }
        else {
            finale.setText("It's not a palindrome");
        }
    }
    public static void main(String args[]) { //main method
        Pally sf = new Pally(); //calls constructor for GUI
    }
}