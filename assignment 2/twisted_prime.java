//3)A number is said to be twisted prime if it is a prime number and reverse of the number is also a prime number.
import java.util.Scanner;
import java.lang.Math;

public class twisted_prime {

public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
System.out.println("enter the number to be checked");
double a=obj.nextDouble();
int j=0;
int s=(int)a;
while(s!=0) {
	j=j*10+s%10;
	s/=10;
}
double b=(Math.sqrt(a));		// to reduce number of iterations in for loop
double c=(Math.sqrt(j));
if(a==1 || a==2 || (a%2)==0 ||j==1 || j==2 || (j%2)==0) {
	System.out.println("not a twisted prime");
	return ;
}
for(double i=2;i<=b;i++) {
	if((b%i)==0 || (j%i)==0) {
		System.out.println("not a twisted prime");
		return ;
	}
}
System.out.println("it is a twisted prime");
obj.close();

	
	}
	

}
