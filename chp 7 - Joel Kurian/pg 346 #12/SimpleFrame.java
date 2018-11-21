import javax.swing.*;
import java.awt.*;     //import all the things
import java.awt.event.*;
public class SimpleFrame extends JFrame implements ActionListener {
    private JPanel pane = new JPanel();
    private JLabel prompt = new JLabel("Enter a string to check for a palindrome");
    private JButton goButton = new JButton("GO");
    private JTextField infield = new JTextField("Type Here");
    private JLabel finale = new JLabel();
    public SimpleFrame() {
        setSize(400,200);
        setTitle("Palindrome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);    
        add(pane);
        pane.add(prompt);
        pane.add(goButton);
        pane.add(infield);
        pane.add(finale);
        goButton.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        String a = infield.getText();
        int min = 0;
        int max = (a.length() - 1);
        boolean result = true;
        for (;min <= max;min++, max--) {
            if (a.charAt(min) != a.charAt(max)) {
                result = false;
            }
        }
        if (result = true) {
            finale.setText("It's a palindrome");
        }
        else {
            finale.setText("It's not a palindrome");
        }
    }
    public static void main(String args[]) { //main method
        SimpleFrame sf = new SimpleFrame();
    }
}