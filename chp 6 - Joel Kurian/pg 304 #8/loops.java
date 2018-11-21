public class loops {
    public void loops() {
        int i; //instance
        for (i = 45;i >= -45;i-= 9) { //for loop
            System.out.print(i + ", "); //display
        }
        System.out.println();
        i = 45;                //variable/display reset
        do { //do-while loop
            System.out.print(i + ", ");
            i -= 9;
        } while (i >= -45);
        System.out.println();
        i = 45;                  //variable/display reset
        while (i >= -45) { //while loop
            System.out.print(i + ", ");
            i -= 9;
        }
        System.out.println(); 
    }
    public static void main(String args[]) { //main
        loops loops = new loops(); //calls constructor
        loops.loops(); //calls method
    }
}
