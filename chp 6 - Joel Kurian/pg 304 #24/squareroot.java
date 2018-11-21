import java.util.*; //imports
import static java.lang.Math.*;
public class squareroot { //square root class
    public void Square(double x) { //method for getting the square root
        int N = 87;
        double guess = x; //instance variables
        int count;
        for (count = 0;guess != Math.sqrt(N);count++) { //loops until the right number is found
            guess = ((N / guess) + guess) / 2; //formula to find right square root
        }
        System.out.println("It took " + count + " guesses to get the square root of " + N); //display
    }
    public static void main(String args[]) { //main
        System.out.print("guess the square root: "); //display
        Scanner sc = new Scanner(System.in); //scanner object
        double y = -1; //temp variable
        while (y <= 0) { //failsafe
            y = sc.nextDouble(); //enter the nonzero guess
        }
        squareroot sq = new squareroot(); //constructor call
        sq.Square(y); //method call
    }
}