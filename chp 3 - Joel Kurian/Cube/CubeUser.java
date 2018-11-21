import java.util.Scanner; //imports scanner input
public class CubeUser { //displays volume/surface area of a cube
    private static double density; //storage variable
    public static void main(String[] args) { //main
        Scanner sc = new Scanner(System.in); //scanner calling
        System.out.print("Input a number for the length of a side of a cube in inches, and then enter the density in lb per sq inch:");
        Cube meh = new Cube(sc.nextDouble(), sc.nextDouble()); //sends input to constructor
        System.out.println("The volume is " + meh.giveVolume()); //displays volume
        System.out.println("The surface area is " + meh.giveSurfaceArea()); //displays surface area
        density = meh.giveDensity(); //retireves density
        System.out.println("The density of the cube is " + density); //displays density
        if (density < 20){ //classifies cube by weight
            System.out.println("The cube is too light"); //cube is light
        }
        else if (density > 150){
            System.out.println("The cube is too heavy"); //cube is heavy
        }
        else {
            System.out.println("The cube is the perfect weight"); //cube is perfect
        }
    }
}
