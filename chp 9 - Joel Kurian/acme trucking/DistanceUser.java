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
public class DistanceUser {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cities serviced:");
        System.out.println("1. New York");
        System.out.println("2. Kansas");
        System.out.println("3. Pheonix");
        System.out.println("4. St. Petersburg");
        System.out.println("5. Fresno");
        int city1 = -1;
        int city2 = -1;
        while (city1 < 0 || city1 > 4) {
            System.out.print("\nEnter the first city: ");
            city1 = (sc.nextInt() - 1);
        }
        while (city2 < 0 || city2 > 4) {
            System.out.print("Enter the second city: ");
            city2 = (sc.nextInt() - 1);
        }
        String choice1 = "";
        String choice2 = "";
        switch (city1) {
            case 0: choice1 = "New York";
                    break;
            case 1: choice1 = "Kansas";
                    break;
            case 2: choice1 = "Pheonix";
                    break;
            case 3: choice1 = "St.Petersburg";
                    break;
            case 4: choice1 = "Fresno";
                    break;
            default: choice1 = "error";
                    break;
        }
        switch (city2) {
            case 0: choice2 = "New York";
                    break;
            case 1: choice2 = "Kansas";
                    break;
            case 2: choice2 = "Pheonix";
                    break;
            case 3: choice2 = "St.Petersburg";
                    break;
            case 4: choice2 = "Fresno";
                    break;
            default: choice2 = "error";
                    break;
        }
        Distance distance = new Distance(choice1, choice2);
        distance.getCityIndex();
        distance.getDistance();
        distance.getNearestCity();
    }
}
