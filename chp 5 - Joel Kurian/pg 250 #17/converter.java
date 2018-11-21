import java.util.*; //scanner class
public class converter { //birthday user class
    public static void main(String args[]) { //main
        char letter = '4';
        int tolower = 97 - 65; //instance variables
        int ascii;
        Scanner sc = new Scanner(System.in); //scanner method
        while (((int) letter) < 65 || ((int) letter > 90)) { //failsafe
            System.out.print("Enter an uppercase letter: "); //display
           letter = sc.next().trim().charAt(0); //only a single character can be entered
        }
        ascii = ((int) letter) + tolower; //gets ascii code
        System.out.println(Character.toString((char) ascii)); //displays ascii
    }
}