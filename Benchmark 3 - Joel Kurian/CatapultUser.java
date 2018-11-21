import java.util.*; //importing classes
public class CatapultUser {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //scanner object
        Catapult catapult = new Catapult(); //catapult object
        int Select = 0;
        boolean Win = false;
        int target = 0;
        int angle = 0;    //instance variables
        double radius = 0;
        double dense = 0;
        String material;
        while (Select != 1 && Select != 2 && Select != 3) { //loops until a valid game is chosen
            System.out.println("Enter the NUMBER CORRESPONDING TO THE DISTANCE to aim for: ");
            System.out.println("   1) 25m");
            System.out.println("   2) 50m"); //display
            System.out.println("   3) 100m");
            Select = sc.nextInt(); //input
        }
        if (Select == 1) { //sets the target distance depending on chosen game
            target = 25; //distance = 25m
        }
        else if (Select == 2) {
            target = 50; //distance = 50m
        }
        else {
            target = 100; //distance = 100m
        }
        while (Win != true) { //keeps playing the chosen game until a win is achieved
            while (angle > 70 || angle < 20) { //loops until a valid angle is chosen
                System.out.println("Choose a launch angle between 20 and 70 degrees"); //display
                angle = sc.nextInt(); //input
            }
            while (radius > 10 || radius < 6) { //loops until a valid radius is chosen
                System.out.println("Choose a radius between 6 and 10"); //display
                radius = sc.nextInt(); //input
            }
            Select = 0; //resets selection choice
            while (Select < 1 || Select > 10) { //loops until a valid matrial is chosen
                System.out.println("Choose from the list of things to toss");
                System.out.println("   1) Balsa Wood");
                System.out.println("   2) Cow Manure");
                System.out.println("   3) Marshmallow");
                System.out.println("   4) Stone");
                System.out.println("   5) Paraffin");      //display
                System.out.println("   6) Clay");
                System.out.println("   7) Bone");
                System.out.println("   8) Brick");
                System.out.println("   9) Paper");
                System.out.println("  10) Water Ballons");
                Select = sc.nextInt(); //input
            }
            if (Select == 1) { //sets the material type, and the density of the material
                dense = 130; //utter garbage
                material = "balsa wood";
            }
            else if (Select == 2) {
                dense = 700;
                material = "cow manure";
            }
            else if (Select == 3) {
                dense = 500;
                material = "marshmallow";
            }
            else if (Select == 4) {
                dense = 2700;       //best one
                material = "stone";
            }
            else if (Select == 5) {
                dense = 900;
                material = "paraffin";
            }
            else if (Select == 6) {
                dense = 2000;
                material = "clay";
            }
            else if (Select == 7) {
                dense = 1800;
                material = "bone";
            }
            else if (Select == 8) {
                dense = 1400;
                material = "brick";
            }
            else if (Select == 9) {
                dense = 1000;
                material = "paper";
            }
            else {
                dense = 1000;
                material = "water ballons";
            }
            catapult = new Catapult(target, angle, radius, dense); //new object for catapult class
            catapult.getProjVolume(); //sets the volume
            catapult.getDistance(); //calculates the distance the object is launched
            catapult.getMissDistance(); //calculates how far the object is from the target
            System.out.println("You launched a projectile made of " + material + " that was " + radius + "cm thick\nat a " + angle + " degree angle"); //display
            Win = catapult.getWin(); //checks for a victory
            catapult.getComment(); //comments on the shot if you didn't win
            angle = 0;
            radius = 0; //resets the instance variables
        }
        System.out.println("You hit the target at " + target + " meters"); //victory display, ending the game
        System.out.println("YOU WIN");
     }
}