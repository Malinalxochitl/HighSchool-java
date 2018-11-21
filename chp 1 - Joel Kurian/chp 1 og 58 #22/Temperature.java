public class Temperature extends Object {
    private double temp;
    public Temperature (double blech){ //retrieves value from user
        temp = blech;
    }
    public double giveFahrenheit() {
        return temp * 9/5 + 32; //converts value to fahrenheit
    }
    public double giveCelsius() {
        return (temp - 32) * 5/9; //converts value to celsius
    }
}