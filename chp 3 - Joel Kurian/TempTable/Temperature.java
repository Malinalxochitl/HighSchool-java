import java.util.Scanner; //scanner class
public class Temperature extends Object {
    private double temp; //instance variable
    public void giveFahrenheit() { //displays fahrenheit
        Scanner sc = new Scanner(System.in); //scanner object
        System.out.println("Enter a temperature: "); //display
        temp = sc.nextDouble(); //input for temp
        temp = temp * 9/5 + 32; //conversion
        System.out.println("The converted temp is " + temp); //display
    }
    public void giveCelsius() { //displays celsius
        Scanner sc = new Scanner(System.in); //scanner object
        System.out.println("Enter a temperature: "); //display
        temp = sc.nextDouble(); //input for temp
        temp = (temp - 32) * 5/9; //conversion
        System.out.println("The converted temp is " + temp); //display
    }
    public void CelsiusTable(int min, int max) { //make a table of celsius conversions
        System.out.println("Degrees F       Degrees C"); //header display
        while(min <= max) { //conversions until it reaches highest number
            System.out.println("   " + min + "             " + ((min - 32) * 5/9));
            min = min + 1;
        }
    }
    public void FahrenheitTable(int min, int max) { //make a table of gahrenheit conversions
        System.out.println("Degrees C       Degrees F"); //header display
        while(min <= max) { //conversions until it reaches highest number
            System.out.println("   " + min + "             " + (min * 9/5 + 32));
            min = min + 1;
        }
    }
}