import java.util.*;
public class BirthdayUser {
    public static void main(String args[]) {
        int month = 0;
        int days = 32;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        Birthday birthday = new Birthday();
        while (month < 1 || month > 12) {
            System.out.print("Enter a valid month: ");
            month = sc.nextInt();
        }
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            while (days < 1 || days > 31) {
                System.out.print("Enter a day between 1 and 31: ");
                days = sc.nextInt();
            }
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            while (days < 1 || days > 30) {
                System.out.print("Enter a day between 1 and 30: ");
                days = sc.nextInt();
            }
        }
        else {
            while (days < 1 || days > 29) {
                System.out.print("Enter a day between 1 and 29: ");
                days = sc.nextInt();
            }
        }
        total = birthday.findTotal(month, days);
        System.out.println("The day is " + total + " out of 365");
    }
}