//2) Give a string and two indices print a substring consisting of all characters in the inclusive range from and to.
//
//Sample Input:
//Helloworld
//3 7		
//
//Sample Output:
//lowo

import java.util.Scanner;
public class indices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the string");
		String name=obj.nextLine();
		System.out.println("enter the two indices to be displayed");
		int start=obj.nextInt();//starting indices
		int end=obj.nextInt();//ending indices
			System.out.print(name.substring(start,end));
		obj.close();
	}

}
