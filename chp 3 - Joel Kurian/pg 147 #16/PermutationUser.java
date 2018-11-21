import java.util.Scanner; //scanner class import
public class PermutationUser { //user for permutation
    public static void main(String[] args) { //main class
        Scanner sc = new Scanner(System.in); //scanner object
        sc = sc.useDelimiter("\n"); //changes delimiter
        System.out.println("Enter three different strings: "); //display
        Permutation perm = new Permutation(sc.next(),sc.next(),sc.next()); //has user enter String, and sends to the constructor
        perm.Permute(); //calls permute method
    }
}