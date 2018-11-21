import java.util.Scanner; //imports scanner input
public class CubeUser { //displays volume/surface area of a cube
    private static double x; //instance varibale
    public static void main(String[] args) { //main
        Scanner sc = new Scanner(System.in); //scanner calling
        System.out.print("Input a number for the length of a side of a cube: ");
        x = sc.nextDouble(); //input
        Cube meh = new Cube(x); //sends to constructor
        System.out.println("The volume is " + meh.giveVolume()); //displays volume
        System.out.println("The surface area is " + meh.giveSurfaceArea()); //displays surface area
    }
}
