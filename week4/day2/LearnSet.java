package week4.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		
		String s="saranya"; // going to print Unique elements
		
		//to convert the string to character
		char[] charArray = s.toCharArray();
		
		Set<Character> unique = new LinkedHashSet<Character>();
		Set<Character> duplicate = new LinkedHashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) 
		{
			boolean b=unique.add(charArray[i]); //true or false
			
			if(!b) 
			{
				duplicate.add(charArray[i]);
			}
		}
		System.out.println("Unique Values : "+unique);
		System.out.println("Duplicates :"+duplicate);

	}

}
