package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueValue {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3};
		arr=new int[] {4,5};
		System.out.println(arr[1]);
		
		
		String companyName = "google";
		char[] charArray = companyName.toCharArray();
		
		Set<Character> unique = new LinkedHashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) 
		{
			unique.add(charArray[i]);
			
		}
		System.out.println("Unique Values : "+unique);
		
		



	}

}
