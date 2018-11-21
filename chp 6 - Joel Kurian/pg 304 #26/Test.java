import java.util.*; //import
public class Test {
    public void start(double start) { //testing method
        int count = 0; //instance variables
        double answer = 0;
        Scanner sc = new Scanner(System.in); //scanner class
        for (count = 1;count <= 12;count++) { //loops 12 times, increments multiplication
            System.out.println(start + " * " + count + " = ?"); //question display
            while (answer != (start * count)) { //loops until right answer is given
                answer = sc.nextDouble(); //input
                if (answer != (start * count)) { //motivation
                    System.out.println("Try again");
                }
            }
            System.out.println("Correct"); //even more motivation
        }
        System.out.println("Good job!"); //the farewell
    }
    public static void main(String args[]) { //main
        double input = 0; //input variable
        System.out.print("Enter a number to multiply off of: "); //display
        Scanner sc = new Scanner(System.in); //scanner object
        input = sc.nextDouble(); //input to start off of
        Test test = new Test(); //calls constructor
        test.start(input); //calls testing method
    }
}
