import java.util.Scanner; //scanner class
public class TemperatureUser {
    private static int choice;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner object
        Temperature temp = new Temperature();
        while (choice != 4) { //loops until exit
            System.out.println("Choose one of the following conversions:");
            System.out.println("    1)Celsius to Fahrenheit");
            System.out.println("    2)Fahrenheit to Celsius"); //display
            System.out.println("    3)Make a table");
            System.out.println("    4)Quit");
            choice = sc.nextInt(); //input for choice
            if (choice == 1) {
                temp.giveFahrenheit(); //retrieves fahrenheit
            }
            else if (choice == 2) {
                temp.giveCelsius(); //retrieves celsius
            }
            else if (choice == 3) { //table choice
                System.out.println("How would you like to conversions to go:");
                System.out.println("    1)Fahrenheit to Celsius"); //display options
                System.out.println("    2)Celsius to Fahrenheit");
                choice = sc.nextInt();
                if (choice == 1) { //fahrenheit -> celsius
                    System.out.println("Enter a number for the lowest temperature, then enter one for the highest:");
                    temp.CelsiusTable(sc.nextInt(), sc.nextInt());
                }
                else if (choice == 2) { //celsius -> fahrenheit
                    System.out.println("Enter a number for the lowest temperature, then enter one for the highest:");
                    temp.FahrenheitTable(sc.nextInt(), sc.nextInt());
                }
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
