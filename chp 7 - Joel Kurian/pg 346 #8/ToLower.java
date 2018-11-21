public class ToLower { //class
    public String lower(String s1) { //method
        int len = s1.length(); //length
        String s2 = new String(); //new string object
        for (int k = 0;k < len;k++) { //loops until length is reached
            if (s1.charAt(k) >= 65 && s1.charAt(k) <= 90) { //checks for uppercase
                s2 = s2 + ((char)(s1.charAt(k) + (97 - 65))); //converts to ascii, adds the number, then converts back to char
            }
            else {
                s2 = s2 + s1.charAt(k); //just adds char
            }
        }
        return s2; //return
    }
    public static void main(String args[]) { //main
        String a = "This Is A STRING"; //original string
        System.out.println("The original string is: " + a); //display
        ToLower x = new ToLower(); //constructor call
        System.out.println("The new string is: " + x.lower(a)); //display/method call
    }
}
