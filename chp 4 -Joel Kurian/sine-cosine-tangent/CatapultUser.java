import java.util.*; //importing classes
public class CatapultUser {
     public static void main(String[] args) { //main method
         Scanner sc = new Scanner(System.in); //scanner object
         System.out.println("Enter a degree to be made into sine, cosine, and tangent: "); //prompts input
         Angle angle = new Angle(sc.nextDouble()); //input to constructor
         System.out.print("The sine is ");
         angle.getSine();
         System.out.print("The cosine is ");    //display
         angle.getCosine();
         System.out.print("The tangent is ");
         angle.getTangent();
     }
}