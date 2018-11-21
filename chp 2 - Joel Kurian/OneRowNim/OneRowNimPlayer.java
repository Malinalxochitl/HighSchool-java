//user class, runs the main program using OneRowNim class
public class OneRowNimPlayer {
    public static void main(String[] args) {
        OneRowNim meh = new OneRowNim(21, 1);
        System.out.println("Player one shall go first");
        meh.takeThree(); //18 sticks left, p2 goes next
        meh.status();
        meh.takeThree(); //15 sticks left, p1 goes next
        meh.status();
        meh.takeThree(); //12 sticks left, p2 goes next
        meh.status();
        meh.takeThree(); //9 sticks left, p1 goes next
        meh.status();
        meh.takeTwo(); //7 sticks left, p2 goes next
        meh.status();
        meh.takeOne(); //6 sticks left, p1 goes next
        meh.status();
        meh.takeOne(); //5 sticks left, p2 goes next
        meh.status();
        meh.takeThree(); //2 sticks left, p1 goes next
        meh.status();
        meh.takeOne(); //1 stick left, p2 goes next
        meh.status();
        System.out.println("Player one has won the game.");
    }
}