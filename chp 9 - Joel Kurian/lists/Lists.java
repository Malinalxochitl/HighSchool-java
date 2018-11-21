/*
 * Student: Joel Kurian
 * Period: 6
 * Class: C++/JAVA A
 * Teacher: Mrs.Snelson
 * School: Randolph High School
 * Compiler: Blue Jay
 * Chapter: 9
 * Page: N/A
 * Description: sorts numbers into a list
 */
import java.util.*;
import static java.lang.Math.*; //imports
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Lists { //class
    public static void main(String args[]) { //main
        Scanner sc = new Scanner(System.in); //scanner
        float num[] = new float[15]; //array declaration
        for (int i = 0;i < 15;i++) { //input
            System.out.print("Enter a number, odd, even, or negative: "); //display
            num[i] = sc.nextFloat(); //input
        }
        System.out.println(); //formatting
        float evenList[] = new float[15];
        float oddList[] = new float[15];    //arrays
        float negativeList[] = new float[15];
        int evenNum = 0;
        int oddNum = 0; //counters
        int negNum = 0;
        for (int i = 0;i < 15;i++) { //checks type
            if ((num[i] % 2) == 1 || (num[i] %2) == -1) { //checks for odd, including negatives
                oddList[oddNum] = num[i]; //makes it odd
                oddNum++; //adds odd
            } else if ((num[i] % 2) == 0) { //even check
                evenList[evenNum] = num[i]; //makes it even
                evenNum++; //adds to even
            }
            if (num[i] < 0) { //checksfor negative
                negativeList[negNum] = num[i]; //adds to negative
                negNum++; //makesit negative
            }
        }
        System.out.println("The odd numbers are: ");               // <-
        for (int i = 0;i != oddNum;i++) {                         //  |
            System.out.print(oddList[i] + ", ");                   //  |
        }                                                          //  |
        System.out.println("\nThe even numbers are: ");            //  |
        for (int i = 0;i != evenNum;i++) {                         //display
            System.out.print(evenList[i] + ", ");                  //  |
        }                                                          //  |
        System.out.println("\nThe negative numbers are: ");        //  |
        for (int i = 0;i != negNum;i++) {                          //  |
            System.out.print(negativeList[i] + ", ");              //  |
            }                                                      // <-
        }
}
