import static java.lang.Math.*; //math import
public class Catapult {
    private double projRadius = 0;
    private double projDensity = 0;
    private int launchAngle = 0;
    private double projVelocity = 0; //variables
    private double projDistance = 0;
    private int targetDistance = 25;
    private double projVolume = 0;
    private double missDistance = 1;
    public Catapult() {} //default constructor
    public Catapult(int t_Distance, int angle, double radius, double density) { //second constructor
        targetDistance = t_Distance;
        launchAngle = angle;         //sets all the input values
        projRadius = radius;
        projDensity = density;
    }
    public void getProjVolume() { //finds volume of projectile
        projVolume = (4/3) * 3.14 * pow(projRadius, 3);
    }
    public double getVelocity() { //finds velocity of projectile
        return 360000./(projDensity * projRadius);
    }
    public void getMissDistance() { //finds how far the projectile was from the target
        missDistance = targetDistance - projDistance;
    }
    public void getDistance() { //finds the distance the projectile flew
        projDistance = 2 * sin(toRadians(launchAngle)) * getVelocity() / 9.8 * cos(toRadians(launchAngle)) * getVelocity();
    }
    public boolean getWin() { //checks for a win
        if (targetDistance == 25) {
            if (missDistance <= 1 && missDistance >= -1) { //checks 25m win
                return true;
            }
            else {
                return false;
            }
        }
        else if (targetDistance == 50) { //checks 50m win
            if (missDistance <= 2 && missDistance >= -2) {
                return true;
            }
            else {
                return false;
            }
        }
        else { //checks 100m win
            if (missDistance <= 3 && missDistance >= -3) {
                return true;
            }
            else {
                return false;
            }
        }
    }
    public void getComment() { //a comment on the shot
        System.out.println("The target was at " + targetDistance + " meters");
        System.out.println("Your shot went " + projDistance + " meters far"); //displays stats
        System.out.println("The projectile was " + missDistance + " from the target");
        if (abs(missDistance) >= 100) {
            System.out.println("That was terrible");
        }
        else if (abs(missDistance) >= 50) {
            System.out.println("It's getting closer");     //various comments depending on how good the shot was
        }
        else if (abs(missDistance) >= 20) {
            System.out.println("You're nearly there");
        }
        else {
            System.out.println("SO INTENSE");
        }
    }
}