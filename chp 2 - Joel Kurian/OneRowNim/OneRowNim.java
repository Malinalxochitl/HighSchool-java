//This class will contain all the methods to be used by the user
public class OneRowNim {
    private int sticks; //instance variables
    private int player;
    public OneRowNim(int x, int y) { //constructor
        sticks = x;
        player = y;
    }
    public void takeOne(){ //removes one stick
        sticks = sticks - 1;
        player = 3 - player;
        System.out.println("One stick taken.");
    }
    public void takeTwo() { //removes 2 sticks
        sticks = sticks - 2;
        player = 3 - player;
        System.out.println("Two sticks taken.");
    }
    public void takeThree() { //removes 3 sticks
        sticks = sticks - 3 ;
        player = 3 - player ;
        System.out.println("Three sticks taken.");
    }
    public void status() { //gives a report on the status
        System.out.println("There are " + sticks + " sticks left." ) ;
        System.out.println("Next turn will be by player " + player + ".") ;
    }
}
