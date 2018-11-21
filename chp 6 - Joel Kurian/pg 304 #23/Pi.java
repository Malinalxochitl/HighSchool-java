public class Pi {
    public void getPi() { //getpi method
        double num = 1; //instance variables
        int count = 0;
        double bottom = 3.0;
        int modifier = -1;
        for (;(4 * num) > 3.142 ^ (4 * num) < 3.141;count++) { //loops until pi is reached
            num = num + (modifier * (1.0 / bottom)); //adds/subtracts the number
            bottom += 2; //increases bottom of fraction
            modifier *= -1; //change from + to - and vice verse
        }
        System.out.println("The number of interations is " + count); //display
        System.out.println("Pi is " + (num * 4));
    }
    public static void main(String args[]) { //main
        Pi pi = new Pi(); //constructor call
        pi.getPi(); //method call
    }
}
