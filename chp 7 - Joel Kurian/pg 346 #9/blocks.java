public class blocks { //class
    public String block(String s1) { //method
        int len = s1.length(); //retrieves length
        int count = 0; //length counter
        String s2 = new String(); //new string
        for (;count < len;) { //loops to add space
            for (int k = 0; k < 5 && count < len; count++, k++) { //loops until 5 spaces
                if (s1.charAt(count) == ' ') { //checks for a space
                    k--; //removes a count for the space
                }
                else {
                    s2 = s2 + s1.charAt(count); //adds the character
                }
            }
            s2 = s2 + " "; //adds space
        }
        return s2; //return
    }
    public static void main(String args[]) { //main
        String a = "Shrek is love shrek is life"; //original string
        System.out.println("The original string is: " + a); //display
        blocks x = new blocks(); //constructor call
        System.out.println("The new string is : " + x.block(a)); //display/method call
    }
}