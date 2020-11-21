//1.Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class
//named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed as
//parameters to its constructor.

public class Rectangle {
int length;
int breath;

	public Rectangle(int length, int breath) {
	super();
	this.length = length;
	this.breath = breath;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a=new Rectangle(4,5);
		Rectangle b=new Rectangle(5,8);
		
		System.out.println("area of rectangle (4,5) is "+a.Area());
		System.out.println("area of rectangle (5,8) is "+b.Area());
		
	}
	public int Area() {
		return length*breath;
	}

}
