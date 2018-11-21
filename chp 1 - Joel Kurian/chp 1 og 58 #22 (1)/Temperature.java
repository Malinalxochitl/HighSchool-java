
/*
Student: Joel Kurian
Period: 6
Class: C++/JAVA A
Teacher: Mrs.Snelson
School: Randolph High School
Compiler: Blue Jay
Chapter: 1
Page: 58 #22
Description: returns the temperature
 */
public class Temperature extends Object {
    private static double tomp; //variable where the temp is stored
    public void setTemp(double t) {} //assigns t the same value as tomp
    public double getTemp() { //retrieves the temperature
        tomp = 98.6; //the temperature
        return tomp; //returns the temperature
    }
    public static void main(String[] args) { //displays the temp
        Temperature temp;
        temp = new Temperature();
        double blech = temp.getTemp(); //temp location for retrieving temp
        temp.setTemp(tomp); //calls the settemp method
        System.out.println(blech); //temp display
    }
}