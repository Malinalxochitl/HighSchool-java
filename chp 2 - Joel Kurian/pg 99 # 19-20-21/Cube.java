public class Cube { //methods to find surface area and volume
    private double length; //instance variable
    public Cube(double bla) { //constructor
        length = bla;
    }
    public double giveVolume() { //returns the volume to main
        return (length * length * length);
    }
    public double giveSurfaceArea() { //returns the surface area to main
        return (length * length) * 6;
    }
}
