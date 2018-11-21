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
import static java.lang.Math.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Anagram {
    public static void main(String args[]) {
        Anagram anagram = new Anagram();
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        String two = sc.nextLine();
        int temp1 = one.length();
        int temp2 = two.length();
        char first[99];
        char second [temp2];
        StringTokenizer st = new StringTokenizer(one, "");
        for (int k = 0;st.hasMoreTokens();k++) {
            first[k] = st.nextToken();
        }
    }
}
