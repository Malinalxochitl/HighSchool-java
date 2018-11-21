public class NumberCruncher { //methods to be used by number cruncher
    private int lurd; //instance variable
    public NumberCruncher(int blargh) { //constructor
        lurd = blargh;
    }
    public int single() { //returns original
        return lurd;
    }
    public int duble() { //returns double
        return lurd * 2;
    }
    public int triple() { //returns triple
        return lurd * 3;
    }
    public int square() { //returns the square
        return lurd * lurd;
    }
    public int cube() { //returns the cube
        return lurd * lurd * lurd;
    }
}
