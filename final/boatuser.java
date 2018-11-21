import java.util.*;
import static java.lang.Math.*; //imports
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.*;
public class boatuser { //class
    public static void main(String args[]) { //
        System.out.println("Welcome to the boat shop!\n"); //display
        long array[][] =  {{621, 1, 1, 1, 1, 1}, //array
                           {622, 1, 1, 1, 1, 1},
                           {623, 1, 1, 1, 1, 1},
                           {624, 1, 1, 1, 1, 1},
                           {625, 1, 1, 1, 1, 1},
                           {626, 1, 1, 1, 1, 1},
                           {627, 1, 1, 1, 1, 1},
                           {628, 1, 1, 1, 1, 1},
                           {629, 1, 1, 1, 1, 1},
                           {630, 1, 1, 1, 1, 1},
                           {701, 1, 1, 1, 1, 1},
                           {702, 1, 1, 1, 1, 1},
                           {703, 1, 1, 1, 1, 1},
                           {704, 1, 1, 1, 1, 1},
                           {705, 1, 1, 1, 1, 1},
                           {706, 1, 1, 1, 1, 1},
                           {707, 1, 1, 1, 1, 1},
                           {708, 1, 1, 1, 1, 1},
                           {709, 1, 1, 1, 1, 1},
                           {710, 1, 1, 1, 1, 1},
                           {711, 1, 1, 1, 1, 1},
                           {712, 1, 1, 1, 1, 1},
                           {713, 1, 1, 1, 1, 1},
                           {714, 1, 1, 1, 1, 1},
                           {715, 1, 1, 1, 1, 1},
                           {716, 1, 1, 1, 1, 1},
                           {717, 1, 1, 1, 1, 1},
                           {718, 1, 1, 1, 1, 1},
                           {719, 1, 1, 1, 1, 1},
                           {720, 1, 1, 1, 1, 1},
                           {721, 1, 1, 1, 1, 1},
                           {722, 1, 1, 1, 1, 1},
                           {723, 1, 1, 1, 1, 1},
                           {724, 1, 1, 1, 1, 1},
                           {725, 1, 1, 1, 1, 1},
                           {726, 1, 1, 1, 1, 1},
                           {727, 1, 1, 1, 1, 1},
                           {728, 1, 1, 1, 1, 1},
                           {729, 1, 1, 1, 1, 1},
                           {730, 1, 1, 1, 1, 1},
                           {731, 1, 1, 1, 1, 1},
                           {801, 1, 1, 1, 1, 1},
                           {802, 1, 1, 1, 1, 1},
                           {803, 1, 1, 1, 1, 1},
                           {804, 1, 1, 1, 1, 1},
                           {805, 1, 1, 1, 1, 1},
                           {806, 1, 1, 1, 1, 1},
                           {807, 1, 1, 1, 1, 1},
                           {808, 1, 1, 1, 1, 1},
                           {809, 1, 1, 1, 1, 1},
                           {810, 1, 1, 1, 1, 1},
                           {811, 1, 1, 1, 1, 1},
                           {812, 1, 1, 1, 1, 1},
                           {813, 1, 1, 1, 1, 1},
                           {814, 1, 1, 1, 1, 1},
                           {815, 1, 1, 1, 1, 1},
                           {816, 1, 1, 1, 1, 1},
                           {817, 1, 1, 1, 1, 1},
                           {818, 1, 1, 1, 1, 1},
                           {819, 1, 1, 1, 1, 1},
                           {820, 1, 1, 1, 1, 1},
                           {821, 1, 1, 1, 1, 1},
                           {822, 1, 1, 1, 1, 1},
                           {823, 1, 1, 1, 1, 1},
                           {824, 1, 1, 1, 1, 1},
                           {825, 1, 1, 1, 1, 1},
                           {826, 1, 1, 1, 1, 1},
                           {827, 1, 1, 1, 1, 1},
                           {828, 1, 1, 1, 1, 1},
                           {829, 1, 1, 1, 1, 1},
                           {830, 1, 1, 1, 1, 1},
                           {831, 1, 1, 1, 1, 1},
                           {901, 1, 1, 1, 1, 1}};
        String boats[] = {"SS Marmalade", "SS Vegtable", "SS hurkadurk", "SS ploops", "SS rustledjimmies\n"}; //boat selection
        Scanner sc = new Scanner(System.in); //scanner object
        NumberFormat formatter = NumberFormat.getCurrencyInstance(); //currency display
        boat Boat = new boat(); //constructor call
        int boat_choice = -1;
        boolean again = true;
        int startMonth = 0;
        int startDay = 0;
        int endMonth = 0;
        int endDay = 0;
        int days = 0;
        double price;
        char goAgain;
        char confirm;                        //instance variables
        int startDate = 0;
        int endDate = 0;
        int count = 0;
        int subStart = -1;
        int subEnd = -1;
        int changeChoice;
        boolean availability;
        boolean changeBoat = true;
        boolean changeDate = true;
        System.out.println("What is your name?"); //gets name
        String name = sc.nextLine();
        System.out.println("\nWhat is your address?"); //gets address
        String address = sc.nextLine();
        System.out.println("\nWhat is your telephone?"); //gets telephone number
        String phone = sc.nextLine();
        while (again == true) { //loops until user requests no more rental
            Scanner sd = new Scanner(System.in); //new scanner object
            price = 0; //resets price
            availability = true; //availabile by default
            if (changeDate == true) { //checks to see if user wats to change the date
                startDate = 0;
                endDate = 0;
                days = 0;
                subStart = 0; //resets date
                subEnd = 0;
                count = 0;
            }
            goAgain = 'g';
            confirm = 'g'; //choice selection reset
            changeChoice = 0;
            if (changeBoat == true) { //if user wants new boat
                boat_choice = Boat.getBoat(); //gets new boat
            } else {
                changeBoat = true; //makes it so the next time the boat will change, unless specified by user
            }
            if (changeDate == true) {
                do { //gets rental information
                    System.out.println("\nPlease enter the number of the month you would like to start the rental"); //display
                    startMonth = Boat.getMonth1(); //method call
                    System.out.println("\nPlease enter the number of the day you would like to start the rental"); //display
                    startDay = Boat.getDay1(startMonth); //method call
                    System.out.println("\nPlease enter the number of the month you would like to end the rental"); //display
                    endMonth = Boat.getMonth1(); //method call
                    System.out.println("\nPlease enter the number of the day you would like to end the rental"); //display
                    endDay = Boat.getDay1(endMonth); //method call
                    if ((startMonth > endMonth) || (startMonth == endMonth && startDay > endDay)) { //checks to see if valid rental
                        System.out.println("You must rent for at least a day"); //display
                    }
                } while ((startMonth > endMonth) || (startMonth == endMonth && startDay > endDay)); //loops until valid rental
                startDate = (100 * startMonth) + startDay; //gets date
                endDate = (100 * endMonth) + endDay; //gets date
                for (int i = 0;i < 73;i++) { //looks through array
                    if (array[i][0] == startDate) { //finds the startdate
                        count = i; //stores substring
                        subStart = i; //stores substring
                    }
                    if (array[i][0] == endDate) {//finds endDate
                        days = (i - count) + 1; //stores number of days
                        subEnd = i; //sotres substring end
                    }
                }
            } else {
                changeDate = true; //makes it so the next time the date will change
            }
            price = Boat.getPrice(boat_choice, days); //gets the price
            for (int i = subStart;i <= days;i++) { //looks through availability
                if (array[i][boat_choice] == 0) { //if it's not available
                    availability = false;
                }
            }
            if (availability == false) { //checks to see if unavailable
                System.out.println("\nI'm sorry, the " + boats[boat_choice] + " is not available on all the days from " + startMonth + "/" + startDate + " to " + endMonth + "/" + endDate);//display for unavailable
            } else { //if vailable
                String cash = formatter.format(price); //formats price
                System.out.println("\nThe price of your order will be " + price + "\nis this ok? Y/N"); //confirmation for price
                while (confirm != 'y' && confirm != 'n') { //if it's not 'y' or 'n'
                    confirm = sd.nextLine().trim().toLowerCase().charAt(0); //prompts input
                }
                if (confirm == 'y') { //if yes
                    for (int i = subStart;i <= days;i++) { //find schosen days
                        array[i][boat_choice] = 0; //makes them all unavailable
                    }
                    System.out.println("\nCompany: The Boat Shop");
                    System.out.println("Name: " + name);
                    System.out.println("Address: " + address);          //billing display
                    System.out.println("Phone #: " + phone);
                    Boat.finishPurchase(startMonth, startDay, endMonth, endDay, boats[boat_choice]); //finish the display
                }
            }
            System.out.println("\nWould you like to rent again? Y/N"); //prompt for second purchase
            while (goAgain != 'y' && goAgain != 'n') { //formats the input
                goAgain = sd.next().trim().toLowerCase().charAt(0);
            }
            if (goAgain == 'n') { //if not go again
                again = false;
            } else { //if go again
                System.out.println("\nEnter 1 to keep the date the same\nEnter 2 to keep the boat the same\nEnter anything else to change everything");//display
                changeChoice = sd.nextInt(); //gets the choice
                if (changeChoice == 1) { //if the date should stay same
                    changeDate = false;
                } else if (changeChoice == 2) { //if the boat should stay the same
                    changeBoat = false;
                }
            }
        }
        System.out.println("\nHave a nice day!"); //display before leaving
    }
}
