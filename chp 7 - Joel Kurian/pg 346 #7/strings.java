import static java.lang.Math.*; //imports
import java.util.*;
public class strings { //class
    public boolean precedes(String s1, String s2) { //precedes method
        int len = Math.min(s1.length(), s2.length()); //length of strings
        boolean result; //default result
        for (int k = 0;k < len;k++) { //checks each character
            if (s1.charAt(k) != s2.charAt(k)) { //if a different character
                return false; //makes result false
            }
        }
        return true; //return
    }
    public static void main(String args[]) { //main
        String a = "hello"; //string 1
        String b = "Hello"; //string 2
        System.out.println("The first string is " + a); //display
        System.out.println("The second string is " + b);
        strings x = new strings(); //constructor call
        System.out.println("The string equality is " + x.precedes(a, b)); //method call
    }
}
