//3) Using loop print Right Angle Pyramid in Java		
//
//Sample Output:
//      *  
//    * *  
//  * * *  
//* * * *
import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number of lines pyramid to be");
		int a=obj.nextInt();
		for(int i=1;i<=a;i++)
		{	for(int j=0;j<a-i;j++) {
				System.out.print("  ");
			}
			for(int s=0;s<i;s++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		
		}
	}

}

