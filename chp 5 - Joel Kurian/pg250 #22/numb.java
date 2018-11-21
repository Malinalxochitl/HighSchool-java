import java.util.*; //scanner class
public class numb {
    public static void main(String args[]) { //main
        int num1; //instance variables
        int num2;
        Scanner sc = new Scanner(System.in); //scanner
        System.out.println("Enter two integers seperately"); //display
        num1 = sc.nextInt();
        num2 = sc.nextInt(); //input
        if (num1 % num2 == 0 || num2 % num1 == 0) { //checks to see if division is possible
            System.out.println("The numbers are divisible"); //display
        }
        else { //if not
            System.out.println("The numbers are not divisible."); //display
        }
    }
}
