import java.util.*; //scanner import
public class cipher {
    public static void main(String args[]) { //main method
        char letter = '|';
        int increase = 0; //instance variables
        int ascii;
        Scanner sc = new Scanner(System.in); //scanner method
        while (true) { //loops until failsafe
            if  (((int) letter >= 65 && ((int) letter <= 90)) || ((int) letter >= 97 && ((int) letter <= 122))) { //failsafe
                break; //exits loop
            }
            System.out.print("Enter a letter: "); //display
            letter = sc.next().trim().charAt(0); //only a single character can be entered
        }
        System.out.print("Enter how many spaces to move that letter: "); //display
        increase = sc.nextInt(); //input
        ascii = (int) letter; //stores ascii
        if (((int) letter >= 97) && ((int) letter <= 122)) { //makes it all uppercase
            letter = (char) (letter - (97 - 65));
        }
        while (increase != 0) { //moves the letter
            if ((int) letter == 91) { //loops back to begining
                letter = 65;
            }
            letter++; //moves letter up 1
            increase--; //moves counter down 1
        }
        System.out.println(letter); //display
    }
}