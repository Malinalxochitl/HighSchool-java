import java.util.*; //scanner class
public class BirthdayUser { //birthday user class
    public static void main(String args[]) { //main
        int month = 0;
        int days = 0;
        double temp = 0; //instance variables
        int total = 0;
        Scanner sc = new Scanner(System.in);
        Scanner sb = new Scanner(System.in); //scanner classes
        Birthday birthday = new Birthday(); //birthday call
        while ((month < 1) || (month > 12)) { //failsafe for wrong month
            System.out.print("Enter a valid month: "); //display
            month = sc.nextInt(); //enter
        }
        if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) { //checks the month
            while ((temp < 1) || (temp > 31)) { //failsafe
                System.out.print("Enter a day between 1 and 31: "); //display
                Scanner sa = new Scanner(System.in); //scanner
                temp = sa.nextInt(); //enter
            }
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) { //checks the month
            while (temp < 1 || temp > 30) { //failsafe
                System.out.print("Enter a day between 1 and 30: "); //display
                temp = sc.nextDouble(); //enter
            }
        }
        else { //february
            while (temp < 1 || temp > 29) { //failsafe
                System.out.print("Enter a day between 1 and 29: "); //display
                temp = sc.nextDouble(); //enter
            }
        }
        days = (int) temp; //convert to int
        total = birthday.findTotal(month, days); //calls birthday
        System.out.println("The day is " + total + " out of 365"); //display
    }
}