import static java.lang.Math.*; //import
public class Quadratic {
    double a;
    double b; //instance variables
    double c;
    public Quadratic (double A, double B, double C) { //constructor
        a = A;
        b = B;
        c = C;
    }
    public double bPlus() { //returns root 1
        return ((b * -1) + sqrt(pow(b, 2) - (4 * a * c))) / (2 * a);
    }
    public double bMinus() { //returns root 2
        return ((b * -1) - sqrt(pow(b, 2) - (4 * a * c))) / (2 * a);
    }
}
