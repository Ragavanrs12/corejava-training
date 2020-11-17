//4)Given a string, your task is to reverse only the vowels of string.
 import java.util.Scanner;
public class reverse_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		String a=obj.next();
		char z;
		int i=a.length();
		 byte[] result = new byte[a.length()];
		for(int j=0,k=i-1;j<=k;j++,k--) {
			
			
			if(((a.charAt(j)=='a')||(a.charAt(j)=='e')||(a.charAt(j)=='i')||(a.charAt(j)=='o')||(a.charAt(j)=='u')||(a.charAt(j)=='A')||(a.charAt(j)=='E')||(a.charAt(j)=='I')||(a.charAt(j)=='O')||(a.charAt(j)=='U')) && ((a.charAt(k)=='a')||(a.charAt(k)=='e')||(a.charAt(k)=='i')||(a.charAt(k)=='o')||(a.charAt(k)=='u')||(a.charAt(k)=='A')||(a.charAt(k)=='E')||(a.charAt(k)=='I')||(a.charAt(k)=='O')||(a.charAt(k)=='U'))) {
				result[j]=(byte)a.charAt(k);
				result[k]=(byte)a.charAt(j);
			}
			else
			{
				result[j]=(byte)a.charAt(j);
				result[k]=(byte)a.charAt(k);
			}
			
		}

		
	
		System.out.println(new String(result));
		
		obj.close();
	}

}
