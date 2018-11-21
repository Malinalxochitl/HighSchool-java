import java.util.Scanner; //scanner class
public class TemperatureUser {
    private static int choice;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner object
        Temperature temp = new Temperature();
        while (choice != 3) { //loops until exit
            System.out.println("Choose one of the following conversions");
            System.out.println("    1)Celsius to Fahrenheit");
            System.out.println("    2)Fahrenheit to Celsius"); //display
            System.out.println("    3)Quit");
            System.out.println("");
            choice = sc.nextInt(); //input for choice
            if (choice == 1) {
                temp.giveFahrenheit(); //retrieves fahrenheit
            }
            else if (choice == 2) {
                temp.giveCelsius(); //retrieves celsius
            }
        }
        System.out.println("Goodbye"); //farewell
    }
}
/*░░░░░░░░░▄░░░░░░░░░░░░░░▄░░░░
  ░░░░░░░░▌▒█░░░░░░░░░░░▄▀▒▌░░░
  ░░░░░░░░▌▒▒█░░░░░░░░▄▀▒▒▒▐░░░
  ░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐░░░
  ░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐░░░
  ░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌░░░ 
  ░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒▌░░
  ░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐░░
  ░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄▌░
  ░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒▌░
  ▀▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒▐░
  ▐▒▒▐▀▐▀▒░▄▄▒▄▒▒▒▒▒▒░▒░▒░▒▒▒▒▌
  ▐▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒▒▒░▒░▒░▒▒▐░
  ░▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒░▒░▒░▒░▒▒▒▌░
  ░▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▒▄▒▒▐░░
  ░░▀▄▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▄▒▒▒▒▌░░
  ░░░░▀▄▒▒▒▒▒▒▒▒▒▒▄▄▄▀▒▒▒▒▄▀░░░
  ░░░░░░▀▄▄▄▄▄▄▀▀▀▒▒▒▒▒▄▄▀░░░░░
  ░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▀▀░░░░░░░░*/
