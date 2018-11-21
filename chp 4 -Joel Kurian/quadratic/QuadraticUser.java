import java.util.*; //import
public class QuadraticUser {
    public static void main(String[] args) { //main method
        double a;
        double b; //instance variables
        double c;
        Scanner sc = new Scanner(System.in); //scanner object
        System.out.print("Enter a: ");
        a = sc.nextDouble(); //a input
        System.out.print("Enter b: ");
        b = sc.nextDouble(); //b input
        System.out.print("Enter c: ");
        c = sc.nextDouble(); //c input
        Quadratic quad = new Quadratic(a, b, c); //quad constructor
        System.out.println("Root 1: " + quad.bPlus());
        System.out.println("Root 2: " + quad.bMinus()); //display
    }
}
