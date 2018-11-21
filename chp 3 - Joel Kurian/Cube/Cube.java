public class Cube { //methods to find surface area, volume, and density
    private double length; //instance variables
    private double density;
    public Cube(double bla, double dense) { //constructor
        length = bla;
        density = dense;
    }
    public double giveVolume() { //returns the volume to main
        return (length * length * length);
    }
    public double giveSurfaceArea() { //returns the surface area to main
        return (length * length) * 6;
    }
    public double giveDensity() { //returns density
        return (length * length * length) * density;
    }
}
