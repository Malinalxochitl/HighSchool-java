/*
 * Student: Joel Kurian
 * Period: 6
 * Class: C++/JAVA A
 * Teacher: Mrs.Snelson
 * School: Randolph High School
 * Compiler: Blue Jay
 * Chapter: 9
 * Page: 468 #26
 * Description: acme trucking program to find cities based on input
 */
import java.util.*;
import static java.lang.Math.*; //imports
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.*;
public class boat {
    NumberFormat formatter = NumberFormat.getCurrencyInstance(); //formats currency
    double totalPrice;
    double tax; //instance variables
    int security;
    double rentalPrice;
    public void finishPurchase(int startMonth, int startDay, int endMonth, int endDay, String boat) { //final display for purchase
        System.out.println("Reservation start: " + startMonth + "/" + startDay);
        System.out.println("Reservation end: " + endMonth + "/" + endDay);        //display
        System.out.println("Boat rented: " + boat);
        String total = formatter.format(totalPrice);
        String taxes = formatter.format(tax);       //formatting
        String deposit = formatter.format(security);
        String rental = formatter.format(rentalPrice);
        System.out.println("Security deposit: " + deposit);
        System.out.println("Taxes: " + taxes);            //display
        System.out.println("Rental price: " + rental);
        System.out.println("Total price: " + total);
    }
    public double getPrice(int boat, int days) { //finds price of boat
        double price = 0; //resets price
        switch(boat) { //finds the rental cost
            case 0: price = 90;
                    break;
            case 1: price = 120;
                    break;
            case 2: price = 180;
                    break;
            case 3: price = 250;
                    break;
            case 4: price = 320;
                    break;
        }
        price = price * days; //rental cost
        if (days >= 7) { //checks for discount
            price = price * 0.75;
        } else if (days >= 3) {
            price = price * 0.90;
        }
        rentalPrice = price; //sotres rental cost
        tax = price * 0.085; //stores tax
        price = price * 1.085; //adds tax
        Scanner d = new Scanner(System.in); //scanner object
        System.out.println("\nWhat is the PIN for the discount?"); //prompt for pin
        String input; //input
        input = d.nextLine().trim(); //retrieves input
        if (input.equals("SOS")) { //if it's correct
            price = price + 250; //discount security
            security = 250;
        } else {
            price = price + 500; //normal security
            security = 500;
        }
        totalPrice = price; //stores the total price
        return price;
    }
    public int getBoat() { //finds the boat selection
        int boat_choice = 0; //reset selection
        Scanner sc = new Scanner(System.in); //scanner object
        System.out.println("\nThere are 5 boats to choose from:");
        System.out.println("1. SS Marmalade - 12 feet\n2. SS Vegtable - 14 feet\n3. SS hurkadurk - 17 feet\n4. SS ploops - 26 feet\n5. SS rustledjimmies - 37 feet"); //display
        System.out.print("\nEnter the number of the boat you would like: ");
        while (boat_choice > 5 || boat_choice < 1) { //gets input for choice
            boat_choice = sc.nextInt();
        }
        return (boat_choice - 1); //returns substring of choice
    }
    public int getMonth1() { //gets the month
        int month = 0; //resets month
        Scanner sc = new Scanner(System.in); //scanner object
        System.out.println("It should be from 06 to 09"); //display
        while (month > 9 || month < 6) { //retrieves month
            month = sc.nextInt();
        }
        return month;
    }
    public int getDay1(int month) { //gets the day
        int day = 0;        //resets day
        Scanner sc = new Scanner(System.in); //scanner object
        if (month == 6) { //days depend on month
            System.out.println("It should be from 21 to 30");//display
            while (day > 30 || day < 21) {//if the day is not correct
                day = sc.nextInt();
            }
        } else if (month == 7 || month == 8) {//days depend on month
            System.out.println("It should be from 01 to 31");//display
            while (day > 31 || day < 1) {//checks for correct day
                day = sc.nextInt();
            }
        } else if (month == 9) {//days depend on month
            System.out.println("It should only be 01");//display
            while (day != 1) {//checks for correct day
                day = sc.nextInt();
            }
        }
        return day;
    }
}
