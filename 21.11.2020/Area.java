//2.Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
//First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method
//named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
import java.util.Scanner;
public class Area {
static Scanner obj=new Scanner(System.in);
static int length=obj.nextInt();
static int breath=obj.nextInt();
	public void setDim(int length, int breath) {
	this.length = length;
	this.breath = breath;
}
	public int getArea() {
		return length*breath;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a=new Area();
		a.setDim(length, breath);	
		System.out.println("the area is "+a.getArea());
		
	}
	

}
