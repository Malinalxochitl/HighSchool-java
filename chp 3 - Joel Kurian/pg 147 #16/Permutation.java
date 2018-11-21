import java.util.Scanner;
public class Permutation {
    private String str1;
    private String str2; //storage for strings
    private String str3;   
    private String strTemp; //temporary holder variable
    private int i = 0; //counter
    public Permutation (String a, String b, String c) { //constructor
        str1 = a;
        str2 = b; //gets strings from main
        str3 = c;
    }
    public void Permute() { //displays all possible combinations
        while (i != 3) {
            System.out.println(str1 + str2 + str3);
            System.out.println(str1 + str3 + str2); //display of first two combos
            strTemp = str1;
            str1 = str2; //changes the combo
            str2 = str3;
            str3 = strTemp;
            i = i + 1; //counter increase
        }
    }
}