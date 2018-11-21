import javax.swing.*;
import java.awt.*;     //import
import java.awt.event.*;
import static java.lang.Math.*;
import java.text.NumberFormat;
public class Frame extends JFrame implements ActionListener {
    private JPanel pane = new JPanel();
    private JButton button = new JButton("Go");
    private JTextField principle = new JTextField("Enter Principle here"); //components
    private JTextField interest = new JTextField("Enter Interest here");
    private JTextField years = new JTextField("Enter years here");
    private JLabel display1 = new JLabel();
    private JLabel display2 = new JLabel();
    private NumberFormat dollars = NumberFormat.getCurrencyInstance(); //formatting
    public Frame() {
        setSize(400,200); //window size
        setTitle("CD Maturity"); //window title
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close the window
        setVisible(true); //makes it visible
        add(pane); //panel
        pane.add("Center", button);
        pane.add("North", principle);
        pane.add("North", interest);
        pane.add("North", years);    //components
        pane.add("South", display1);
        pane.add("South", display2);
        button.addActionListener(this); //action button
    }
    public void actionPerformed(ActionEvent e) { //action button
        String value = principle.getText();
        double principle = Double.parseDouble(value); //retrieves principle
        value = interest.getText();
        double interest = Double.parseDouble(value); //retrieves interest
        if (interest >= 1) {
            interest = interest / 100;
        }
        value = years.getText();
        int years = (int) (Double.parseDouble(value)); //retrieves years
        double yearly = principle * Math.pow(1 + interest, years); //sets yearly
        double daily = principle * Math.pow(1 + interest / 365, years * 365); //sets daily
        display1.setText("The yearly is " + dollars.format(yearly)); //display w/ formatting
        display2.setText("The daily is " + dollars.format(daily));
    }
    public static void main(String args[]) { //main
        Frame sf = new Frame(); //calls constructor
    }
}
