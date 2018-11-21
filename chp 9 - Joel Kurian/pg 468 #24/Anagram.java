/*
 * Student: Joel Kurian
 * Period: 6
 * Class: C++/JAVA A
 * Teacher: Mrs.Snelson
 * School: Randolph High School
 * Compiler: Blue Jay
 * Chapter: 9
 * Page: pg 468 #24
 * Description: checks for an anagram
 */
import java.util.*;
import static java.lang.Math.*; //imports
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Anagram { //class
    public static void main(String args[]) { //main
        Scanner sc = new Scanner(System.in); //scanner
        System.out.print("Enter the first word: "); //display
        String one = sc.nextLine(); //input
        System.out.print("Enter the second word: "); //display
        String two = sc.nextLine(); //input
        int temp1 = one.length(); //first string length
        int temp2 = two.length(); //second string length
        char first[] = new char[temp1]; //array1
        char second[] = new char[temp2]; //array2
        for (int i = 0;i < temp1;i++) { //moves string into array
            first[i] = one.charAt(i);
        }
        for (int i = 0;i < temp2;i++) { //moves string into array
            second[i] = two.charAt(i);
        }
        java.util.Arrays.sort(first); //sorts arrays
        java.util.Arrays.sort(second);
        boolean result = true; //default result
        if (temp1 != temp2) { //if the lengths aren't the same
            result = false; //make false
        } else { //lengths are the same
            for (int i = 0;i < temp1;i++) { //comparing arrays
                if (first[i] != second[i]) { //if array is different
                    result = false; //make false
                }
            }
        }
        if (result == false) { //if it is false
            System.out.println("They are not anagrams"); //display
        }
        else {
            System.out.println("They are anagrams"); //display
        }
    }
}
