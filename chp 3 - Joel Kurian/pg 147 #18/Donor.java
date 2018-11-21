import java.util.Scanner; //scanner class
public class Donor { //sets and gets the info
    private String donor_name; //insatnce variables
    private String donor_rating;
    public Donor(String x, String y) { //constructor
        donor_name = x;
        donor_name = y;
    }
    public void get_info() { //retrieves info form user
        System.out.println("Enter the donor name: ");
        Scanner sc = new Scanner(System.in); //scanner object
        sc = sc.useDelimiter("\n");
        donor_name = sc.next(); //retrieves donor name
        System.out.println("Enter a rating for the donor:");
        System.out.println("1) High");
        System.out.println("2) Medium"); //display
        System.out.println("3) Low");
        donor_rating = sc.next(); //retrieves rating
        while (!donor_rating.equals("High") && !donor_rating.equals("Medium") && !donor_rating.equals("Low")){ //failsafe for incorrect rating
            System.out.println("Enter a valid rating: ");
            donor_rating = sc.next();
        }
    }
    public void set_info() { //displays info from user
        System.out.println("The name of the donor is " + donor_name);
        System.out.println("The rating of the donor is " + donor_rating); //display
    }
}