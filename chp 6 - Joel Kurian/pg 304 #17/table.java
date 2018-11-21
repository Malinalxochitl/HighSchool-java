public class table {
    public void display() {
        int row = 1;  //insatnce variables
        int column = 1;
        int count = 0;
        int tags = 8;
        int max = 8;
        int innerChange = -4;
        int outerChange = 2;
        int inner = 9;
        int outer = 2;
        for (count = 1;count <= 8;count++) { //this is the top-right triangle loop
            for (int temp = 1;temp < row;temp++) { //this prints the spaces depending on the row number
                System.out.print("  "); //space
                tags--; //one less # to print out
            }
            for (;tags != 0;tags--) { //this prints the hashtags
                System.out.print("#" + " "); //# + space
            }
            System.out.println(); //next line
            row++; //records the row
            tags = 8; //resets number of #
        }
        System.out.println(); //next pattern
        for (count = 1;count <= 8;count++){ //this prints the top-left triangle
            for (int temp = 1;temp <= max;temp++) { //loops to print the # and a space
                System.out.print("#" + " "); //print
            }
            System.out.println(); //next row
            max--; //one less #
        }
        System.out.println(); //next pattern
        System.out.println("# # # # # # # #"); //base of the hourglass
        for (count = 0;count != 2;count++) { //prints the design twice
            for (int temp = 0;temp != 3;temp++) { //prints a row 3 times
                for (int temp2 = outer;temp2 != 0;temp2--) { //displays the spaces before first #
                    System.out.print(" "); //print
                }
                System.out.print("#"); //first #
                for (int temp2 = inner;temp2 != 0;temp2--) { //displays the spaces after the first #
                    System.out.print(" ");
                }
                System.out.println("#"); //second #
                outer += outerChange; //adjusts the number of spaces
                inner += innerChange;
            }
            outer -= outerChange; //removes the adjustment made in the final loop
            inner -= innerChange;
            outerChange *= -1; //reverses the affect of the adjustment
            innerChange *= -1;
        }
        System.out.println("# # # # # # # #" + "\n"); //base of the hourglass, sets up for next pattern
        System.out.println("# # # # # # # #"); //base of the Z
        for (int temp = 12;temp != 0;temp -= 2) { //loops 12 times for each space. also lowers num of spaces needed
            for (int temp2 = temp;temp2 != 0; temp2--) { // display until needed number of spaces is left
                System.out.print(" "); //display
            }
            System.out.println("#"); //displays the #, also new line
        }
        System.out.println("# # # # # # # #"); //base of the Z
    }
}
