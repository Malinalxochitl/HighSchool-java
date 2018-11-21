import static java.lang.Math.*; //import
public class Angle { //angle methods
    double angle; //instance variables
    public Angle(double x) { //constructor
        angle = x;
    }
    public void getSine() { //returns the sine of an angle
        System.out.println(sin(toRadians(angle)));
    }
    public void getCosine() { //returns the cosine of an angle
        System.out.println(cos(toRadians(angle)));
    }
    public void getTangent() { //returns the tngent of an angle
        System.out.println(tan(toRadians(angle)));
    }
}
