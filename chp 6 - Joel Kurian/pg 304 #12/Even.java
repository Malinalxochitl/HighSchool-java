import java.util.*;
public class Even {
    public void stuff(int meh) {
        int i; //instance variable
        for (i = 2;i <= meh;i += 2) { //displays even numbers
            System.out.print(i + ", "); //display
        }
        System.out.println(); //new line
    }
    public static void main(String args[]) { //main
        Scanner sc = new Scanner(System.in); //scanner
        int ploops; //instance
        Even even = new Even(); //calls constructor
        System.out.print("Enter an interger: ");
        ploops = sc.nextInt(); //input
        even.stuff(ploops); //calls method
    }
}
