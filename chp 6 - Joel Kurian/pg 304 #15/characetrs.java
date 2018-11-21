import java.util.*; //scanner
public class characetrs {
    public void stuff (int meh, char bleh) { //gets character, and number of displays
        for (;meh > 0;meh--) { //for loop
            System.out.print(bleh); //display
        }
        System.out.println(); //new line
    }
    public static void main(String args[]) { //main
        int num; //instance variables
        char cha;
        Scanner sc = new Scanner(System.in); //scanner
        characetrs x = new characetrs(); //constructor call
        System.out.print("Enter the number of times to display character: "); //display
        num = sc.nextInt(); 
        System.out.print("Enter the character to display: "); //display
        cha = sc.next().trim().charAt(0); //input
        x.stuff(num, cha); //method call
    }
}
