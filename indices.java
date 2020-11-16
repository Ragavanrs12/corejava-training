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
		char[] name=obj.next().toCharArray();
		System.out.println("enter the two indices to be displayed");
		int a=obj.nextInt();
		int b=obj.nextInt();
		for(int i=a;i<b;i++)
			System.out.print(name[i]);
		obj.close();
		
	}

}

