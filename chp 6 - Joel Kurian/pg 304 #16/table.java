public class table {
    public void display() {
        int row = 1;  //insatnce variable
        int column = 1;
        System.out.print("\t1\t2\t3\t4\t5\t6\t7\t8\t9\n"); //overhead
        for (;row <= 9;row++) { //row increment
            System.out.print("\n" + row + "\t"); //new line
            for (column = 1;column <= row;column++) { //column display
                System.out.print((row * column) + "\t"); //display columnm
            }
        }
    }
}
