public class Rectangle {//represents a rectangle
    private int length; //measurements
    private int width;
    public Rectangle(int length1, int width1)
    {
        length = length1; //retrieve measurements
        width = width1;
    }
    public int givePerimeter() {
        return length + width; //gives perimeter
    }
    public int giveArea () {
        return length * width; //gives area
    }
}
