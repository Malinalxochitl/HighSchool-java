import javax.swing.*;
import java.awt.*;     //import
import java.awt.event.*;
public class Frame extends JFrame implements ActionListener {
    private JPanel pane = new JPanel();
    private JTextField day = new JTextField("Day");
    private JTextField month = new JTextField("Month"); //components
    private JButton button = new JButton("Go");
    private JLabel display = new JLabel();
    public Frame() { //constructor
        setSize(400,200); //window size
        setTitle("Find the day"); //window title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close
        setVisible(true); //visibility
        add(pane); //panel
        pane.add(day);
        pane.add(month); //adding components
        pane.add(button);
        pane.add(display);
        button.addActionListener(this); //button
    }
    public void actionPerformed(ActionEvent e) { //action button
        String value = day.getText();
        int day = (int) Double.parseDouble(value); //retrieves day
        value = month.getText();
        int month = (int) Double.parseDouble(value); //retrieves month
        int total = meh(month, day); //finds total days
        int remainder = total % 7; //finds remainder
        if (remainder == 0) {
            display.setText("Sunday");
        }
        else if (remainder == 1) {
            display.setText("Monday");
        }
        else if (remainder == 2) {
            display.setText("Tuesday");
        }
        else if (remainder == 3) {
            display.setText("Wednesday");               //display
        }
        else if (remainder == 4) {
            display.setText("Thursday");
        }
        else if (remainder == 5) {
            display.setText("Friday");
        }
        else {
            display.setText("Saturday");
        }
    }
    private int meh(int month, int total) { //this methods inds the total number of days
        while (month != 0) { //while there are still months to count
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){ //the months has 31 days
                total = total + 31; //adds days
                month = month - 1; //removes a month
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11) { //months that have 30 days
                total = total + 30; //adds days
                month = month - 1; //removes month 
            }
            else { //month that has 29 days
                total = total + 29; //adds days
                month = month - 1; //removes month
            }
        }
        return total;
    }
    public static void main(String args[]) { //main
        Frame sf = new Frame(); //calls constructor
    }
}