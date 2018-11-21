
/*
Student: Joel Kurian
Period: 6
Class: C++/JAVA A
Teacher: Mrs.Snelson
School: Randolph High School
Compiler: Blue Jay
Chapter: 1
Page: 58 #18
Description: Displays rectangles area and perimeter
 */
public class Rectangle { //represents a rectangle
    
    public static void main(String[] args) { //displays area and perimeter of rectangle
        int length = 32; //measurements
        int width = 20;
        int area = (length * width); //finds area
        int perimeter = (length * 2) + (width * 2); //finds perimeter
        System.out.print("The area is ");
        System.out.println(area);
        System.out.print("The perimeter is "); //console display
        System.out.println(perimeter);
   }
}
