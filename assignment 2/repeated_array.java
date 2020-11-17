//1)Find top three repeated numbers in an array
import java.util.Arrays;
import java.util.Scanner;
import java.io.*; 
import java.util.*; 
  
class Pair { 
    int first, second; 
} 
public class repeated_array {
	  static void top3Repeated(int[] arr, int n) 
    { 
       if (n < 3) { 
            System.out.print("Invalid Input"); 
            return; 
        } 
  
          TreeMap<Integer, Integer> freq = new TreeMap<>(); 
        for (int i = 0; i < n; i++) 
            if (freq.containsKey(arr[i])) 
                freq.put(arr[i], 1 + freq.get(arr[i])); 
            else
                freq.put(arr[i], 1); 
  
         Pair x = new Pair(); 
        Pair y = new Pair(); 
        Pair z = new Pair(); 
        x.first = y.first = z.first = Integer.MIN_VALUE; 
  
        for (Map.Entry curr : freq.entrySet()) { 
                if (Integer.parseInt(String.valueOf(curr.getValue())) > x.first) { 
  
               
                z.first = y.first; 
                z.second = y.second; 
                y.first = x.first; 
                y.second = x.second; 
  
               
                x.first = Integer.parseInt(String.valueOf(curr.getValue())); 
                x.second = Integer.parseInt(String.valueOf(curr.getKey())); 
            } 
  
         
            else if (Integer.parseInt(String.valueOf(curr.getValue())) > y.first) { 
              
                z.first = y.first; 
                z.second = y.second; 
  
              
                y.first = Integer.parseInt(String.valueOf(curr.getValue())); 
                y.second = Integer.parseInt(String.valueOf(curr.getKey())); 
            } 
  
           
            else if (Integer.parseInt(String.valueOf(curr.getValue())) > z.first) { 
  
                
                z.first = Integer.parseInt(String.valueOf(curr.getValue())); 
                z.second = Integer.parseInt(String.valueOf(curr.getKey())); 
            } 
        } 
  
        System.out.print("Three largest elements are " + x.second + " "
                         + y.second + " " + z.second); 
    }
	public static void main(String args[]) 
    { Scanner obj=new Scanner(System.in);
    System.out.println("enter the number of element in array");
  int b=obj.nextInt();
        int[] arr = new int[b];
        for(int i=0;i<b;i++)
        	{
        		 arr[i]=obj.nextInt();
        	}
        int n = arr.length; 
        top3Repeated(arr, n); 
    } 

}
