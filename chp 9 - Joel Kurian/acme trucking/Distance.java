import java.util.*;
import static java.lang.Math.*; //imports
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Distance {
    String choice1;
    String choice2;
    int index1;
    int index2;//                       0          1          2             3            4
    String[] cities = new String[] {"New York", "Kansas", "Pheonix", "St.Petersburg", "Fresno"};
    int[][] distances = new int[][] {
        { 0,    1424, 2409, 1154, 2919 }, //(0,0), (0,1), (0,2), (0,3), (0,4)
        { 1424, 0,    1045, 1509, 1538 }, //(1,0), (1,1), (1,2), (1,3), (1,4)
        { 2409, 1045, 0,    2175, 589  }, //(2,0), (2,1), (2,2), (2,3), (2,4) it doesn't matter if i switched up the numbers, since (1,0) and (0,1) are the same thing
        { 1154, 1509, 2175, 0,    2680 }, //(3,0), (3,1), (3,2), (3,3), (3,4)
        { 2919, 1538, 589,  2680, 0    }};//(4,0), (4,1), (4,2), (4,3), (4,4)
    public Distance(String x, String y) {
        choice1 = x;
        choice2 = y;
    }
    public void getCityIndex() {
        for (int i = 0;i < 5;i++) {
            if (choice1 == cities[i]) {
                index1 = i;
            }
        }
        for (int i = 0;i < 5;i++) {
            if (choice2 == cities[i]) {
                index2 = i;
            }
        }
    }
    public void getDistance() {
        System.out.println("\nThe distance between " + cities[index1] + " and " + cities[index2] + " is " + distances[index1][index2] + " miles."); //display distance
    }
    public void getNearestCity() {
        int shortest = 9001; //reference
        int city1 = 0; //closest city indexes
        int city2 = 0;
        for (int i = 0;i < 5;i++) { //checks for closest to index1
            if (distances[index1][i] < shortest && distances[index1][i] != 0) { //finds closest besides self
                shortest = distances[index1][i]; //makes it shortest
                city1 = i; //stores index
            }
        }
        System.out.println("\nThe closest city to " + cities[index1] + " is " + cities[city1]); //display
        shortest = 9001; //reset
        for (int i = 0;i < 5;i++) { //same as above, but with index2
            if (distances[index2][i] < shortest && distances[index2][i] != 0) { //finds closest to self
                shortest = distances[index2][i]; //makes it shortest
                city2 = i; //stores index
            }
        }
        System.out.println("\nThe closest city to " + cities[index2] + " is " + cities[city2]); //display
    }
}