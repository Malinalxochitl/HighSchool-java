import java.util.*;
public class Numb {
    public static void main(String args[]) {
        int num1;
        int num2;
        int num3; //instance variables
        int high;
        int middle;
        int low;
        Scanner sc = new Scanner(System.in); //scanner
        System.out.println("Enter three numbers seperately"); //display
        num1 = sc.nextInt();
        num2 = sc.nextInt(); //input
        num3 = sc.nextInt();
        if (num1 >= num2) {
            if (num1 >= num3) {
                high = num1; //num1 must be highest
                if (num2 >= num3) {
                    middle = num2; //num2 is > num3, but less than num1 so num2 is middle and num3 is low
                    low = num3;
                }
                else {
                    low = num2; //num2 isn't larger than either, so it is lowest, which makes num3 middle
                    middle = num3;
                }
            }
            else {
                middle = num1; //num1 is greater than something, so it is middle
                high = num3; //default
                low = num2; //middle is > low, and num2 is less than num1 so it is low, as num1 is middle
            }
        }
        else if (num1 >= num3) {
            middle = num1; //num1 isn't greater than num2, but greater than num3 so it is middle
            low = num3; //num3 has a num1 (middle) greater than it, so it is low by default
            high = num2; //the middle (num1) is less than num2, so num2 is high
        }
        else {
            low = num1; //num1 isn't better than anything
            if (num2 >= num3) {
                high = num2; //num2 is better than anything, so it is high
                middle = num3; //since num1 is low, num3 is middle
            }
            else {
                high = num3; //num3 beats num2, which beats num1, so it is high
                middle = num2; //middle by default
            }
        }
        System.out.println("\n" + low + "\n" + middle + "\n" + high + "\n"); //display
    }
}
