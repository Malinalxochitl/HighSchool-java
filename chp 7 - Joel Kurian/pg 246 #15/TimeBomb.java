import javax.swing.*;
import java.awt.*;
import java.awt.event.*; //imports
import java.util.*;
public class TimeBomb extends JFrame implements ActionListener { //class w/ extensions and impelements
    boolean letter_d = false;
    boolean letter_o = false; //letter statuses
    boolean letter_g = false;
    boolean letter_e = false;
    int timer = 6; //fuse
    private JPanel pane = new JPanel();
    private JLabel fuse = new JLabel("6");
    private JLabel word = new JLabel("* * * *"); //different components of window
    private JLabel result = new JLabel();
    private JButton goButton = new JButton("guess");
    private JTextField infield = new JTextField("enter text here");
    public TimeBomb(String title) { //constructor
        setSize(400,200); //size
        setTitle(title); //title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit operation
        setVisible(true); //visibility
        add(pane); //window
        pane.add(fuse);
        pane.add(word);
        pane.add(goButton); //puts components on the window
        pane.add(infield);
        pane.add(result);
        goButton.addActionListener(this); //button action
    }
    public void actionPerformed (ActionEvent e) { //button action
        String player_input = infield.getText(); //retreives info from text box
        char guess = player_input.charAt(0); //gets first character
        guess = Character.toLowerCase(guess); //makes it lowercase
        switch (guess) { //switch to see the character entered
            case 'd':
                letter_d = true; //makes d true
                break;
            case 'o':
                letter_o = true; //makes o true
                break;
            case 'g':
                letter_g = true; //makes g true
                break;
            case 'e':
                letter_e = true; //makes e true
                break;
            default:
                timer--; //shortens fuse
                break;
        }
        String time = "" + timer; //fuse display
        fuse.setText(time); //display
        String display = new String(); //winner display
        int winrar = 0; //checks for winner
        if (letter_d == true) {
            display = display + "d "; //shows a letter
            winrar++;
        }
        else {
            display = display + "* "; //shows asterisk
        }
        if (letter_o == true) {
            display = display + "o "; //shows letter
            winrar++;
        }
        else {
            display = display + "* ";
        }
        if (letter_g == true) {
            display = display + "g "; //shows letter
            winrar++;
        }
        else {
            display = display + "* ";
        }
        if (letter_e == true) {
            display = display + "e"; //shows letter
            winrar++;
        }
        else {
            display = display + "*";
        }
        word.setText(display);
        if (winrar == 4) { //if 4 letters are shown
            result.setText("Winner");
        }
        if (timer == 0) { //if timer is zero
            result.setText("You lose");
        }
    }
    public static void main (String args[]) { //main
        TimeBomb tb = new TimeBomb("Time Bomb"); //constructor call
    }
}
